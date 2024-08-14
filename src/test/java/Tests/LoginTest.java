package Tests;

import org.openqa.selenium.Alert;
import org.testng.annotations.Test;

import Pages.LoginPage;

public class LoginTest extends SignupTest {
	
	@Test
	public void logintest() throws InterruptedException {
		homepagelogintest();
		
		LoginPage loginpage=new LoginPage(driver);
		loginpage.loginuser();
		loginpage.loginpass();
		loginpage.Logintest();
		Thread.sleep(2000);
		
		loginpage.nameofusertest();
		
		Thread.sleep(2000);
	}
}
