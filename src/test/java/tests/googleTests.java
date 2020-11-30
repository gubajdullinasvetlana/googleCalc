package tests;
//import java.util.regex.Pattern;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
//import org.junit.*;
//import static org.junit.Assert.*;
//import static org.hamcrest.CoreMatchers.*;

public class googleTests {
    private static WebDriver driver;
    private static String baseUrl;
    private boolean acceptNextAlert = true;
    private StringBuffer verificationErrors = new StringBuffer();

    @BeforeAll
    public static void setUp(){
        System.setProperty("webdriver.chrome.driver","C:\\webdrivers\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        driver = new ChromeDriver(options);
        baseUrl = "http://www.google.ru/";
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("http://www.google.ru/");
    }

    @Test
    @DisplayName("Проверка деления на ноль")
    public void testKeys2(){
        driver.findElement(By.name("q")).click();
        driver.findElement(By.name("q")).clear();
        driver.findElement(By.name("q")).sendKeys("Calc");
        driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
        driver.findElement(By.xpath("//div[@id='rso']/div/div/div/div/div/div[3]/div/table[2]/tbody/tr[3]/td[3]/div/div")).click();
        driver.findElement(By.xpath("//div[@id='rso']/div/div/div/div/div/div[3]/div/table[2]/tbody/tr[2]/td[4]/div/div")).click();
        driver.findElement(By.xpath("//div[@id='rso']/div/div/div/div/div/div[3]/div/table[2]/tbody/tr[5]/td/div/div")).click();
        driver.findElement(By.xpath("//div[@id='rso']/div/div/div/div/div/div[3]/div/table[2]/tbody/tr[5]/td[3]/div/div")).click();
        assertEquals("Infinity",driver.findElement(By.cssSelector("span[jsname='VssY5c']")).getText());
    }

    @AfterAll
    public static void tearDown()  {
        driver.quit();
           }

}