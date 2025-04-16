package com.mathworks.tests;

import org.junit.jupiter.api.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class SessionTimeoutTest {
    private WebDriver driver;

    @BeforeEach
    public void setUp() {
        driver = new ChromeDriver();
        driver.get("http://localhost:3000/dashboard");
    }

    @Test
    public void testSessionTimeout() throws InterruptedException {
        Thread.sleep(310000); // simulate inactivity for 5+ minutes
        driver.navigate().refresh();
        Assertions.assertTrue(driver.getPageSource().contains("Session expired"));
    }

    @AfterEach
    public void tearDown() {
        driver.quit();
    }
}
