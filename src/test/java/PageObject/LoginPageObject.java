package PageObject;



import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class LoginPageObject  {

    @FindBy(xpath = "/html/body/form/table/tbody/tr[1]/td[2]/input")
    public WebElement userName;

    @FindBy(xpath = "//input[@name ='password']")
    public WebElement password;

    @FindBy(xpath = "//input[@type='submit']")
    public WebElement loginBtn;

    public LoginPageObject() {


    }
    }





