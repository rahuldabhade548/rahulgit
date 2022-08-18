package rahul_selenium;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Random;

import org.apache.commons.io.FileUtils;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.utility.RandomString;

public class test_xcelsheet {
	
public static void main (String []args) throws Exception {
    WebDriverManager.chromedriver().setup();
    WebDriver driver=new ChromeDriver();
       driver.get("https://www.facebook.com/login/");
       
  WebElement username      =driver.findElement(By.xpath("//input[@id='email']"));
   WebElement pass         =driver.findElement(By.xpath("//input[@id='pass']"));
   
     String path="C:\\Users\\hp\\eclipse-workspace\\rahul\\rahul_maven\\testdata\\data.xlsx";
    
      FileInputStream file=new FileInputStream(path);
      XSSFWorkbook xff=new XSSFWorkbook(file);
      
     String data1   = xff.getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
       double data2 = xff.getSheet("Sheet1").getRow(0).getCell(1).getNumericCellValue();
       System.out.println(data2);
  //code for converting datatype  from double to string for numeric value    
    String data_2  =String.valueOf(data2);//converted double data type into string format
     String data_2_ = data_2.replace(".0", "");//1234.0 replace 1234
     System.out.println(data_2_);
     
     username.sendKeys(data1);
     pass.sendKeys(data_2_);
     //scrrenshot code
  String path_Scshot="C:\\Users\\hp\\eclipse-workspace\\rahul\\rahul_maven\\selenium_screenshot";
     String rm=RandomString.make(3);
      TakesScreenshot ts=(TakesScreenshot) driver;
        File scr  =  ts.getScreenshotAs(OutputType.FILE);
      File dest=new File(path_Scshot+"\\"+rm+".png");
      FileUtils.copyFile(scr, dest);
     
      
     
     
}                   
}
