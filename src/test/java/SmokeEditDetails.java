import org.openqa.selenium.WebDriver;
import pages.AdjustableBedPDP;
import pages.HomePage;
import pages.ShopPLP;
import pages.ShoppingCartPage;
import utils.DriverProvider;

public class SmokeEditDetails {

    public static void main(String[] args) {

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
        driver.close();
    }
}
