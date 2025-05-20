package io.overbase.toolkit;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.Map;

public class MyConfig {

    private final Map<String, Map<String, String>> configuration = new HashMap<>();

    public MyConfig(Path myConfigPath) {
        try (BufferedReader reader = Files.newBufferedReader(myConfigPath)) {
            String section = "";
            String line;
            while ((line = reader.readLine()) != null) {
                line = line.trim();
                if (line.isEmpty() || line.startsWith("#") || line.startsWith(";")) continue;
                if (line.startsWith("[") && line.endsWith("]")) {
                    section = line.substring(1, line.length() - 1).trim();
                    configuration.putIfAbsent(section, new HashMap<>());
                } else {
                    int idx = line.indexOf('=');
                    if (idx > 0) {
                        String key = line.substring(0, idx).trim();
                        String value = line.substring(idx + 1).trim();
                        configuration.computeIfAbsent(section, k -> new HashMap<>()).put(key, value);
                    }
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public String getValue(String section, String key) {
        Map<String, String> options = configuration.get(section);
        return options != null ? options.get(key) : null;
    }
}
