package testnetmatrix_test;

import org.testng.annotations.Test;

import testnetmatrixpage.Loginp;
import testnetmatrixpage.basetest;

public class Logintest extends basetest {
	
	@Test
	public void loggedin() throws InterruptedException{
		System.out.println("ashish");
		/*Map<String, Object> loginData = pupulateUniqueData(xmlUtils.getXMLNodeValues("loginData"));*/
	Loginp log=new Loginp(driver);
	log.Login("test.123@yopmail.com", "123456");
	Thread.sleep(4000);
	}
	}


