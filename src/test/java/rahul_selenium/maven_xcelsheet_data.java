package rahul_selenium;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class maven_xcelsheet_data {

	public static void main(String[] args) throws Exception {

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		          driver.get("https://www.facebook.com/login/");
		WebElement username   =  driver.findElement(By.xpath("//input[@id='email']"));
		    WebElement pass  =driver.findElement(By.xpath("//input[@id='pass']"));
		    
		   String path="C:\\Users\\hp\\eclipse-workspace\\rahul\\rahul_maven\\testdata\\data.xlsx";
		   
		   FileInputStream file=new FileInputStream(path);
		   XSSFWorkbook xcel=new XSSFWorkbook(file);
	String data1=xcel.getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
	String data2 =xcel.getSheet("Sheet1").getRow(0).getCell(1).getStringCellValue();
	username.sendKeys(data1);
	pass.sendKeys(data2);
	
		    
		    
	}

}
