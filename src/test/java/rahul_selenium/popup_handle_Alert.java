package rahul_selenium;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Random;

import org.apache.commons.io.FileUtils;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.utility.RandomString;

public class popup_handle_Alert {

	public static void main(String[] args) throws Exception  {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		       driver.get("http://demo.guru99.com/test/delete_customer.php");
		       driver.manage().window().maximize();
	WebElement txt_submit=	 driver.findElement(By.xpath("//input[contains(@name,'cusid')]"));
	
	String path="C:\\Users\\hp\\eclipse-workspace\\rahul\\rahul_maven\\testdata\\data.xlsx";
	FileInputStream file=new FileInputStream(path);
	XSSFWorkbook xcl=new XSSFWorkbook(file);
	String data    =xcl.getSheet("Sheet1").getRow(0).getCell(2).getStringCellValue();
	txt_submit.sendKeys(data);
	driver.findElement(By.xpath("//input[contains(@name,'submit')]")).click();
        //Pop handle
	    Alert alt   = driver.switchTo().alert();
	    System.out.println(alt.getText());
	    alt.accept();
	    Thread.sleep(5000);
	    System.out.println(alt.getText());
	  
	                
	  	    Thread.sleep(2000);
	    alt.accept();
	    
	    String scrpath="C:\\Users\\hp\\eclipse-workspace\\rahul\\rahul_maven\\selenium_screenshot";
	     String rm=  RandomString.make(3);
	     TakesScreenshot ts=(TakesScreenshot) driver;
	     File scr = ts.getScreenshotAs(OutputType.FILE);
	            File dest=new File(scrpath+"\\"+rm+".png");
	          FileUtils.copyFile(scr, dest);

	    
	    
	    
	
		          

	}

}
