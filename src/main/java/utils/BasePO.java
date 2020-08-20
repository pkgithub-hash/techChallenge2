package utils;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePO {

    public static boolean isElementPresent(WebElement webElement) {
        try {
            boolean isPresent = webElement.isDisplayed();
            return isPresent;
        } catch (NoSuchElementException e) {
            return false;
        }

    }
    public void clickButton(WebElement webElement){

        try{
            webElement.click();
        } catch (Exception e){
            e.printStackTrace();
            System.out.println("Issue with clicking button: Webelement: " + webElement);
        }
    }
    public static void scrollToPageEnd() {
        JavascriptExecutor executor = (JavascriptExecutor) ShoppingDriver.getDriver();
        executor.executeScript("window.scrollTo(0, document.body.scrollHeight - 150)");
    }
    public static void scrollToElement(WebElement element) {
        JavascriptExecutor jse = (JavascriptExecutor) ShoppingDriver.getDriver();
        int location = element.getLocation().y - 60;
        jse.executeScript("scroll(0, " + location + ")");
    }
    public WebElement waitForElementToBeClickable(WebElement element) {
        WebDriverWait wait = new WebDriverWait(ShoppingDriver.getDriver(), 10);
        WebElement webElement = wait.until(ExpectedConditions.elementToBeClickable(element));
        return webElement;
    }
}
