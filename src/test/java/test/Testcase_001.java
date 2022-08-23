package test;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Base_class.Base_class1;
import pom_fb.pom_login;

public class Testcase_001 extends Base_class1 {
	
	@Test
	public void testcase_001() throws Exception{
pom_login login		=PageFactory.initElements(driver,pom_login.class);
    login.getUsername().sendKeys("Test@123");
    login.getPass().sendKeys("12325");
    login.getlogin_btn().click();
		
		Thread.sleep(5000);
		
		
		
	}

}
