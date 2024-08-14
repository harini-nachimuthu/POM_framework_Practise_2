 package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.demoblaze_base_methods;

public class HomePage extends demoblaze_base_methods{

	public HomePage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="signin2")
	WebElement signclick;
	
	@FindBy(id="login2")
	WebElement loginclick;
	
//	public void clickSignin() {
//		clickbutton(signclick);
//	}
	public void clickSignin() {
		elementclick(signclick,50);
		System.out.println("Sign in clicked");
	
	}
	
//	public void clickLogin() {
//		clickbutton(loginclick);
//		
//	}
	public void clickLogin() {
		elementclick(loginclick,50);
		System.out.println("login in clicked");
	}
}
	
	
	

