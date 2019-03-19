import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CheckoutPage;
import pages.HomePage;
import pages.HybridMattressPDP;
import pages.ShoppingCartPage;
import utils.DriverProvider;


public class Test1 {
    @Test
    public static void firstTest() {
        //todo TASK: using provided classes and their methods, navigate to PDP add product to cart
        // init pages

        WebDriver driver = DriverProvider.driver;
        HomePage home = new HomePage();
        HybridMattressPDP MattressPDP = new HybridMattressPDP();
        ShoppingCartPage shoppingcart = new ShoppingCartPage();
        CheckoutPage checkout = new CheckoutPage();




        // test steps
        home.openHomePage();
        Assert.assertTrue(home.learnMoreButtonAvailable(),"Learn More button not available");
        home.openPDP();
        MattressPDP.clickAddToCart();
        MattressPDP.clickViewCart();
        shoppingcart.clickProceedToCheckout();
        checkout.EnterShippingAddress();
        checkout.ClosingBillingAddress();
        checkout.ChoosingCreditCard();
        checkout.AddingCouponCode();
        checkout.ClickOnPlaceOrder();
        System.out.println("Test Passed successfully");
        //driver.close();


























    }
}
