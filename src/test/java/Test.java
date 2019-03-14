import org.openqa.selenium.WebDriver;
import pages.CheckoutPage;
import pages.HomePage;
import pages.HybridMattressPDP;
import pages.ShoppingCartPage;
import utils.DriverProvider;


public class Test {
    public static void main(String[] args) {
        //todo TASK: using provided classes and their methods, navigate to PDP add product to cart
        // init pages

        WebDriver driver = DriverProvider.driver;
        HomePage home = new HomePage();
        HybridMattressPDP MattressPDP = new HybridMattressPDP();
        ShoppingCartPage shoppingcart = new ShoppingCartPage();
        CheckoutPage checkout = new CheckoutPage();




        // test steps
        home.openHomePage();
        home.openPDP();
        MattressPDP.clickAddToCart();
        MattressPDP.clickViewCart();
        shoppingcart.clickProceedToCheckout();
        checkout.EnterShippingAddress();
        checkout.ClosingBillingAddress();
        //checkout.ChoosingPaymentMethod(); (Must be refactored during frame switch)
        driver.close();


























    }
}
