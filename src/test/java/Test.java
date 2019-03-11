import pages.*;
import pages.CartPage;

public class Test {
    public static void main(String[] args) {
        //todo TASK: using provided classes and their methods, navigate to PDP add product to cart
        // init pages
        HomePage home = new HomePage();
        ProductPage PDP = new ProductPage();
        CartPage ChechOut = new CartPage();

        // test steps
        home.openHomePage();
        home.openPDP();

        PDP.clickAddToCart();
        PDP.clickViewVart();
        ChechOut.clickProceedToCheckout();
    }
}
