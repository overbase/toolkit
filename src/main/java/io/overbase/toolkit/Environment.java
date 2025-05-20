package io.overbase.toolkit;

import java.nio.file.Path;
import java.nio.file.Paths;

class Environment {

    public static final String MY_CONFIG_NAME = ".my.cnf";

    private static String currentDir;

    private static String userHomeDir;

    private static Path myConfigPath;

    private static MyConfig myConfig;

    public static void init() {
        currentDir = System.getProperty("user.dir");
        userHomeDir = System.getProperty("user.home");
        myConfigPath = Paths.get(userHomeDir + "/" + MY_CONFIG_NAME);
        myConfig = new MyConfig(myConfigPath);
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

    public static MyConfig getMyConfig() {
        return myConfig;
    }
}
