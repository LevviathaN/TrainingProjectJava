import org.junit.Test;
import org.openqa.selenium.WebDriver;
import pages.*;
import utils.DriverProvider;

public class TemporarySelctorsTEst {

    @Test
    public void temporarySelctorsTEst() {

        WebDriver driver = DriverProvider.driver;
        HomePage home = new HomePage();
        HybridMattressPDP MattressPDP = new HybridMattressPDP();
        ShoppingCartPage shoppingcart = new ShoppingCartPage();
        CheckoutPage checkout = new CheckoutPage();
        ShopPLP shoppage = new ShopPLP();
        PlushPillowPDP pluspillowpage = new PlushPillowPDP();
        MemoryFoamPillowPDP memoryFoamPillowPDP = new MemoryFoamPillowPDP();
        ReviewsPage reviewsPage = new ReviewsPage();
        HeaderMain header = new HeaderMain();
        FooterMain footer = new FooterMain();


        //Class methods
        home.openHomePage();
        footer.ClickOnTwitterButton();



        System.out.println("Test passed successfully");



    }
}
