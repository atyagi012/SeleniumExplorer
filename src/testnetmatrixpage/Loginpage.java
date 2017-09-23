package testnetmatrixpage;
import static org.testng.Assert.assertEquals;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.openqa.selenium.interactions.Action;

import org.openqa.selenium.interactions.Actions;
public class Loginpage {
	
	
public WebDriver driver;

	
	@BeforeTest
	public void openbrowser(){
	System.setProperty("webdriver.chrome.driver", "C:/Users/uday/chromedriver.exe");
 driver=new ChromeDriver();
	driver.get("https://applicantz.com/stage/applicantz/app/jobpost.php");
	}
	
	@Test(priority=1)
	public void Login(){
		
	driver.manage().window().maximize();
	driver.findElement(By.id("username")).sendKeys("testy.111@yopmail.com");
	driver.findElement(By.id("password")).sendKeys("123456");
	driver.findElement(By.id("loginBtn")).click();
	}
	@Test(priority=2)
		public void postnewjob() throws InterruptedException{
		Thread.sleep(3000);
			driver.findElement(By.xpath("//a[contains(., 'Post New Job')]")).click();
		}
	@Test(priority=3)
	
	public void Postjobform() throws InterruptedException{
		Thread.sleep(3000);
		driver.findElement(By.id("jobTitle")).sendKeys("testAutomation");
		
		driver.findElement(By.xpath("//input[@id='zip']")).sendKeys("10039");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[@class='pac-item']")).click();
		/*WebElement autofill= Wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("keyword_suggest")));*/
	
	/*	WebElement mySelectElement=driver.findElement(By.xpath("//descendant::select[@id='jobtype'][1]")).sendKeys("");
		Select dropdown= new Select(mySelectElement);
		*/
		Thread.sleep(2000);
		Select dropdown = new Select(driver.findElement(By.xpath("//descendant::select[@id='jobtype'][4]")));
		Thread.sleep(1000);
		dropdown.selectByVisibleText("Contract-to-hire");
		driver.findElement(By.id("durationNum")).sendKeys("1");
		Select dropdown1 = new Select(driver.findElement(By.xpath("//descendant::select[@id='jobCurrency'][1]")));
		
		dropdown1.selectByVisibleText("$ - US Dollar");
		Select dropdown3 = new Select(driver.findElement(By.xpath("//descendant::select[@id='rate'][3]")));
		dropdown3.selectByVisibleText("/Hr");
		//Job description
		driver.switchTo().frame("job_description_ifr");
		driver.findElement(By.xpath("//body[@id='tinymce']")).click();
		driver.findElement(By.xpath("//body[@id='tinymce']")).sendKeys("java selenium database asset management");
		driver.switchTo().defaultContent();
		Thread.sleep(2000);
	// Add 5 seconds wait
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//ul[@id='tags']/li[1]")).click();
		// Create object of actions class
		Thread.sleep(4000);
		Actions act=new Actions(driver);
		
	
		// find element which we need to drag
		
	
	String a=	"//ul[@id='tags']/li[";
			int k=1;
			String b="]";
			String comp=a+k+b;
			for(k=1; k<3; k++){	
	/*	WebElement From=driver.findElement(By.xpath("//ul[@id='tags']/li[1]"));*/
				comp=a+k+b;
				WebElement From=driver.findElement(By.xpath(comp));
		 
		// find element which we need to drop
		WebElement To=driver.findElement(By.id("mustHaveSkills"));
		act.clickAndHold(From).build().perform();
		Thread.sleep(2000);
		act.click(To).build().perform();
		
		act.release(To).build().perform();
				
		
		
				 
		// this will drag element to destination
		/*act.dragAndDrop(drag, drop);*/
	}
			driver.findElement(By.id("submitJobBtn")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
			
			}
	@Test(priority=4)
	public void Applyjob() throws InterruptedException{
		Thread.sleep(4000);
		String parentHandle = driver.getWindowHandle();
		driver.findElement(By.xpath("//descendant::i[@class='fa fa-envelope'][1]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.id("openApplyLink")).click();
		Set<String> handles =  driver.getWindowHandles();
		for (String winHandle : driver.getWindowHandles()) {
		    driver.switchTo().window(winHandle); // switch focus of WebDriver to the next found window handle (that's your newly opened window)
		   /* Set <String> handles =driver.getWindowHandles();
		    Iterator<String> it = handles.iterator();
		    //iterate through your windows
		    while (it.hasNext()){
		    String parent = it.next();
		    String newwin = it.next();
		    driver.switchTo().window(newwin); */  
		}
		Thread.sleep(2000);
		driver.findElement(By.id("candSelect")).click();
		
		driver.findElement(By.id("useremail")).sendKeys("asdf1112112@yopmail.com");
		driver.findElement(By.id("startapply")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("zip")).sendKeys("10039");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='pac-item']")).click();
		driver.findElement(By.id("fname")).sendKeys("Marc");
		driver.findElement(By.id("lname")).sendKeys("tera");
		driver.findElement(By.id("phone")).sendKeys("8009002363");
		Select dropd1= new Select(driver.findElement(By.xpath("//descendant::select[@id='visa'][2]")));
		dropd1.selectByVisibleText("US Citizen");
		driver.findElement(By.id("nextBtn")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//descendant::span[contains(., '1-4 years')][1]")).click();
		driver.findElement(By.xpath("//descendant::span[contains(., '2 years')][1]")).click();
		driver.findElement(By.xpath("//descendant::span[contains(., '1-4 years')][2]")).click();
		driver.findElement(By.xpath("//descendant::span[contains(., '2 years')][3]")).click();
		driver.findElement(By.id("noLinkedIn")).click();
		WebElement element= driver.findElement(By.name("myfile"));
		element.sendKeys("C:/Users/ashish/Downloads/Reciept-Signature.pdf");
		driver.findElement(By.id("payRate")).sendKeys("10");
		Select dropd2= new Select(driver.findElement(By.xpath("//descendant::select[@id='billtype'][2]")));
		dropd2.selectByVisibleText("1099");
		Thread.sleep(2000);
		driver.findElement(By.id("submitJobBtn")).click();
		/*driver.findElement(By.id("nextBtn")).click();*/
		driver.close();
	
	/*	driver.switchTo().window(parentHandle);*/
		            
	}
	//@Test(priority=5)
	public void evaluationpage() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//tr[@data-job-id='6bb4a081-995a-11e7-a53d-0a4ba9147d3f']/td[8]/a[@onclick='updateRelevance(this);']")).click();
		String parentHandle = driver.getWindowHandle();
		driver.findElement(By.id("openApplyLink")).click();
				Set<String> handles =  driver.getWindowHandles();
				for (String winHandle : driver.getWindowHandles()) {
				    driver.switchTo().window(winHandle);
		}

	String jobname	=driver.findElement(By.xpath("//u[contains(., 'testAutomation')]")).getText();
	String applicantname=driver.findElement(By.xpath("//span[@class='applicantNameFull']")).getText();
	driver.findElement(By.xpath("//i[@class='fa fa-eye']")).click();
	String email=driver.findElement(By.xpath("//span[@class='appli-email']")).getText();
	assertEquals(jobname, "testAutomation");
	System.out.println(jobname);
	assertEquals(applicantname, "Marc Tera");
	System.out.println(applicantname);
	assertEquals(email, "asdf1112@yopmail.com");
	System.out.println(email);
	
	}
	
	@AfterTest
	public void closebrowser(){
		
	}
}

	

