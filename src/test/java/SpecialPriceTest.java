import pages.HomePage;
import pages.ProductPage;

public class SpecialPriceTest {
    public static void main(String[] args) {
        //todo TASK: using provided classes and their methods, navigate to PDP add product to cart
        // init pages
        HomePage home = new HomePage();
        ProductPage product = new ProductPage();


        // test steps
        home.openHomePage();
        home.openPDP();

        if(product.isProductPageOpened()){
            System.out.println("Test passed");
        } else {
            System.out.println("Falied");
        }


    }
        }


