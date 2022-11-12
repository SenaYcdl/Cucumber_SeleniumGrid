package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class GooglePage {

    public GooglePage(){

        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(xpath = "//input[@class='gLFyf gsfi']")
    public WebElement search;

    @FindBy(xpath = "//span[contains(text(),'Trendyol.com - Alışveriş - Aradığın Ürünler Trendy')]")
    public WebElement trendyol;

    @FindBy(xpath = "//input[@data-testid='suggestion']")
    public WebElement makas;

    @FindBy(xpath = "//div[@class='dscrptn']")
    public WebElement trendmakassonuc;


    @FindBy(xpath = "//input[@id='pw-search-input']")
    public WebElement morhipoSearch;

    @FindBy(xpath = "//span[@id='total-product-count']")
    public WebElement morhipoMakas;

}