package pages.locations;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;

public class PurchaseOrderLocators {
    @FindBy(how = How.CSS, using = ".search_query.form-control.ac_input")
    public WebElement searchField;

    @FindBy(how = How.CSS, using = "#searchbox > button")
    public WebElement searchButton;

    @FindBy(how = How.CSS, using = "#center_column > ul > li")
    public List<WebElement> searchResult;

    @FindBy(how = How.CSS, using = "#layer_cart > div.clearfix > div.layer_cart_cart.col-xs-12.col-md-6 > div.button-container > span > span")
    public WebElement continueShoppingButton;

    @FindBy(how = How.CSS, using = "#layer_cart > div.clearfix > div.layer_cart_cart.col-xs-12.col-md-6 > div.button-container > a > span")
    public WebElement proceedToCheckOut;

    @FindBy(how = How.CSS, using = "#center_column > p.cart_navigation.clearfix > a.button.btn.btn-default.standard-checkout.button-medium > span")
    public WebElement boottomPageProceedToCheckOut;

    @FindBy(how = How.CSS, using = "#email")
    public WebElement signInEmail;

    @FindBy(how = How.CSS, using = "#passwd")
    public WebElement signInPassword;

    @FindBy(how = How.CSS, using = "#SubmitLogin > span")
    public WebElement signInButton;

    @FindBy(how = How.CSS, using = "#center_column > form > p > button > span")
    public WebElement addresspageProceedToCheckout;

    @FindBy(how = How.CSS, using = "#uniform-cgv > span > input[type='checkbox']")
    public WebElement checBoxIagree;

    @FindBy(how = How.CSS, using = "#form > p > button > span")
    public WebElement shippingPageProceedToCheckout;

    @FindBy(how = How.CSS, using = "#HOOK_PAYMENT > div:nth-child(2) > div > p > a > span")
    public WebElement payByCheckButton;

    @FindBy(how = How.CSS, using = "#cart_navigation > button > span")
    public WebElement IconfirmOrderButton;

    @FindBy(how = How.CSS, using = "#center_column > p.alert.alert-success")
    public WebElement confirmMessage;
}
