package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class addnewCustomerP  {
    WebDriver driver;
    @FindBy(xpath ="//*[@class='menusubnav']/li[5]")
    public WebElement dNewCustomerB;
    @FindBy(css = "input[name='cusid']")
    public WebElement CustomerIDNum;
    @FindBy(xpath ="//Select[@name='selaccount']")
    public WebElement selaccount;
    @FindBy(xpath ="//input[@name='inideposit']")
    public WebElement deposit;
    @FindBy(xpath = "//input[@name='button2']")
    public WebElement SubBton;

    public addnewCustomerP (){
        PageFactory.initElements(driver,this);}
}
