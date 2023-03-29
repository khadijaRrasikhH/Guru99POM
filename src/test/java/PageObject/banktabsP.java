package PageObject;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import java.util.List;


public class banktabsP  {
    WebDriver driver;
    @FindBy(xpath = "/html/body/div[3]/div/ul")
    public List<WebElement> BankTab;

public banktabsP(){
    PageFactory.initElements(driver ,this);
}
}
