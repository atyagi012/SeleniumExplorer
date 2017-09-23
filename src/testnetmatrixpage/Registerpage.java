package testnetmatrixpage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Registerpage {
String str="fname.322@yopmail.com";
	
	 private WebDriver driver;

		//@BeforeTest
		public void launchbrowser(){
		System.setProperty("webdriver.chrome.driver", 
	           "C:/Users/library/chromefile/chromedriver.exe");
		driver=new ChromeDriver();

		driver.get("https://netmatrixsolutions.com/dev/applicantz/app/login.php");
	
		}

	//@Test(priority=1)
	public void Createaccount() throws InterruptedException{
		Thread.sleep(2000);
		driver.manage().window().maximize();
		
	driver.findElement(By.xpath("//a[contains(., 'Register Here')]")).click();
	driver.findElement(By.id("fname")).sendKeys("test");
	driver.findElement(By.id("lname")).sendKeys("sir");
	driver.findElement(By.id("username")).sendKeys("str");
	/*driver.findElement(By.xpath("//div[@class='col-lg-6 col-md-6 col-sm-6 col-xs-12 registeration']")).sendKeys("123456");
	*/
	driver.findElement(By.id("password")).sendKeys("123456");
	driver.findElement(By.id("confirmpassword")).sendKeys("123456");
	driver.findElement(By.xpath("//button[contains(., 'Register')]")).click();
	
}
	//@Test(priority=2)
	public void Teamselectpage() throws InterruptedException{
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='col-lg-12 col-md-12 col-sm-12 col-xs-12 team self-team']")).click();
		driver.findElement(By.xpath("//button[@id='teamjoinBtn']")).click();
	}
	
	
		
	

	@AfterTest
	public void browserclose(){
		
	}
}