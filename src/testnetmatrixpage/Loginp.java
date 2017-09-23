package testnetmatrixpage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginp {
	
	public WebDriver driver;
@FindBy(id="username")
private WebElement userName;

@FindBy(id="password")
private WebElement Password;

@FindBy(id="loginBtn")
private WebElement loginbtn;





public Loginp(WebDriver driver){
	this.driver=driver;
	PageFactory.initElements(driver, this);
}

public void EnterUsername(String uname){
	userName.sendKeys(uname);
}
public void EnterPassword(String pass){
Password.sendKeys(pass);

}
public void ClickLoginbtn(){
loginbtn.click();
}

/*public PostYourJobpage Login(String username, String password){
	EnterUsername(username);
	EnterPassword(password);
	ClickLoginbtn();
	return new PostYourJobpage(driver).waitForPage();*/

public void Login(String username, String password){
	/*driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);*/
	EnterUsername(username);
	EnterPassword(password);
	ClickLoginbtn();
	
	
	
	
	
}
}
