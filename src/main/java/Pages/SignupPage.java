package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.demoblaze_base_methods;

public class SignupPage extends demoblaze_base_methods  {

	public SignupPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="sign-username")
	WebElement sign_username;
	
	@FindBy(id="sign-password")
	WebElement sign_password;
	
	@FindBy(xpath="//button[normalize-space()='Sign up']")
	WebElement Sign_up;
	
	public void sign_usernametest() {
		sendkeysandclick(sign_username,"Harini123");
	}
	
	public void sign_passwordtest() {
		sendkeysandclick(sign_password,"admin123");
	}
	
	public void Sign_uptest() {
		clickbutton(Sign_up);
	}

	 
}
