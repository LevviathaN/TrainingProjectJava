package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.DriverProvider;

public class ShopPLP {

    //Class methods

    private WebDriver driver = DriverProvider.driver;

    public By AdjustableBedButton = By.xpath("//*[@id=\"maincontent\"]/div[5]/div/div[1]/div/section/ul[2]/li[5]/a/p");
    public By PlushPillowButton = By.xpath("//*[@id=\"maincontent\"]/div[5]/div/div[1]/div/section/ul[1]/li[4]/a/div/img");



    //Class attributes

    public void clickAdjustableBedButton () {
        System.out.println("Click on Adjustable bed button");
        DriverProvider.waitFor(3);
        driver.findElement(AdjustableBedButton).click();
    }

    public void clickPlushPillowButton () {
        System.out.println("Click on Plush Pillow button");
        DriverProvider.waitFor(3);
        driver.findElement(PlushPillowButton).click();
    }


}
