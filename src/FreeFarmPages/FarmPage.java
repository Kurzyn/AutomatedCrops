package FreeFarmPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FarmPage {
    private static WebElement element = null;

    //elementy bocznego menu
    public static WebElement zboze(WebDriver driver){
        element = driver.findElement(By.id("rackitem1"));
        return element;
    }

    public static WebElement cebula(WebDriver driver){
        element = driver.findElement(By.id("rackitem22"));
        return element;
    }

    //elementy gardenmaincntainer
    public static WebElement siej(WebDriver driver){
        element = driver.findElement(By.id("anpflanzen"));
        return element;
    }

    public static WebElement podlewaj(WebDriver driver){
        element = driver.findElement(By.id("giessen"));
        return element;
    }

    public static WebElement zbieraj(WebDriver driver){
        element = driver.findElement(By.id("ernten"));
        return element;
    }

    public static WebElement zbierajAll(WebDriver driver){
        element = driver.findElement(By.id("cropall"));
        return element;
    }


}
