package Tests;


import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import Base.demoblaze_base_methods;
import Pages.HomePage;
import Pages.SignupPage;


public class SignupTest extends HomeTest{
	
	@Test
	public void loginvalues() throws InterruptedException {
		homepagesigntest();
		
		SignupPage signuppage=new SignupPage(driver);
		signuppage.sign_usernametest();
		signuppage.sign_passwordtest();
		signuppage.Sign_uptest();
		Thread.sleep(2000);
		
		Alert al=driver.switchTo().alert();
		String message=al.getText();
		if(message.equals("Sign up successful.")) {
			System.out.println("Signup successfull");
		}else {
			System.out.println("No sign up not successfull");
		}
		System.out.println("Alert message is : "+message);
		al.accept();
		Thread.sleep(2000);
	}

}
