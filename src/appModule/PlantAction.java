package appModule;

import FreeFarmPages.FarmPage;
import FreeFarmPages.MainFarmPage;
import org.openqa.selenium.WebDriver;

public class PlantAction {

    public static void Execute(WebDriver driver){
        //wybor farmy
        MainFarmPage.farmPosition1(driver).click();
        //akcje na farmie
        //FarmPage.zbieraj(driver).click();
        PlantActionHelper.WalkThruFields(driver);
    }

}
