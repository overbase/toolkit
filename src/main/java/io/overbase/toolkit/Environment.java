package io.overbase.toolkit;

class Environment {

    private static String currentDir;

    private static String userHomeDir; 

    public static void init() {
        currentDir = System.getProperty("user.dir");
        userHomeDir = System.getProperty("user.home");
    }

    public static String getCurrentDir() {
        return currentDir;
    }

    public static String getUserHomeDir() {
        return userHomeDir;
    }

}
