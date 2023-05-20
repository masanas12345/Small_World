package stepDefinitions;

import Pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class CommonSteps {

        private WebDriver driver;
        private LoginPage login;

        @Given("I am on the login page")
        public void i_am_on_the_login_page() {
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\MAS\\Documents\\chromedriver_win32\\chromedriver.exe");
            driver = new ChromeDriver();
            driver.get("https://www.saucedemo.com/");
        }
    @When("I enter my username and password")
    public void i_enter_my_username_and_password() {
        login = new LoginPage(driver);

        login.enterUsername();
        login.enterPassword();

      //  driver.findElement(By.id("user-name")).sendKeys("standard_user");
       // driver.findElement(By.id("password")).sendKeys("secret_sauce");
    }
    @And("I click the login button")
    public void i_click_the_login_button() throws InterruptedException {
        login.clickLogin();
            //driver.findElement(By.id("login-button")).click();
            Thread.sleep(2000);
    }
    @Then("I should be logged in")
    public void i_should_be_logged_in() throws InterruptedException {
        // Implement code to verify successful login
        System.out.println("Login Successfully");

        String title = driver.getTitle();
        System.out.println(title);
        Thread.sleep(2000);
    }

    @Given("I am logged in")
    public void i_am_logged_in() throws InterruptedException {
        String text = driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[1]/div[2]/div")).getText();
        if(text.contains("Swag Labs"))
           System.out.println("I am on the landing page");

        Thread.sleep(2000);
    }
    @When("I click on the 3dotted bar")
    public void i_click_to_3dotted_bar() throws InterruptedException {
            login.clickMenu();
        //driver.findElement(By.xpath("//*[@id=\"react-burger-menu-btn\"]")).click();
        Thread.sleep(2000);
    }
    @And("I click on the logout button")
    public void i_click_to_logout_button(){

            login.clickLogout();
      //  driver.findElement(By.xpath("//*[@id=\"logout_sidebar_link\"]")).click();
    }

    @Then("I should be logged out")
    public void i_should_be_logged_out() {
        // Implementation to verify successful logout
        String url = driver.getCurrentUrl();
        //System.out.println(url);
        if(url.contains("www.saucedemo.com/"))
            System.out.println("Logout Successfully");

        driver.quit();
    }

}



