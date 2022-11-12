package stepDefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.AutomationPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class AutomationStepDef {

    AutomationPage auto= new AutomationPage();

    Actions actions = new Actions(Driver.getDriver());
    JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();

    Faker faker= new Faker();


    @Given("Navigate to {string}")
    public void navigate_to(String url) {

        Driver.getDriver().get(ConfigReader.getProperty(url));


    }
    @Given("Verify that home page is visible successfully")
    public void verify_that_home_page_is_visible_successfully() {

        Assert.assertTrue(auto.homePage.isDisplayed());

    }
    @Given("Add products to cart")
    public void add_products_to_cart() {

        actions.sendKeys(Keys.PAGE_DOWN).moveToElement(auto.addToCart).perform();
        js.executeScript("arguments[0].click();", auto.addToCart);
        ReusableMethods.waitFor(3);


    }
    @Given("Click Cart button")
    public void click_cart_button() {

        js.executeScript("arguments[0].click();", auto.viewCart);

    }
    @Given("Verify that cart page is displayed")
    public void verify_that_cart_page_is_displayed() {

        Assert.assertTrue(auto.cartPage.isDisplayed());

    }
    @Given("Click Proceed To Checkout")
    public void click_proceed_to_checkout() {

        auto.proceedToCheckout.click();

    }
    @Given("Click RegisterLogin button")
    public void click_register_login_button() {

        auto.registerLogin.click();

    }
    @Given("Fill all details in Signup and create account")
    public void fill_all_details_in_signup_and_create_account() {

        js.executeScript("arguments[0].click();", auto.name);
        auto.name.sendKeys(faker.name().firstName());
        auto.email.click();
        auto.email.sendKeys(faker.internet().emailAddress());
        auto.signUp.click();
        auto.title.click();

        actions.sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys("12345").sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.TAB)
                .sendKeys("techpro").sendKeys(Keys.TAB).sendKeys("techproed").sendKeys(Keys.TAB).sendKeys("techpro").sendKeys(Keys.TAB)
                .sendKeys("ABD").sendKeys(Keys.TAB).sendKeys("ABD2").sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys("a")
                .sendKeys(Keys.TAB).sendKeys("germany").sendKeys(Keys.TAB).sendKeys("12302").sendKeys(Keys.TAB).sendKeys("1234567890").perform();
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        js.executeScript("arguments[0].click();", auto.createAccount);

    }
    @Given("Verify ACCOUNT CREATED! and click Continue button")
    public void verify_account_created_and_click_continue_button() {

        Assert.assertTrue(auto.accountCreate.isDisplayed());
        js.executeScript("arguments[0].click();", auto.continueButton);

    }
    @Given("Verify Logged in as username at top")
    public void verify_logged_in_as_username_at_top() {

        Assert.assertTrue(auto.loggedInAs.isDisplayed());
    }
    @Given("Click Proceed To Checkout button")
    public void click_proceed_to_checkout_button() {

        auto.proceedToCheckout.click();
    }
    @Given("Verify Address Details and Review Your Order")
    public void verify_address_details_and_review_your_order() {

        Assert.assertTrue(auto.addressDetails.isDisplayed());
    }
    @Given("Enter description in comment text area and click Place Order")
    public void enter_description_in_comment_text_area_and_click_place_order() {

        auto.enterMessage.sendKeys("new place order");
        auto.placeOrder.click();

    }
    @Given("Enter payment details: Name on Card, Card Number, CVC, Expiration date")
    public void enter_payment_details_name_on_card_card_number_cvc_expiration_date() {

        auto.nameOnCard.click();
        actions.sendKeys("auto cart").sendKeys(Keys.TAB).sendKeys("123456").sendKeys(Keys.TAB)
                .sendKeys("311").sendKeys(Keys.TAB).sendKeys("11").sendKeys(Keys.TAB).sendKeys("2022").perform();

    }
    @Given("Click Pay and Confirm Order button")
    public void click_pay_and_confirm_order_button() {

        auto.payConfirmOrderButton.click();

    }
    @Given("Verify success message Your order has been placed successfully!")
    public void verify_success_message_your_order_has_been_placed_successfully() {

        Assert.assertTrue(auto.successfully.isDisplayed());

    }
    @Given("Click Download Invoice button and verify invoice is downloaded successfully")
    public void click_download_invoice_button_and_verify_invoice_is_downloaded_successfully() {

        auto.downloadInvoice.click();


    }
    @Given("Click Continue button")
    public void click_continue_button() {

        auto.continueButton.click();
    }
    @Given("Click Delete Account button")
    public void click_delete_account_button() {

        ReusableMethods.waitFor(3);
        js.executeScript("arguments[0].click();", auto.deleteAccount);

    }
    @Then("Verify ACCOUNT DELETED! and click Continue button")
    public void verify_account_deleted_and_click_continue_button() {

        Assert.assertTrue(auto.accountDeleted.isDisplayed());
        auto.continueButton.click();
        Driver.closeDriver();
    }

}
