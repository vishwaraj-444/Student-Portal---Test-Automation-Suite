package com.mathworks.tests;

import org.junit.jupiter.api.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {
    private WebDriver driver;

    @BeforeEach
    public void setUp() {
        driver = new ChromeDriver();
        driver.get("http://localhost:3000/login");
    }

    @Test
    public void testValidLogin() {
        driver.findElement(By.name("username")).sendKeys("testuser");
        driver.findElement(By.name("password")).sendKeys("password123");
        driver.findElement(By.tagName("button")).click();
        Assertions.assertTrue(driver.getPageSource().contains("Welcome, testuser"));
    }

    @AfterEach
    public void tearDown() {
        driver.quit();
    }
}
