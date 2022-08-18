package Assert_use;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import net.bytebuddy.utility.RandomString;

public class Softassert_use extends base_class {
	
	
	
	@Test
	public void Testcase_1() throws Exception {
		driver.get("https://www.amazon.in/");
	driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Mobile")	;
	driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
	driver.findElement(By.xpath("(//span[@class='a-truncate-cut'])[2]")).click();
	
	String path="C:\\Users\\hp\\eclipse-workspace\\rahul\\rahul_maven\\selenium_screenshot";
    String rm	=RandomString.make(3);
	TakesScreenshot ts=(TakesScreenshot) driver;
	  File scr    =ts.getScreenshotAs(OutputType.FILE);
	  File dest=new File(path+"//"+rm+".png");
	  FileUtils.copyFile(scr, dest);
	WebElement txt  =driver.findElement(By.xpath("//span[@id='productTitle']"));
	   System.out.println(txt.getText());
	WebElement txt1   =driver.findElement(By.xpath("//a[@aria-label='Happy Independence Day']"));
	   
	     String actual  =  txt1.getText();
	     System.out.println(actual);
	     String excepted="Happy Independence Day";
	    SoftAssert soft=new SoftAssert();
	       soft.assertEquals(actual, excepted);//result not match but go the next step
	     
	     System.out.println("amazon page Test Done");
	     
	     driver.navigate().to("https://www.flipkart.com/");
	     System.out.println("flipkart link open");
	     soft.assertAll();
	     
	}
	
	@Test
	public void testcase2_() {
		driver.get("https://www.facebook.com/login/");
	}


}
