package rahul_selenium;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.utility.RandomString;

public class maven_instagram {

	public static void main(String[] args) throws Exception {
	WebDriverManager.chromedriver().setup();
	
	 WebDriver driver=new ChromeDriver();
	 driver.get("https://www.facebook.com/login/");
	 driver.manage().window().maximize();
  WebElement username  =driver.findElement(By.xpath("//input[@name='email']"));
  username.sendKeys("test@123");
    driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("1234");
    
    driver.findElement(By.xpath("//button[@name='login']")).click();
    
     String path="C:\\Users\\hp\\eclipse-workspace\\rahul\\rahul_maven\\selenium_screenshot";
         String rm   = RandomString.make(3);
     TakesScreenshot ts=   (TakesScreenshot) driver;
     
     File  scr  =ts.getScreenshotAs(OutputType.FILE);
     File dest=new File(path+"\\"+rm+".png");
     FileUtils.copyFile(scr, dest);
      
	
	}

}
