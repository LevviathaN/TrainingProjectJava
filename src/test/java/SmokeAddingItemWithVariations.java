import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AdjustableBedPDP;
import pages.HomePage;
import pages.ShopPLP;
import utils.DriverProvider;

public class SmokeAddingItemWithVariations {

    @Test
    public static void smokeAddingItemWithVariations() {

        //Verifying ability of user to add items with variations to cart

        WebDriver driver = DriverProvider.driver;
        HomePage home = new HomePage();
        ShopPLP shoppage = new ShopPLP();
        AdjustableBedPDP adjBed = new AdjustableBedPDP();


        //Test1 steps

        home.openHomePage();
        home.clickOnShopButton();
        shoppage.clickAdjustableBedButton();
        adjBed.SelectSplitKingSize();
        Assert.assertTrue(adjBed.addToCartButtonDisplayed(),"Add to cart button not displayed");
        adjBed.clickAddToCart();
        driver.close();

        }



    }


