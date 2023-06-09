package PageObject;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class addCustomer  {
    WebDriver driver;
    @FindBy(linkText = "New Customer")
    public WebElement newCustomer;

    @FindBy(xpath = "//input[@name='name']")
    public WebElement FiledName;

    @FindBy(xpath = "//input[@value='f']")
    public WebElement redioBton;

    @FindBy(id = "dob")
    public WebElement calenderdate;

    @FindBy(xpath = "//*[@name='addr']")
    public WebElement addressBox;

    @FindBy(xpath = "//*[@name='city']")
    public WebElement City;

    @FindBy(xpath = "//*[@name='state']")
    public WebElement State;

    @FindBy(xpath = "//*[@name='pinno']")
    public WebElement pin;

    @FindBy(xpath = "//*[@name='telephoneno']")
    public WebElement Telephone;

    @FindBy(xpath = "//*[@name='emailid']")
    public WebElement email;

    @FindBy(xpath = "//*[@name='password']")
    public WebElement EmailPasswrod;

    @FindBy(xpath = "//input[@name='sub']")
    public WebElement subBTN;

    public addCustomer() {
        PageFactory.initElements(driver, this);


    }}