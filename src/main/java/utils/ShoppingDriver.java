package utils;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class ShoppingDriver {

    private static ShoppingDriver shoppingDriver;

    //initialize webdriver
    private static WebDriver driver;

    //initialize timeouts
    private static WebDriverWait waitDriver;
    public final static int TIMEOUT = 30;
    public final static int PAGE_LOAD_TIMEOUT = 50;

    private  ShoppingDriver() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        waitDriver = new WebDriverWait(driver, TIMEOUT);
        driver.manage().timeouts().implicitlyWait(TIMEOUT, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
        String window=driver.getWindowHandle();
        System.out.println("Window ->"+window);
    }

    public static void openPage(String url) {
        System.out.println(url);
        System.out.println(driver);
        driver.get(url);
    }
    public static WebDriver getDriver() {
        return driver;
    }

    public static void setUpDriver() {
        if (shoppingDriver == null)
            shoppingDriver = new ShoppingDriver();

    }
    public static void tearDown() {
        if (driver != null) {
            driver.close();
            driver.quit();
        }
        shoppingDriver = null;
    }
    public static void waitForPageToLoad()
    {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
