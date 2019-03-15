import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pages.HomePage;
import pages.PlushPillowPDP;
import pages.ShopPLP;
import utils.DriverProvider;

public class SmokeCheckingBasePrice {

    @Test
    public void smokeCheckingBasePrice () {

        //Class Attributes
        WebDriver driver = DriverProvider.driver;
        HomePage home = new HomePage();
        ShopPLP shoppage = new ShopPLP();
        PlushPillowPDP pluspillowpage = new PlushPillowPDP();

        //Class Methods
        home.openHomePage();
        home.clickOnShopButton();
        shoppage.clickPlushPillowButton();
        pluspillowpage.basePriceDisplayed();
        Assert.assertTrue(pluspillowpage.basePriceDisplayed(), "Base price not displayed");
        driver.close();



    }

}
