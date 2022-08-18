package practise;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.utility.RandomString;

public class scrollby_method {
	@Test
  public void amazon() throws Exception {
	   WebDriverManager.chromedriver().setup();
	   WebDriver driver=new ChromeDriver();
	         driver.get("https://www.amazon.in/");
	         driver.manage().window().maximize();
	WebElement about      = driver.findElement(By.xpath("(//li[@class='nav_first'])[1]"));
	  WebElement all      = driver.findElement(By.xpath("(//a[@class='nav-a  '])[1]"));
	         script(driver,about);
	         Thread.sleep(3000);
	         script(driver,all);
		
	         screenshot(driver);

}
	public static void script(WebDriver driver,WebElement element) throws Exception {
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		  
		      js.executeScript("arguments[0].scrollIntoView()", element);
		
	}
	public static void screenshot(WebDriver driver) throws Exception {
   String path="C:\\Users\\hp\\eclipse-workspace\\rahul\\rahul_maven\\selenium_screenshot";
   String rm = RandomString.make(3);
    TakesScreenshot ts=(TakesScreenshot) driver;
       File scr            = ts.getScreenshotAs(OutputType.FILE);
         File dest=new File(path+"//"+rm+".png");
         FileUtils.copyFile(scr, dest);
		
	}
	
	
}