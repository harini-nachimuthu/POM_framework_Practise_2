package Utilities;

import java.io.IOException;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class demoblaze_utilities {
	public static WebDriver driver;
	
	public void launchbrowser(String browser) {
		if(browser.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		}else if(browser.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
		}else if(browser.equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
		}else {
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		}
	}
	
	public void geturl(String url) {
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	public void closebrowser() {
		driver.close();
	}
	
	public void quitbrowser() {
		driver.quit();
	}
	
	public void clickbutton(WebElement ele) {
		ele.click();
	}
	
	public void sendkeys(WebElement ele,String value) {
		ele.sendKeys(value);
	}
	
	public void sendkeysandclick(WebElement ele,String value) {
		ele.sendKeys(value);
		ele.click();
	}
	
	public void findandsendkeysid(String idname,String value) {
		 driver.findElement(By.id(idname)).sendKeys(value);
	}
	
	public void findandsendkeysname(String name,String value) {
		 driver.findElement(By.name(name)).sendKeys(value);
	}
	
	public void findandsendkeysclass(String class1,String value) {
		 driver.findElement(By.className(class1)).sendKeys(value);
	}
	
	public void findandsendkeysxpath(String xpath1,String value) {
		 driver.findElement(By.xpath(xpath1)).sendKeys(value);
	}
	
	public void elementclick(WebElement ele,int seconds) {
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(seconds));
		wait.until(ExpectedConditions.elementToBeClickable(ele)).click();
	}
	
	public void elementvisible(WebElement element,int seconds) {
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(seconds));
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	
	
}
