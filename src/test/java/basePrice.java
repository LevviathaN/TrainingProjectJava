import pages.HomePage;
import pages.ProductPage;

public class basePrice {
    public static void main(String[] args) {
        //todo TASK: using provided classes and their methods, navigate to PDP add product to cart
        // init pages
        HomePage home = new HomePage();
        ProductPage adjustable = new ProductPage();


        // test steps
        home.openHomePage();
        home.openAdjustableBed();

        if(adjustable.isadjustablePageOpened()){
            System.out.println("Test passed");
        } else {
            System.out.println("Falied");
        }
    }
}
