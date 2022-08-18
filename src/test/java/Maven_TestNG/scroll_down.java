package Maven_TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class scroll_down {

	@Test
	public void test() throws InterruptedException {
		
	 WebDriverManager.chromedriver().setup();
	 WebDriver driver=new ChromeDriver();
	           driver.get("https://www.facebook.com/login/");
	   driver.manage().window().maximize()      ;  
	 
		
		//Scroll by pixel
		JavascriptExecutor js =(JavascriptExecutor) driver;
		Thread.sleep(3000);
	          js.executeScript("window.scrollBy(0,500)", "");
	          
	          Thread.sleep(3000);
	          js.executeScript("window.scrollBy(0,-500)", "");
	          Thread.sleep(3000);
	  //scroll by webElement   
	 WebElement marathitab       =driver.findElement(By.xpath("(//a[@class='_sv4'])[1]")) ; 
	         js.executeScript("arguments[0].scrollIntoView()",marathitab);
	         Thread.sleep(3000);
		
		
	}
	

}
