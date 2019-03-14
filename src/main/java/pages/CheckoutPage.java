package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.DriverProvider;

public class CheckoutPage {

    //Class attributes - Checkout page selectors.
    public WebDriver driver = DriverProvider.driver;
    public By EmailAddressField = By.id("customer-email");
    public By FirstName = By.name("firstname");
    public By LastName = By.name("lastname");
    public By StreetAddress = By.name("street[0]");
    public By City = By.name("city");
    public By Phone = By.name("telephone");
    public By BillingAddressButton = By.className("toogle");
    public By CardNumber = By.name("credit-card-number");
    public By ExpirationMonth = By.name("expiration-month");
    public By ExpirationYear = By.name("expiration-year");
    public By CVVCode = By.name("cvv");






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





