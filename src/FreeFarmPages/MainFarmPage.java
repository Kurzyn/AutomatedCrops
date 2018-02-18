package FreeFarmPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MainFarmPage {
    private static WebElement element = null;

    public static WebElement farmPosition1(WebDriver driver){
        element = driver.findElement(By.id("farm1_pos1_click"));
        return element;
    }

}
