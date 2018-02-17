package FreeFarmPages;

import org.openqa.selenium.*;
import org.openqa.selenium.WebElement;

public class LoginPage {

    private static WebElement element = null;

    public static WebElement serverNumber(WebDriver driver){
        element = driver.findElement(By.id("loginserver"));
        return element;
    }

    public static WebElement loginUsername(WebDriver driver){
        element = driver.findElement(By.id("loginusername"));
        return element;
    }

    public static WebElement loginPassword(WebDriver driver){
        element = driver.findElement(By.id("loginpassword"));
        return element;
    }

    public static WebElement loginButton(WebDriver driver){
        element = driver.findElement(By.id("loginbutton"));
        return element;
    }


}
