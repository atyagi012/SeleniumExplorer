package testnetmatrix_test;

import org.testng.annotations.Test;

import testnetmatrixpage.Loginp;
import testnetmatrixpage.PostYourJobpage;
import testnetmatrixpage.basetest;

public class Postyourjob extends basetest {
	@Test
	public void Postjob() throws InterruptedException{
		System.out.println("ashish");
		Loginp log=new Loginp(driver);
		log.Login("test.123@yopmail.com", "123456");
		PostYourJobpage post=new PostYourJobpage(driver);
		post.postyourjob();
			
		
	
	
	}
}
