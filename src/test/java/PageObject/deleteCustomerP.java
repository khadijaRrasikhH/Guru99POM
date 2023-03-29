package PageObject;

import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class deleteCustomerP {
    WebDriver driver;
   @FindBy (xpath = "//*[@class='menusubnav']/li[4]")
    public WebElement deleteCustomerF;
   @FindBy(css = "input[name='cusid']")
    public WebElement CustomerIDNum;
   @FindBy(xpath = "//input[@name='AccSubmit']")
    public WebElement SubBton;

   public deleteCustomerP (){
   PageFactory.initElements(driver,this);}
}
