package io.overbase.toolkit;

class Environment {

    private static final String MY_CONFIG = ".my.cnf";

    private static String currentDir;

    private static String userHomeDir;

    private static String myConfigPath;

    public static void init() {
        currentDir = System.getProperty("user.dir");
        userHomeDir = System.getProperty("user.home");
        myConfigPath = userHomeDir + "/" + MY_CONFIG;
    }

    public static String getCurrentDir() {
        return currentDir;
    }

    public static String getUserHomeDir() {
        return userHomeDir;
    }

    public static String getMyConfigPath() {
        return myConfigPath;
    }
}
