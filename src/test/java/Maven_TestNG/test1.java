package Maven_TestNG;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class test1 {
	WebDriver driver;
	@BeforeMethod
	public void open() {
		//browser open code
		WebDriverManager.chromedriver().setup();
	    driver=new ChromeDriver();
		         
	}
	
	
	@Test(groups="Sanity")
	public void test_case1() throws Exception {
		 driver.get("https://www.facebook.com/login/");
		WebElement email=driver.findElement(By.xpath("//input[@name='email']"));
		    WebElement pass=   driver.findElement(By.xpath("//input[@id='pass']"));
		String path="C:\\Users\\hp\\eclipse-workspace\\rahul\\rahul_maven\\testdata\\data.xlsx";
		FileInputStream fil=new FileInputStream (path);
		XSSFWorkbook xcel=new XSSFWorkbook(fil);
		 String emaildata    = xcel.getSheet("Sheet1").getRow(3).getCell(1).getStringCellValue();
		email.sendKeys(emaildata);
		 String passdata         =xcel.getSheet("Sheet1").getRow(2).getCell(1).getStringCellValue();
		          pass.sendKeys(passdata);
		   driver.findElement(By.xpath("//button[@name='login']")).click()  ;     
	}
	
	@Test(groups="Regression")
	public void test_case2() throws Exception {
		 driver.get("https://www.facebook.com/login/");
		WebElement email=driver.findElement(By.xpath("//input[@name='email']"));
	    WebElement pass=   driver.findElement(By.xpath("//input[@id='pass']"));
	String path="C:\\Users\\hp\\eclipse-workspace\\rahul\\rahul_maven\\testdata\\data.xlsx";
	FileInputStream fil=new FileInputStream (path);
	XSSFWorkbook xcel=new XSSFWorkbook(fil);
	 String emaildata    = xcel.getSheet("Sheet1").getRow(2).getCell(1).getStringCellValue();
	email.sendKeys(emaildata);
	 String passdata         =xcel.getSheet("Sheet1").getRow(9).getCell(1).getStringCellValue();
	          pass.sendKeys(passdata);
	   driver.findElement(By.xpath("//button[@name='login']")).click()  ;  
		
	}
	
	@AfterMethod
	public void browseclose() {
		//browser closing codes
		driver.close();
	}

}
