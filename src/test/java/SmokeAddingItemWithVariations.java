import org.openqa.selenium.WebDriver;
import pages.AdjustableBedPDP;
import pages.HomePage;
import pages.ShopPLP;
import utils.DriverProvider;

public class SmokeAddingItemWithVariations {


    public static void main(String[] args) {

        //Verifying ability of user to add items with variations to cart

        WebDriver driver = DriverProvider.driver;
        HomePage home = new HomePage();
        ShopPLP shoppage = new ShopPLP();
        AdjustableBedPDP adjBed = new AdjustableBedPDP();


        //Test steps

        home.openHomePage();
        home.clickOnShopButton();
        shoppage.clickAdjustableBedButton();
        adjBed.SelectSplitKingSize();
        adjBed.clickAddToCart();
        driver.close();

        }



    }


