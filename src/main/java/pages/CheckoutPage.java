package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.DriverProvider;

public class CheckoutPage {

    //Class attributes - Checkout page selectors.
    private WebDriver driver = DriverProvider.driver;
    private By EmailAddressField = By.id("customer-email");
    private By FirstName = By.name("firstname");
    private By LastName = By.name("lastname");
    private By StreetAddress = By.name("street[0]");
    private By City = By.name("city");
    private By Phone = By.name("telephone");
    private By BillingAddressButton = By.className("toogle");
    private By CardNumber = By.name("credit-card-number");
    private By ExpirationMonth = By.name("expiration-month");
    private By ExpirationYear = By.name("expiration-year");
    private By CVVCode = By.name("cvv");






    //Class Methods
    public void EnterShippingAddress() {

        // Entering shipping address.

        System.out.println("Adding email address");
        DriverProvider.waitFor(3);
        driver.findElement(EmailAddressField).sendKeys("email@gmail.com");

        System.out.println("Adding first name");
        DriverProvider.waitFor(1);
        driver.findElement(FirstName).sendKeys("Max");

        System.out.println("Adding last name");
        DriverProvider.waitFor(1);
        driver.findElement(LastName).sendKeys("Notmax");

        System.out.println("Adding street address");
        DriverProvider.waitFor(1);
        driver.findElement(StreetAddress).sendKeys("45 West 45th Street, New York, NY, USA");

        System.out.println("Entering City");
        DriverProvider.waitFor(1);
        driver.findElement(City).sendKeys("New York");

        System.out.println("Adding phone number");
        DriverProvider.waitFor(1);
        driver.findElement(Phone).sendKeys("(789)465-4645");


    }





     public void ClosingBillingAddress() {

         // Closing Billing Address block.

         System.out.println("Closing Billing Address block");
         DriverProvider.waitFor(1);
         driver.findElement(BillingAddressButton).click();


    }

        public void ChoosingPaymentMethod() {

            // Choosing payment method

        System.out.println("Choosing payment method");
        DriverProvider.waitFor(1);
        //driver.switchTo().frame((WebElement) By.className("payment-method-content"));
        driver.findElement(CardNumber).sendKeys("4111111111111111");
        driver.findElement(ExpirationMonth).sendKeys("12");
        driver.findElement(ExpirationYear).sendKeys("22");
        driver.findElement(CVVCode).sendKeys("123");



    }

}





