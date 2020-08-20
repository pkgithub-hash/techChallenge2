package stepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.actions.PurchaseOrderActions;
import utils.ShoppingDriver;

import java.util.List;

public class PurchaseOrderStepDef {

private PurchaseOrderActions purchaseOrderActions ;
    @Given("I am on the Home Page {string} of Shopping Website")
    public void i_am_on_the_home_page_of_shopping_website(String webSiteURL) {
        ShoppingDriver.openPage(webSiteURL);
        if(purchaseOrderActions == null){
            purchaseOrderActions = new PurchaseOrderActions();
        }
    }

    @When("I search for {string} in search bar")
    public void i_search_for_in_search_bar(String searchKey) {
        purchaseOrderActions.enterSearchKey(searchKey);
        purchaseOrderActions.clickSearchButton();
    }

    @When("add items in Add to Cart to proceed")
    public void add_items_in_add_to_cart_to_proceed(List<String>  items) {
        purchaseOrderActions. selectItemsAddToCart();
    }
    @When("click proceed to checkout on Shopping-cart Summary page")
    public void click_proceed_to_checkout_on_shopping_cart_summary_page() {
        purchaseOrderActions.clickBottomPageClickToProceed();
    }

    @When("user logs in Sign in Page")
    public void user_logs_in_sign_in_page() {
        purchaseOrderActions.signInUser();
    }
    @When("confirm Address on Address tab")
    public void confirm_address_on_address_tab() {
        purchaseOrderActions.clickBAddressPageToProceed();
    }


    @When("Agree and confirm Shipping detail on Shipping page")
    public void agree_and_confirm_shipping_detail_on_shipping_page() {
        purchaseOrderActions.clickCheckBoxIagreeProceed();
    }
    @When("confirm payment and select pay by check on Paymen page")
    public void confirm_payment_and_select_pay_by_check_on_paymen_page() {
        purchaseOrderActions.clickPayByCheckButton();
    }
    @When("click on final confirm order on {string} button")
    public void click_on_final_confirm_order_on_button(String string) {
    purchaseOrderActions.clickIconfirmOrder();
    }
    @When("confirm that order is placed by displaying message {string}")
    public void confirm_that_order_is_placed_by_displaying_message(String message) {
      Assert.assertTrue(  "Confirmation message is not displayed", purchaseOrderActions.isConfirmMessageDisplayed(message));
    }
}
