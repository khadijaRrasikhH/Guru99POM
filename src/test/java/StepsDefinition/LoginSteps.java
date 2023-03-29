package StepsDefinition;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginSteps{

                WebDriver driver;

                @Given("open the the page")
                public void open_the_the_page() {
                        WebDriverManager.chromedriver().setup();
                        driver = new ChromeDriver();
                        driver.get("https://demo.guru99.com/V4/");
                }

                @When("user pass valid UserName and password")
                public void user_pass_valid_user_name_and_password() {
                        driver.findElement(By.xpath("//input[@name='uid']")).sendKeys("mngr471099");
                        driver.findElement(By.xpath("//input[@name ='password']")).sendKeys("jytadEh");

                }

                @And("Clicks on login button")
                public void clicks_on_login_button() {
                        driver.findElement(By.xpath("//input[@name='btnLogin']")).click();

                }

                @Then("user user is successfully logged in")
                public void user_user_is_successfully_logged_in() {
                        String expectedTitle = "Guru99 Bank Manager HomePage";
                        String actualTitle = driver.getTitle();
                        Assert.assertEquals(expectedTitle,actualTitle );
                        if (expectedTitle.equals(actualTitle )) {
                                System.out.println("Test is final and title is same");
                        } else {
                                System.out.println("Test is failed");
                        }
                }}

