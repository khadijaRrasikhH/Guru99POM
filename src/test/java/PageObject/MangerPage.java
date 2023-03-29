package PageObject;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class MangerPage{
    WebDriver driver;
    @FindBy(xpath = " //* [text()='Manager']")
    public WebElement ManagerPage;

    @FindBy(xpath = "//tr[@class='heading3']/td[1]")
    public WebElement ManagerID;
    public MangerPage( ) {

        PageFactory.initElements(driver, this);

    }}

