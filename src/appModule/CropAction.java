package appModule;

import FreeFarmPages.FarmPage;
import org.openqa.selenium.WebDriver;

public class CropAction {
    public static void Execute(WebDriver driver){
        FarmPage.zbieraj(driver).click();
        PlantActionHelper.WalkThruFields(driver);
    }
}
