package FreeFarm;

import java.util.concurrent.TimeUnit;

import FreeFarmPages.FarmPage;
import FreeFarmPages.LoginPage;
import FreeFarmPages.MainFarmPage;
import appModule.CropAction;
import appModule.LoginAction;
import appModule.PlantAction;
import com.sun.scenario.effect.Crop;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class FreeFarmStart {

    public static WebDriver driver = null;

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "D:\\Programowanie\\Java\\chromedriver_win32\\chromedriver.exe");

        ChromeDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        driver.get(LoginCredentials.website);

        LoginAction.Execute(driver);
        MainFarmPage.farmPosition1(driver).click();
        CropAction.Execute(driver);
        //PlantAction.Execute(driver);

    }
}
