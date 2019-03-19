import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import pages.AdjustableBedPDP;
import pages.HomePage;
import pages.ShopPLP;
import pages.ShoppingCartPage;
import utils.DriverProvider;

public class SmokeEditDetails {
    @Test
    public void smokeEditDetails() {

        //Class attributes
        WebDriver driver = DriverProvider.driver;
        HomePage home = new HomePage();
        ShopPLP shoppage = new ShopPLP();
        AdjustableBedPDP adjBed = new AdjustableBedPDP();
        ShoppingCartPage shoppingcart = new ShoppingCartPage();

        //Class Methods
        home.openHomePage();
        home.clickOnShopButton();
        shoppage.clickAdjustableBedButton();
        adjBed.clickAddToCart();
        shoppingcart.clickOnEditButton();
        adjBed.clicOnTwinXLSizeButton();
        adjBed.clicOnUpdateCartButton();
        System.out.println("Test Passed successfully");
        driver.close();
    }
}
