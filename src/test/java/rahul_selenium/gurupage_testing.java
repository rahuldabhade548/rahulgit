package rahul_selenium;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.commons.io.FileUtils;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.xmlbeans.impl.xb.xsdschema.ListDocument.List;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.utility.RandomString;

public class gurupage_testing {

	public static void main(String[] args) throws Exception {
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	           driver.get("https://demo.guru99.com/test/newtours/register.php");
	           driver.manage().window().maximize();
	      
	WebElement firstname = driver.findElement(By.xpath("//input[@name='firstName']"));
	 WebElement lastname  = driver.findElement(By.xpath("//input[@name='lastName']"));
	 WebElement phone  = driver.findElement(By.xpath("//input[@name='phone']"));
	 WebElement email  = driver.findElement(By.xpath("//input[@name='userName']"));
	 WebElement address  = driver.findElement(By.xpath("//input[@name='address1']"));
	 WebElement city  = driver.findElement(By.xpath("//input[@name='city']"));
	 WebElement state = driver.findElement(By.xpath("//input[@name='state']"));
	 WebElement postalcode = driver.findElement(By.xpath("//input[@name='postalCode']"));
	   
	 String path="C:\\Users\\hp\\eclipse-workspace\\rahul\\rahul_maven\\testdata\\data.xlsx";
	 FileInputStream fis=new FileInputStream(path);
	 XSSFWorkbook xcel=new XSSFWorkbook(fis);
	  String fisrtname1  =xcel.getSheet("Sheet1").getRow(0).getCell(1).getStringCellValue();
	  String lastname1  =xcel.getSheet("Sheet1").getRow(1).getCell(1).getStringCellValue();
	  String phone1  =xcel.getSheet("Sheet1").getRow(2).getCell(1).getStringCellValue();
	  String email1  =xcel.getSheet("Sheet1").getRow(3).getCell(1).getStringCellValue();
	  String address1  =xcel.getSheet("Sheet1").getRow(4).getCell(1).getStringCellValue();
	  String city1 =xcel.getSheet("Sheet1").getRow(5).getCell(1).getStringCellValue();
	  String state1 =xcel.getSheet("Sheet1").getRow(6).getCell(1).getStringCellValue();
	  String postalcode1  =xcel.getSheet("Sheet1").getRow(7).getCell(1).getStringCellValue();
	  firstname.sendKeys(fisrtname1 );
	  lastname.sendKeys(fisrtname1 );
	  phone.sendKeys(phone1);
	  email.sendKeys(email1);
	  address.sendKeys(address1);
	  city.sendKeys(city1);
	  state.sendKeys(state1);
	  postalcode.sendKeys(postalcode1);
	    
	WebElement drop  =driver.findElement(By.xpath("//select[@name='country']"));
	
	Select sel=new Select(drop);
            sel.selectByVisibleText("BANGLADESH");
            
     WebElement username  = driver.findElement(By.xpath("//input[@id='email']"));
     WebElement pass  = driver.findElement(By.xpath("//input[@name='password']"));
     WebElement confirmpass  = driver.findElement(By.xpath("//input[@name='confirmPassword']"));
	  String username1  =xcel.getSheet("Sheet1").getRow(8).getCell(1).getStringCellValue();
	  String pass1  =xcel.getSheet("Sheet1").getRow(9).getCell(1).getStringCellValue();
	  String confirmpass1 =xcel.getSheet("Sheet1").getRow(10).getCell(1).getStringCellValue();

		 username.sendKeys(username1);
		 pass.sendKeys(pass1);
		 confirmpass.sendKeys(confirmpass1);
		 driver.findElement(By.xpath("//input[@name='submit']")).click();
		Thread.sleep(2000);
		 String path1="C:\\Users\\hp\\eclipse-workspace\\rahul\\rahul_maven\\selenium_screenshot";
		   String rm   =RandomString.make(3);
		   TakesScreenshot ts=(TakesScreenshot) driver;
		    File scr = ts.getScreenshotAs(OutputType.FILE);
		    File dest=new File(path1+"\\"+rm+".png");
		    FileUtils.copyFile(scr, dest);
		WebElement body    =driver.findElement(By.xpath("(//td)[31]"));
		System.out.println(body.getText());
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//a[text()=' sign-in ']")).click();
		 
		 Thread.sleep(10000);
		 
WebElement username2 =driver.findElement(By.xpath("//input[@name='userName']"));
   WebElement pass2   =  driver.findElement(By.xpath("//input[@name='password']"));
 
             username2.sendKeys(username1);
             pass2.sendKeys(pass1);
		   driver.findElement(By.xpath("//input[@name='submit']")).click();
		   
		WebElement txt=   driver.findElement(By.xpath("(//table[@cellpadding='0'])[4]"));
		   
		 System.out.println(txt.getText());
		 Thread.sleep(2000);
		 driver.navigate().to("https://demo.guru99.com/test/delete_customer.php");
		   driver.findElement(By.xpath("//input[@name='cusid']")).sendKeys(username1);
	driver.findElement(By.xpath("//input[@name='submit']")).click() ;
	    
	            
	Alert alt = driver.switchTo().alert();
	alt.accept();
	driver.switchTo().alert().accept();
	Thread.sleep(2000);
	
	driver.close();
		 
		 
		 
		 
	}

}
