import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import pages.HeaderMain;
import pages.HomePage;
import utils.DriverProvider;

public class SmokeClickOnMiniCart {

    @Test
    public void smokeMiniCartIcon() {

        //Class Attributes
        WebDriver driver = DriverProvider.driver;
        HomePage home = new HomePage();
        HeaderMain header = new HeaderMain();



        //Class methods
        home.openHomePage();
        header.ClickOnMiniCartIcon();
        




    }
}
