import org.junit.Test;
import org.openqa.selenium.WebDriver;
import pages.HomePage;
import pages.HybridMattressPDP;
import pages.ShopPLP;
import pages.ShoppingCartPage;
import utils.DriverProvider;

public class SmokeAddingItemsFromCrossSell {

    @Test
    public void smokeAddingItemsFromCrossSell () {

        //Class Attributes
        WebDriver driver = DriverProvider.driver;
        HomePage home = new HomePage();
        ShopPLP shoppage = new ShopPLP();
        HybridMattressPDP MattressPDP = new HybridMattressPDP();
        ShoppingCartPage shoppingcart = new ShoppingCartPage();

        //Class Methods
        home.openHomePage();
        home.clickOnShopButton();
        shoppage.clickHybridMattressButton();
        MattressPDP.clickAddToCart();
        MattressPDP.clickAddCrossSellItemButton();
        MattressPDP.clickViewCart();
        System.out.println("Test Passed successfully");
        driver.close();


    }
}
