import org.testng.Assert;
import pages.*;
import pages.CartPage;

public class Test {
    public static void main(String[] args) {
        //todo TASK: using provided classes and their methods, navigate to PDP add product to cart
        // init pages
        HomePage home = new HomePage();
        ProductPage pdp = new ProductPage();
        CartPage cart = new CartPage();

        // test steps
        home.openHomePage();
        home.openPDP();

        pdp.clickAddToCart();
        pdp.clickViewCart();
        if(cart.isCartPageOpened()){
            System.out.println("Test passed");
        } else {
            System.out.println("Falied");
        }
        //ChechOut.clickProceedToCheckout();

    }
}
