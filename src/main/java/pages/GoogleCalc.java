package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.openqa.selenium.support.PageFactory.initElements;

public class GoogleCalc {

    @FindBy (xpath ="//div[@id='rso']/div/div/div/div/div/div[3]/div/table[2]/tbody/tr/td/div/div")
    private WebElement q1;
    @FindBy (xpath ="//div[@id='rso']/div/div/div/div/div/div[3]/div/table[2]/tbody/tr[4]/td/div/div")
    private WebElement q2;
    @FindBy (xpath ="//div[@id='rso']/div/div/div/div/div/div[3]/div/table[2]/tbody/tr[5]/td[4]/div/div")
    private WebElement q3;
    @FindBy (xpath ="//div[@id='rso']/div/div/div/div/div/div[3]/div/table[2]/tbody/tr[4]/td[2]/div/div")
    private WebElement q4;
    @FindBy (xpath ="//div[@id='rso']/div/div/div/div/div/div[3]/div/table[2]/tbody/tr/td[2]/div/div")
    private WebElement q5;
    @FindBy (xpath ="//div[@id='rso']/div/div/div/div/div/div[3]/div/table[2]/tbody/tr[3]/td[4]/div/div")
    private WebElement q6;
    @FindBy (xpath ="//div[@id='rso']/div/div/div/div/div/div[3]/div/table[2]/tbody/tr[4]/td[3]/div/div")
    private WebElement q7;
    @FindBy (xpath ="//div[@id='rso']/div/div/div/div/div/div[3]/div/table[2]/tbody/tr[4]/td[4]/div/div")
    private WebElement q8;
    @FindBy (xpath ="//div[@id='rso']/div/div/div/div/div/div[3]/div/table[2]/tbody/tr[3]/td/div/div")
    private WebElement q9;
    @FindBy (xpath ="//div[@id='rso']/div/div/div/div/div/div[3]/div/table[2]/tbody/tr[5]/td/div/div")
    private WebElement q10;
    @FindBy (xpath ="//div[@id='rso']/div/div/div/div/div/div[3]/div/table[2]/tbody/tr[2]/td[4]/div/div")
    private WebElement q11;
    @FindBy (xpath ="//div[@id='rso']/div/div/div/div/div/div[3]/div/table[2]/tbody/tr[3]/td[2]/div/div")
    private WebElement q12;
    @FindBy (xpath ="//div[@id='rso']/div/div/div/div/div/div[3]/div/table[2]/tbody/tr[5]/td[3]/div/div")
    private WebElement q13;


        @FindBy (xpath ="//div[@id='rso']/div/div/div/div/div/div[3]/div/table[2]/tbody/tr[3]/td[3]/div/div")
        private WebElement p1;
        @FindBy (xpath ="//div[@id='rso']/div/div/div/div/div/div[3]/div/table[2]/tbody/tr[2]/td[4]/div/div")
        private WebElement p2;
        @FindBy (xpath ="//div[@id='rso']/div/div/div/div/div/div[3]/div/table[2]/tbody/tr[5]/td/div/div")
        private WebElement p3;
        @FindBy (xpath ="//div[@id='rso']/div/div/div/div/div/div[3]/div/table[2]/tbody/tr[5]/td[3]/div/div")
        private WebElement p4;

    @FindBy (xpath ="//div[@id='rso']/div/div/div/div/div/div[3]/div/table/tbody/tr[2]/td[2]/div/div")
    private WebElement a1;
    @FindBy (xpath ="//div[@id='rso']/div/div/div/div/div/div[3]/div/table[2]/tbody/tr/td[2]/div/div")
    private WebElement a2;
    @FindBy (xpath ="//div[@id='rso']/div/div/div/div/div/div[3]/div/table[2]/tbody/tr[5]/td[3]/div/div")
    private WebElement a3;



    public GoogleCalc(WebDriver driver){
        initElements(driver, this);

    }
    public void googleCalcTestCase1(){
        q1.click();
        q2.click();
        q3.click();
        q4.click();
        q5.click();
        q6.click();
        q7.click();
        q8.click();
        q9.click();
        q10.click();
        q11.click();
        q12.click();
        q13.click();

    }
        public void googleCalcTestCase2(){
            p1.click();
            p2.click();
            p3.click();
            p4.click();
        }

    public void googleCalcTestCase3(){
        a1.click();
        a2.click();
        a3.click();

    }
}
