package test;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Base_class.Base_class1;
import net.bytebuddy.utility.RandomString;
import pom_fb.pom_login;

public class Testcase_002 extends Base_class1 {
	
	 @Test
	 public void testcase_002() throws Exception {
  pom_login login		= PageFactory.initElements(driver, pom_login.class);
     login.getUsername().sendKeys("Rahul@test");
     login.getPass().sendKeys("12325");
     login.getlogin_btn().click();
     
     Thread.sleep(5000);
     
     String path="C:\\Users\\hp\\eclipse-workspace\\rahul\\rahul_maven\\selenium_screenshot";
     String rm   = RandomString.make(3);
     TakesScreenshot ts=(TakesScreenshot) driver;
     File scr  =  ts.getScreenshotAs(OutputType.FILE);
     File dest=new File (path+"//"+rm+".png");
      FileUtils.copyFile(scr, dest);

	 }

}
