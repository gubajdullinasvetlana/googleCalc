package tests;
//import java.util.regex.Pattern;

import org.junit.jupiter.api.*;
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


    @BeforeEach
    public void setUp(){
        System.setProperty("webdriver.chrome.driver","C:\\webdrivers\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        driver = new ChromeDriver(options);
        baseUrl = "http://www.google.ru/";
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("http://www.google.ru/");
    }

    @Test
    @DisplayName("Проверка операций с целыми числами")
    public void testKeys1() {
        driver.findElement(By.name("q")).sendKeys("Calc");
        driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
        driver.findElement(By.xpath("//div[@id='rso']/div/div/div/div/div/div[3]/div/table[2]/tbody/tr/td/div/div")).click();
        driver.findElement(By.xpath("//div[@id='rso']/div/div/div/div/div/div[3]/div/table[2]/tbody/tr[4]/td/div/div")).click();
        driver.findElement(By.xpath("//div[@id='rso']/div/div/div/div/div/div[3]/div/table[2]/tbody/tr[5]/td[4]/div/div")).click();
        driver.findElement(By.xpath("//div[@id='rso']/div/div/div/div/div/div[3]/div/table[2]/tbody/tr[4]/td[2]/div/div")).click();
        driver.findElement(By.xpath("//div[@id='rso']/div/div/div/div/div/div[3]/div/table[2]/tbody/tr/td[2]/div/div")).click();
        driver.findElement(By.xpath("//div[@id='rso']/div/div/div/div/div/div[3]/div/table[2]/tbody/tr[3]/td[4]/div/div")).click();
        driver.findElement(By.xpath("//div[@id='rso']/div/div/div/div/div/div[3]/div/table[2]/tbody/tr[4]/td[3]/div/div")).click();
        driver.findElement(By.xpath("//div[@id='rso']/div/div/div/div/div/div[3]/div/table[2]/tbody/tr[4]/td[4]/div/div")).click();
        driver.findElement(By.xpath("//div[@id='rso']/div/div/div/div/div/div[3]/div/table[2]/tbody/tr[3]/td/div/div")).click();
        driver.findElement(By.xpath("//div[@id='rso']/div/div/div/div/div/div[3]/div/table[2]/tbody/tr[5]/td/div/div")).click();
        driver.findElement(By.xpath("//div[@id='rso']/div/div/div/div/div/div[3]/div/table[2]/tbody/tr[2]/td[4]/div/div")).click();
        driver.findElement(By.xpath("//div[@id='rso']/div/div/div/div/div/div[3]/div/table[2]/tbody/tr[3]/td[2]/div/div")).click();
        driver.findElement(By.xpath("//div[@id='rso']/div/div/div/div/div/div[3]/div/table[2]/tbody/tr[5]/td[3]/div/div")).click();
        assertEquals("1",driver.findElement(By.cssSelector("span[jsname='VssY5c']")).getText());

    }

    @Test
    @DisplayName("Проверка деления на ноль")
    public void testKeys2(){
        driver.findElement(By.name("q")).sendKeys("Calc");
        driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
        driver.findElement(By.xpath("//div[@id='rso']/div/div/div/div/div/div[3]/div/table[2]/tbody/tr[3]/td[3]/div/div")).click();
        driver.findElement(By.xpath("//div[@id='rso']/div/div/div/div/div/div[3]/div/table[2]/tbody/tr[2]/td[4]/div/div")).click();
        driver.findElement(By.xpath("//div[@id='rso']/div/div/div/div/div/div[3]/div/table[2]/tbody/tr[5]/td/div/div")).click();
        driver.findElement(By.xpath("//div[@id='rso']/div/div/div/div/div/div[3]/div/table[2]/tbody/tr[5]/td[3]/div/div")).click();
        assertEquals("Infinity",driver.findElement(By.cssSelector("span[jsname='VssY5c']")).getText());

    }
    @Test
    @DisplayName("Проверка ошибки при отсутствии значения")
    public void testKeys3() {
        driver.findElement(By.name("q")).sendKeys("Calc");
        driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
        driver.findElement(By.xpath("//div[@id='rso']/div/div/div/div/div/div[3]/div/table/tbody/tr[2]/td[2]/div/div")).click();
        driver.findElement(By.xpath("//div[@id='rso']/div/div/div/div/div/div[3]/div/table[2]/tbody/tr/td[2]/div/div")).click();
        driver.findElement(By.xpath("//div[@id='rso']/div/div/div/div/div/div[3]/div/table[2]/tbody/tr[5]/td[3]/div/div")).click();
        assertEquals("Error",driver.findElement(By.cssSelector("span[jsname='VssY5c']")).getText());
            }




    @AfterAll
    public static void tearDown()  {
        driver.quit();
           }

}