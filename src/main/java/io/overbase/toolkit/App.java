package io.overbase.toolkit;

/**
 * OverBase Toolkit Application Main Class
 */
public class App
{
    public static void main(String[] args)
    {
        System.out.println("OverBase Toolkit!");
        Environment.init();
        System.out.println("Current working directory: " + Environment.getCurrentDir());
        System.out.println("User home directory: " + Environment.getUserHomeDir());
    }
}
