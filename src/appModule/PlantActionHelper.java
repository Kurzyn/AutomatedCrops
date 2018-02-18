package appModule;

import FreeFarmPages.FarmPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PlantActionHelper {

    private static int fieldWidth = 2;
    public static int activeField = 0;

    public static int areaWidth = 0;
    public static int areaHeight = 0;

    public static void WalkThruFields(WebDriver driver){

        while(areaHeight <= 9 ){
            while(areaWidth <= 12){
                activeField = fieldWidth + areaHeight*12 + areaWidth;
                WebElement pole = driver.findElement(By.xpath("//*[@id='field" + activeField + "'"+"]"));
                pole.click();

                if(driver.findElement(By.id("globalbox")).isDisplayed()){
                    WebElement close_globalbox_content = driver.findElement(By.id("globalbox_button2"));
                    close_globalbox_content.click();
                }
                areaWidth += 1;
            }
            areaHeight += 1;
        }
    }
}
