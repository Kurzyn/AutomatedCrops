package appModule;

import FreeFarmPages.FarmPage;
import FreeFarmPages.MainFarmPage;
import com.sun.media.jfxmedia.logging.Logger;
import org.openqa.selenium.WebDriver;

public class PlantAction {

    public static void Execute(WebDriver driver){
        //wybor farmy

        //akcje na farmie
        //FarmPage.zbieraj(driver).click();
        FarmPage.zboze(driver).click();
        PlantActionHelper.WalkThruFields(driver);
    }

}
