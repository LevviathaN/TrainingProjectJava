import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.PlushPillowPDP;
import pages.ShopPLP;
import utils.DriverProvider;



public class SmokeAddingItemWithoutVariations {

    @Test
    public void smokeAddingItemWithoutVariations() {

        //Class attributes

        WebDriver driver = DriverProvider.driver;
        HomePage home = new HomePage();
        ShopPLP shoppage = new ShopPLP();
        PlushPillowPDP pluspillowpage = new PlushPillowPDP();


        //Class methods

        home.openHomePage();
        home.clickOnShopButton();
        shoppage.clickPlushPillowButton();
        Assert.assertTrue(pluspillowpage.addToCartButtonDisplayed(),"Add to cart button not displayed");
        pluspillowpage.clickAddToCart();
        System.out.println("Test Passed successfully");
        driver.close();



    }
}
