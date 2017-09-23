package testnetmatrixpage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;



public class PostYourJobpage {
public WebDriver driver;

public PostYourJobpage(WebDriver driver) {
	
	this.driver = driver;
	PageFactory.initElements(driver, this);
}

	@FindBy(id="jobTitle")
	private WebElement jobtitlefield;
	
	@FindBy(id="zip")
	private WebElement zipcode;
	
	@FindBy(xpath="//div[@class='pac-item']")
	private WebElement selectzip;
	
	@FindBy(xpath="//descendant::select[@id='jobtype'][4]")
	private WebElement selectjobtype;
	
	@FindBy(id="durationNum")
	private WebElement jobdurationnum;
	
	@FindBy(xpath="//descendant::select[@id='jobCurrency'][1]")
	private WebElement selectjobcurrency;
	
	@FindBy(xpath="//descendant::select[@id='rate'][3]")
	private WebElement selectrate;
	
	@FindBy(xpath="//body[@id='tinymce']")
	private WebElement jobdescription;
	
	@FindBy(xpath="//ul[@id='tags']/li[1]")
	private WebElement haveskills;
	
	@FindBy(id = "submitJobBtn")
	private WebElement submitpage;
	
	@FindBy(xpath = "//button[@class='btn btn-primary']")
	private WebElement finalclick;
	
	public void postyourjob() throws InterruptedException{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		jobtitlefield.sendKeys("Automation");
		zipcode.sendKeys("10039");
		Thread.sleep(2000);
		selectzip.click();
		
		
		Select dropdown = new Select(selectjobtype);
		dropdown.selectByVisibleText("Contract-to-hire");
		jobdurationnum.sendKeys("1");
		
		Select dropdown1=new Select(selectjobcurrency);
		dropdown1.selectByVisibleText("$ - US Dollar");
		
		Select dropdown3=new Select(selectrate);
		dropdown3.selectByVisibleText("/Hr");
		driver.switchTo().frame("job_description_ifr");
		
		jobdescription.sendKeys("java selenium database asset management");
		Thread.sleep(2000);
		driver.switchTo().defaultContent();
		
		haveskills.click();
		Thread.sleep(2000);
		Actions act=new Actions(driver);
		
		//Drang and drop feature
		String a=	"//ul[@id='tags']/li[";
		int k=1;
		String b="]";
		String comp=a+k+b;
		for(k=1; k<3; k++){	
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
		submitpage.click();
		Thread.sleep(2000);
		finalclick.click();
		
		
		
		
	}
	
	
	
	

	}

