package Maven_TestNG;

import static org.testng.Assert.assertTrue;
import static org.testng.Assert.fail;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.commons.io.FileUtils;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.xmlbeans.impl.xb.xsdschema.ListDocument.List;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import net.bytebuddy.utility.RandomString;

public class testcase_useallkeyword extends opening_closing_code {
	
	
	@Test(priority=1)
	public void testcase_amazon() {
		driver.get("https://www.amazon.in/");
	WebElement alltab	=driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
	
	Select sel=new Select (alltab);
	System.out.println(sel.getOptions());
	sel.selectByVisibleText("Gift Cards");
	
 driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
 
     java.util.List<WebElement>   list   =driver.findElements(By.xpath("//ul[@class='a-unordered-list a-nostyle a-vertical a-spacing-medium']/li"));
     for(int a=0;a<=list.size()-1;a++){
    	      String Txt  =list.get(a).getText();
    	 if(Txt.equals("Friendship")) {
    	      list.get(a).click();
    		 
    	 }
    	 
     }
	}
	@Test(priority=2,invocationCount=2,dependsOnMethods="testcase_3")
	public void Testcase_fb() throws Exception {
		driver.get("https://en-gb.facebook.com/login/");
	WebElement username=driver.findElement(By.xpath("//input[@name='email']"));
	  WebElement pass= driver.findElement(By.xpath("//input[@name='pass']"));
	    String path="C:\\Users\\hp\\eclipse-workspace\\rahul\\rahul_maven\\testdata\\data.xlsx";
	    
	    FileInputStream file=new FileInputStream(path);
	    XSSFWorkbook xcel=new XSSFWorkbook (file);
	     String userdata   = xcel.getSheet("Sheet1").getRow(3).getCell(1).getStringCellValue();
	     String passdata = xcel.getSheet("Sheet1").getRow(2).getCell(1).getStringCellValue();
		    username.sendKeys(userdata)   ;
		    pass.sendKeys(passdata);
		    driver.findElement(By.xpath("//button[@name='login']")).click();
		    
 String path1="C:\\Users\\hp\\eclipse-workspace\\rahul\\rahul_maven\\selenium_screenshot";
   String rm   =  RandomString.make(3);
   TakesScreenshot ts=(TakesScreenshot) driver;
       File scr  =ts.getScreenshotAs(OutputType.FILE);
       File  dest=new File(path1+"//"+rm+".png");
        FileUtils.copyFile(scr, dest);
 
	}
	@Test(priority=0)
	public void testcase_3() {
		System.out.println("testcase3");


	}
	
	

}
