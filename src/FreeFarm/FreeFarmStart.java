package FreeFarm;

import java.util.concurrent.TimeUnit;

import FreeFarmPages.LoginPage;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class FreeFarmStart {

    public static WebDriver driver = null;

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "D:\\Programowanie\\Java\\chromedriver_win32\\chromedriver.exe");

        ChromeDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        driver.get("https://www.wolnifarmerzy.pl/");

        LoginPage.loginUsername(driver).sendKeys("");
        LoginPage.loginPassword(driver).sendKeys("");
        new Select (LoginPage.serverNumber(driver)).selectByIndex(10);
        LoginPage.loginButton(driver).click();


    }
}
