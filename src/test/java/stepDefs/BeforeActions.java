package stepDefs;



import io.cucumber.java.Before;
import utils.ShoppingDriver;

public class BeforeActions  {

	@Before
    public static void setUp() {
		//ExtentCucumberFormatter.initiateExtentCucumberFormatter();
    	System.out.println("Before");
        ShoppingDriver.setUpDriver();
    }
}
