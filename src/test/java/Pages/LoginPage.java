package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    WebDriver driver;

    By txt_username = By.id("user-name");
    By txt_password = By.id("password");
    By btn_login = By.id("login-button");
    By menu = By.id("react-burger-menu-btn");
    By logout = By.id("logout_sidebar_link");

    public LoginPage(WebDriver driver){
        this.driver = driver;
    }

    public void enterUsername (){
        driver.findElement(txt_username).sendKeys("standard_user");
    }
    public void enterPassword(){
        driver.findElement(txt_password).sendKeys("secret_sauce");
    }
    public void clickLogin(){
        driver.findElement(btn_login).click();
    }

    public void clickMenu(){
        driver.findElement(menu).click();
    }

    public void clickLogout(){
        driver.findElement(logout).click();
    }


}
