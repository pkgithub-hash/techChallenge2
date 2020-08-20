package stepDefs;



import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import utils.ShoppingDriver;

public class AfterActions {

    @After
    public static void tearDown(Scenario scenario) {
    	
    	WebDriver driver=ShoppingDriver.getDriver();
    	System.out.println(scenario.isFailed());
    	 if (scenario.isFailed()) {
//             byte[] screenshotBytes = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
//             scenario.embed(screenshotBytes, "image/png");
          
         }
//        ShoppingDriver.tearDown();
    }
}
