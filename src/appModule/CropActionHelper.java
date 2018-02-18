package appModule;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CropActionHelper {
    private static int fieldWidth = 2;
    public static int activeField = 1;

    public static int areaWidth = 0;
    public static int areaHeight = 0;

    public static void WalkThruFields(WebDriver driver) {

        while (areaHeight <= 9) {
            while (areaWidth <= 12 && activeField < 120) {
                //activeField = fieldWidth + areaHeight*12 + areaWidth;
                System.out.println(activeField);
                WebElement pole = driver.findElement(By.xpath("//*[@id='field" + activeField + "'" + "]"));
                pole.click();
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                if (driver.findElement(By.id("globalbox")).isDisplayed()) {
                    WebElement close_globalbox_content = driver.findElement(By.id("globalbox_button2"));
                    close_globalbox_content.click();
                }
                areaWidth += 1;
                activeField += fieldWidth;
            }
            areaHeight += 1;
            areaWidth = 0;
        }
    }
}
