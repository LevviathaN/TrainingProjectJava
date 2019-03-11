import org.openqa.selenium.WebDriver;
import pages.CheckoutPage;
import pages.HomePage;
import pages.ProductPage;
import pages.ShoppingCartPage;
import utils.DriverProvider;


public class Test {
    public static void main(String[] args) {
        //todo TASK: using provided classes and their methods, navigate to PDP add product to cart
        // init pages

        WebDriver driver = DriverProvider.driver;
        HomePage home = new HomePage();

        ProductPage MattressPDP = new ProductPage();

        ShoppingCartPage shoppingcart = new ShoppingCartPage();

        CheckoutPage checkout = new CheckoutPage();





        // test steps
        home.openHomePage();

        home.openPDP();

        MattressPDP.clickAddToCart();

        MattressPDP.AddCrossSellITem();

        MattressPDP.clickViewVart();

        shoppingcart.clickProceedToCheckout();

        checkout.EnterShippingAddress();

        checkout.ClosingBillingAddress();

        //checkout.ChoosingPaymentMethod();




        driver.close();


























    }
}
