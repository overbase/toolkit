package io.overbase.toolkit;

/**
 * OverBase Toolkit Application Main Class
 */
public class App
{
    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public static void main(String[] args) {
        clearScreen();
        System.out.println("OverBase Toolkit!");
        Environment.init();
        System.out.println("Current working directory: " + Environment.getCurrentDir());
        System.out.println("User home directory: " + Environment.getUserHomeDir());
        System.out.println("My config path: " + Environment.getMyConfigPath());
        System.out.println("My config exists: " + Environment.getMyConfigPath().toFile().exists());
        System.out.println("My config host: " + Environment.getMyConfig().getValue("client", "host"));
    }
}
