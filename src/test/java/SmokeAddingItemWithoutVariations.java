import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.PlushPillowPDP;
import pages.ShopPLP;
import utils.DriverProvider;






public class SmokeAddingItemWithoutVariations {

    @Test
    public static void smokeAddingItemWithoutVariations(String[] args) {

        //Class attributes

        WebDriver driver = DriverProvider.driver;
        HomePage home = new HomePage();
        ShopPLP shoppage = new ShopPLP();
        PlushPillowPDP pluspillowpage = new PlushPillowPDP();


        //Class methods

        home.openHomePage();
        home.clickOnShopButton();
        shoppage.clickPlushPillowButton();
        pluspillowpage.clickAddToCart();
        driver.close();


    }
}
