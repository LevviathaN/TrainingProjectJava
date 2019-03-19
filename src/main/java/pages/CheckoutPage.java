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
    public By CouponCOdeField = By.id("discount-code");
    public By ApplyButton = By.xpath("//*[@id=\"discount-form\"]/div[2]/div/button");
    public By PlaceOrderButton = By.xpath("//*[@id=\"checkout\"]/div[5]/div[2]/div/div[1]/button/span");
    public By PlaceOrderBlock = By.xpath("//*[@id=\"checkout\"]/div[5]/div[2]/div/div[3]");






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

    // Choosing credit card payment method
    public void ChoosingCreditCard() {

        //Switching to credit card field and adding required data
        System.out.println("Adding payment data");
        driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\"braintree-hosted-field-number\"]")));
        driver.findElement(CardNumber).sendKeys("4111111111111111");
        System.out.println("Credit card number added");

        //Switching to expiration month field and adding required data
        driver.switchTo().defaultContent();
        driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\"braintree-hosted-field-expirationMonth\"]")));
        driver.findElement(ExpirationMonth).sendKeys("12");
        System.out.println("Expiration month added");

        //Switching to expiration year field and adding required data
        driver.switchTo().defaultContent();
        driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\"braintree-hosted-field-expirationYear\"]")));
        driver.findElement(ExpirationYear).sendKeys("22");
        System.out.println("Expiration year added");

        //Switching to CVV code field and adding required data
        driver.switchTo().defaultContent();
        driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\"braintree-hosted-field-cvv\"]")));
        driver.findElement(CVVCode).sendKeys("123");
        System.out.println("CVV code added");
        driver.switchTo().defaultContent();

    }

    public void AddingCouponCode() {


        System.out.println("Adding coupon");
        DriverProvider.waitFor(1);
        driver.findElement(CouponCOdeField).sendKeys("TMR150");
        driver.findElement(ApplyButton).click();

    }

    public void ClickOnPlaceOrder() {


        System.out.println("Clicking place order button");
        DriverProvider.waitFor(2);
        driver.findElement(PlaceOrderBlock);
        DriverProvider.waitFor(3);
        driver.findElement(PlaceOrderButton).click();

    }

}





