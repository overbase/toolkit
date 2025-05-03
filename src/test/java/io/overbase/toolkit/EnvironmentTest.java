package io.overbase.toolkit;

import org.junit.jupiter.api.Test;

import java.nio.file.Paths;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EnvironmentTest {
    @Test
    public void initTest() {
        Environment.init();
        assertEquals(System.getProperty("user.dir"), Environment.getCurrentDir());
        String userHome = System.getProperty("user.home");
        assertEquals(userHome, Environment.getUserHomeDir());
        assertEquals(Paths.get(userHome + "/" + Environment.MY_CONFIG), Environment.getMyConfigPath());
    }
}
