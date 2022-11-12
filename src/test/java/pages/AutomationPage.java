package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AutomationPage {

    public AutomationPage() {

        PageFactory.initElements(Driver.getDriver(), this);
    }

    //Beyza
    @FindBy(xpath = "//*[text()=' Home']")
    public WebElement homePage;

    @FindBy(xpath = "(//*[text()='Add to cart'])[1]")
    public WebElement addToCart;

    @FindBy(xpath = "//*[text()='View Cart']")
    public WebElement viewCart;

    @FindBy(xpath = "//*[text()='Item']")
    public WebElement cartPage;

    @FindBy(xpath = "//*[text()='Proceed To Checkout']")
    public WebElement proceedToCheckout;

    @FindBy(xpath = "//*[text()='Register / Login']")
    public WebElement registerLogin;

    @FindBy(xpath = "//*[@name='name']")
    public WebElement name;

    @FindBy(xpath = "(//*[@name='email'])[2]")
    public WebElement email;

    @FindBy(xpath = "//*[text()='Signup']")
    public WebElement signUp;

    @FindBy(xpath = "//*[@id='id_gender2']")
    public WebElement title;

    @FindBy(css = "button[data-qa='create-account']")
    public WebElement createAccount;

    @FindBy(xpath = "//*[text()='Account Created!']")
    public WebElement accountCreate;

    @FindBy(xpath = "//*[text()='Continue']")
    public WebElement continueButton;

    @FindBy(xpath = "//*[text()=' Logged in as ']")
    public WebElement loggedInAs;

    @FindBy(xpath = "//*[@name='message']")
    public WebElement enterMessage;

    @FindBy(xpath = "//*[text()='Address Details']")
    public WebElement addressDetails;

    @FindBy(xpath = "//*[text()='Place Order']")
    public WebElement placeOrder;

    @FindBy(xpath = "//*[@name='name_on_card']")
    public WebElement nameOnCard;

    @FindBy(xpath = "//*[text()='Pay and Confirm Order']")
    public WebElement payConfirmOrderButton;

    @FindBy(xpath = "//*[text()='Congratulations! Your order has been confirmed!']")
    public WebElement successfully;

    @FindBy(xpath = "//*[text()='Download Invoice']")
    public WebElement downloadInvoice;

    @FindBy(xpath = "(//a[@style='color:brown;'])[2]")
    public WebElement deleteAccount;

    @FindBy(xpath = "//*[text()='Account Deleted!']")
    public WebElement accountDeleted;
}
