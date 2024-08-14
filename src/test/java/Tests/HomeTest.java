package Tests;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Base.demoblaze_base_methods;
import Pages.HomePage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HomeTest extends demoblaze_base_methods{

	 @Test(priority=0)
	 public void homepagetitlecheck() throws InterruptedException {
		 HomePage homepage=new HomePage(driver);
		 String actual="STORE";
		 String expected=driver.getTitle();
		 String pageurl=driver.getCurrentUrl();
		 Assert.assertEquals(expected, actual);
		 System.out.println("title of page is :"+expected);
		 System.out.println("Page url : "+pageurl);
		 Thread.sleep(2000);
	 }
	 
	@Test(priority=1)
	 public void homepagesigntest() throws InterruptedException {
		HomePage homepage1=new HomePage(driver);
		 homepage1.clickSignin();
		 Thread.sleep(2000);
		 
	 }
	
	@Test(priority=2)
	public void homepagelogintest() throws InterruptedException {
		HomePage homepage2=new HomePage(driver);
		homepage2.clickLogin();
		Thread.sleep(2000);
	}
	
	 
	 
}
