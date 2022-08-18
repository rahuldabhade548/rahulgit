package rahul_selenium;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public abstract class maven_testdata_excelsheet {

	public static void main(String[] args) throws Exception {
      
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
	driver.get("https://www.facebook.com/login/");
WebElement username	 =driver.findElement(By.xpath("//input[@id='email']"));
  WebElement pass    =  driver.findElement(By.xpath("//input[@id='pass']"));
  
    String path ="C:\\Users\\hp\\eclipse-workspace\\rahul\\rahul_maven\\testdata\\data.xlsx";
   
    FileInputStream fil=new FileInputStream(path);
    XSSFWorkbook wb=new XSSFWorkbook(fil);
      
   String data1   = wb.getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
   System.out.println(data1);
     String data2  = wb.getSheet("Sheet1").getRow(0).getCell(2).getStringCellValue();
      System.out.println(data2);
      
      username.sendKeys(data1);
      pass.sendKeys(data2);
    
		
		
		
	}

}
