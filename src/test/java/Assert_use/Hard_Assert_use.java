package Assert_use;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import net.bytebuddy.utility.RandomString;

public class Hard_Assert_use extends base_class{
	
	@Test
	public void Test_1() throws Exception {
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
	     String excepted="Happy Independence Day";
	     Assert.assertEquals(actual, excepted);//stop next step executation when diffrence ocuur
	     
	     System.out.println("Test Done");
	     driver.get("https://www.amazon.in/");
	}
	
	@Test
	public void testcase2() {
		driver.get("https://www.facebook.com/login/");
	}

}
