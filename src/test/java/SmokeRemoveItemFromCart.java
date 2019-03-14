import org.openqa.selenium.WebDriver;
import pages.AdjustableBedPDP;
import pages.HomePage;
import pages.ShopPLP;
import pages.ShoppingCartPage;
import utils.DriverProvider;

public class SmokeRemoveItemFromCart {

    public static void main(String[] args) {

        //Class Attributes
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
        shoppingcart.clickOnRemoveButton();
        driver.close();


    }
}
