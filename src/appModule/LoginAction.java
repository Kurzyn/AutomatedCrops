package appModule;

import FreeFarm.LoginCredentials;
import FreeFarmPages.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class LoginAction {

    public static void Execute(WebDriver driver){
        LoginPage.loginUsername(driver).sendKeys(LoginCredentials.loginName());
        LoginPage.loginPassword(driver).sendKeys(LoginCredentials.secretName());
        new Select(LoginPage.serverNumber(driver)).selectByIndex(LoginCredentials.serverIndexNumber);
        LoginPage.loginButton(driver).click();
    }
}
