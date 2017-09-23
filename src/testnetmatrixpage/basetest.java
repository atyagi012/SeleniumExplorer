package testnetmatrixpage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class basetest {

	 public WebDriver driver;
	
	 @Parameters({"browsertype", "url"})
	@BeforeTest
	public void Launchbrowser(String browsertype, String url) throws InterruptedException{
				
	if(browsertype.equalsIgnoreCase("chrome")){
		
		String driverExeFilePath = System.getProperty("user.dir") + "//drivers//chromedriver.exe";
		
	System.setProperty("webdriver.chrome.driver", driverExeFilePath);
      driver=new ChromeDriver();
	driver.get(url);	
	}
	
	else if(browsertype.equalsIgnoreCase("firefix")){
	driver = new FirefoxDriver();
	driver.get(url);
	}
	
		else {
		      throw new IllegalArgumentException("Invalid browser value!!");
			
}
	
	Thread.sleep(3000);
			
	}			
	





	@AfterTest
	public void browserclose(){
	
	}
	
}
