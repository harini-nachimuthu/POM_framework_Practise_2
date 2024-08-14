package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.demoblaze_base_methods;

public class LoginPage extends demoblaze_base_methods{
	
	
	
	public LoginPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id="loginusername")
	WebElement loginusername1;
	
	@FindBy(id="loginpassword")
	WebElement loginpassword1;
	
	@FindBy(xpath="//button[normalize-space()='Log in']")
	WebElement Login1;
	
	@FindBy(id="nameofuser")
	WebElement nameofuser1;
	
	public void loginuser() {
		sendkeysandclick(loginusername1,"Harini123");
	}
	
	public void loginpass() {
		sendkeysandclick(loginpassword1,"admin123");
	}
	
	public void Logintest() {
		clickbutton(Login1);
	}
	
	public void nameofusertest() {
		String actual=nameofuser1.getText();
		String expected="Welcome Harini123";
		if(actual.equals(expected)) {
			System.out.println("Yes login successfull");
		}else {
			System.out.println("No login not successfull");
		}
		System.out.println("actual login text:: "+actual);
	}
}
