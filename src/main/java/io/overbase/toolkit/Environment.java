package io.overbase.toolkit;

import java.nio.file.Path;
import java.nio.file.Paths;

class Environment {

    private static final String MY_CONFIG = ".my.cnf";

    private static String currentDir;

    private static String userHomeDir;

    private static Path myConfigPath;

    public static void init() {
        currentDir = System.getProperty("user.dir");
        userHomeDir = System.getProperty("user.home");
        myConfigPath = Paths.get(userHomeDir + "/" + MY_CONFIG);
    }

    public static String getCurrentDir() {
        return currentDir;
    }

    public static String getUserHomeDir() {
        return userHomeDir;
    }

    public static Path getMyConfigPath() {
        return myConfigPath;
    }
}
