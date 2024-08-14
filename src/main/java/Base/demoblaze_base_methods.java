package Base;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import org.testng.annotations.Parameters;

import Utilities.demoblaze_utilities;
import io.github.bonigarcia.wdm.WebDriverManager;



public class demoblaze_base_methods extends demoblaze_utilities {
	@Parameters({"browser","url"})
	@BeforeMethod
	public void browserlaunchbase(String browser,String url) {
	    launchbrowser(browser);
	    geturl(url);
	}
	@AfterMethod
	public void closebrowserbase() {
		quitbrowser();
	}
	
}
