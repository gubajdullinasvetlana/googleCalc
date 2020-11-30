package tests;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Assertions.assertEquals;
import pages.GoogleCalc;


public class googleTests {
    private static WebDriver driver;
    private static String baseUrl;
    private static GoogleCalc googleCalc;

    @BeforeEach
    public void setUp(){
        System.setProperty("webdriver.chrome.driver","C:\\webdrivers\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        driver = new ChromeDriver(options);
        baseUrl = "http://www.google.ru/";
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("http://www.google.ru/");
        googleCalc = new GoogleCalc(driver);

    }

    @Test
    @DisplayName("Проверка операций с целыми числами")
    public void testKeys1() {
        driver.findElement(By.name("q")).sendKeys("Calc");
        driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
       // driver.findElement(By.xpath("//div[@id='rso']/div/div/div/div/div/div[3]/div/table[2]/tbody/tr/td/div/div")).click();
   //     driver.findElement(By.xpath("//div[@id='rso']/div/div/div/div/div/div[3]/div/table[2]/tbody/tr[4]/td/div/div")).click();
     //   driver.findElement(By.xpath("//div[@id='rso']/div/div/div/div/div/div[3]/div/table[2]/tbody/tr[5]/td[4]/div/div")).click();
    //    driver.findElement(By.xpath("//div[@id='rso']/div/div/div/div/div/div[3]/div/table[2]/tbody/tr[4]/td[2]/div/div")).click();
   //     driver.findElement(By.xpath("//div[@id='rso']/div/div/div/div/div/div[3]/div/table[2]/tbody/tr/td[2]/div/div")).click();
   //     driver.findElement(By.xpath("//div[@id='rso']/div/div/div/div/div/div[3]/div/table[2]/tbody/tr[3]/td[4]/div/div")).click();
   //     driver.findElement(By.xpath("//div[@id='rso']/div/div/div/div/div/div[3]/div/table[2]/tbody/tr[4]/td[3]/div/div")).click();
    //    driver.findElement(By.xpath("//div[@id='rso']/div/div/div/div/div/div[3]/div/table[2]/tbody/tr[4]/td[4]/div/div")).click();
   //     driver.findElement(By.xpath("//div[@id='rso']/div/div/div/div/div/div[3]/div/table[2]/tbody/tr[3]/td/div/div")).click();
   //     driver.findElement(By.xpath("//div[@id='rso']/div/div/div/div/div/div[3]/div/table[2]/tbody/tr[5]/td/div/div")).click();
    //    driver.findElement(By.xpath("//div[@id='rso']/div/div/div/div/div/div[3]/div/table[2]/tbody/tr[2]/td[4]/div/div")).click();
    //    driver.findElement(By.xpath("//div[@id='rso']/div/div/div/div/div/div[3]/div/table[2]/tbody/tr[3]/td[2]/div/div")).click();
  //      driver.findElement(By.xpath("//div[@id='rso']/div/div/div/div/div/div[3]/div/table[2]/tbody/tr[5]/td[3]/div/div")).click();
        googleCalc.googleCalcTestCase1();
        assertEquals("1",driver.findElement(By.cssSelector("span[jsname='VssY5c']")).getText());

    }

    @Test
    @DisplayName("Проверка деления на ноль")
    public void testKeys2(){
        driver.findElement(By.name("q")).sendKeys("Calc");
        driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
        //driver.findElement(By.xpath("//div[@id='rso']/div/div/div/div/div/div[3]/div/table[2]/tbody/tr[3]/td[3]/div/div")).click();
      //  driver.findElement(By.xpath("//div[@id='rso']/div/div/div/div/div/div[3]/div/table[2]/tbody/tr[2]/td[4]/div/div")).click();
     //   driver.findElement(By.xpath("//div[@id='rso']/div/div/div/div/div/div[3]/div/table[2]/tbody/tr[5]/td/div/div")).click();
    //    driver.findElement(By.xpath("//div[@id='rso']/div/div/div/div/div/div[3]/div/table[2]/tbody/tr[5]/td[3]/div/div")).click();
       googleCalc.googleCalcTestCase2();
        assertEquals("Infinity",driver.findElement(By.cssSelector("span[jsname='VssY5c']")).getText());

    }
    @Test
    @DisplayName("Проверка ошибки при отсутствии значения")
    public void testKeys3() {
        driver.findElement(By.name("q")).sendKeys("Calc");
        driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
      //  driver.findElement(By.xpath("//div[@id='rso']/div/div/div/div/div/div[3]/div/table/tbody/tr[2]/td[2]/div/div")).click();
     //   driver.findElement(By.xpath("//div[@id='rso']/div/div/div/div/div/div[3]/div/table[2]/tbody/tr/td[2]/div/div")).click();
     //   driver.findElement(By.xpath("//div[@id='rso']/div/div/div/div/div/div[3]/div/table[2]/tbody/tr[5]/td[3]/div/div")).click();
       googleCalc.googleCalcTestCase3();
        assertEquals("Error",driver.findElement(By.cssSelector("span[jsname='VssY5c']")).getText());
            }




    @AfterAll
    public static void tearDown()  {
        driver.quit();
           }

}