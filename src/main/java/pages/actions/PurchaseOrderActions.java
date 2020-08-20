package pages.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import pages.locations.PurchaseOrderLocators;
import utils.BasePO;
import utils.ShoppingDriver;

public class PurchaseOrderActions extends BasePO {
    private PurchaseOrderLocators locators = null;

    public PurchaseOrderActions(){
        this.locators = new PurchaseOrderLocators();
        PageFactory.initElements(ShoppingDriver.getDriver(), locators);
    }

    public void enterSearchKey(String searchKey){
        locators.searchField.click();
        locators.searchField.sendKeys(searchKey);
    }

    public void clickSearchButton(){
        clickButton(locators.searchButton);
        ShoppingDriver.waitForPageToLoad();
    }

    public void selectItemsAddToCart(){
        int i = 0;
        if(locators.searchResult.size() > 1){
            for (WebElement e: locators.searchResult){
                i++;
                System.out.println( e.findElement(By.cssSelector("div > div.right-block > h5 > a")).getText() );
                ShoppingDriver.waitForPageToLoad();
                Actions action= new Actions(ShoppingDriver.getDriver());
                action.moveToElement(e.findElement(By.cssSelector("div > div.right-block > h5 > a"))).perform();
                ShoppingDriver.waitForPageToLoad();
               e.findElement(By.cssSelector("div > div.right-block > div.button-container > a.button.ajax_add_to_cart_button.btn.btn-default > span")).click();
                ShoppingDriver.waitForPageToLoad();
                if (i==2){
                    locators.proceedToCheckOut.click();
                    break;
                }else{
                    locators.continueShoppingButton.click();
                }
            }

        }else {
            System.out.println("No search result found");
        }

    }

    public void clickBottomPageClickToProceed(){
        ShoppingDriver.waitForPageToLoad();
        scrollToPageEnd();
        clickButton(locators.boottomPageProceedToCheckOut);
    }

    public void signInUser(){
        ShoppingDriver.waitForPageToLoad();
        locators.signInEmail.click();
        locators.signInEmail.sendKeys("pkmytest7@gmail.com");
        locators.signInPassword.sendKeys("passW0rd1");
        clickButton(locators.signInButton);

    }
    public void clickBAddressPageToProceed(){
        ShoppingDriver.waitForPageToLoad();
        scrollToPageEnd();
        clickButton(locators.addresspageProceedToCheckout);
    }

    public void clickCheckBoxIagreeProceed(){
        ShoppingDriver.waitForPageToLoad();
        if(!locators.checBoxIagree.isSelected()){
            locators.checBoxIagree.click();
        }

        scrollToPageEnd();
        clickButton(locators.shippingPageProceedToCheckout);
    }
    public void clickPayByCheckButton(){
        ShoppingDriver.waitForPageToLoad();
        scrollToPageEnd();
        clickButton(locators.payByCheckButton);
    }
    public void clickIconfirmOrder(){
        ShoppingDriver.waitForPageToLoad();
        scrollToPageEnd();
        clickButton(locators.IconfirmOrderButton);
    }
    public boolean isConfirmMessageDisplayed(String message){

        System.out.println(locators.confirmMessage.getText());
        return (locators.confirmMessage.getText().equalsIgnoreCase(message));

    }
}
