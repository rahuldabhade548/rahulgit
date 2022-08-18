package Maven_TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class scrollby_method {
	@Test
  public void test() {
		WebDriverManager.chromedriver().setup();
		 WebDriver driver=new ChromeDriver();
		    driver.get("https://www.facebook.com/login/");
		    driver.manage().window().maximize();
		    //scroll by webElement
	WebElement english	   = driver.findElement(By.xpath("//li[text()='English (UK)']"));
	
	scrollhandle(driver,english);
	 
  }
	 public static void scrollhandle(WebDriver driver,WebElement element) {
		 JavascriptExecutor js=(JavascriptExecutor) driver;
		  js.executeScript("arguments[0].scrollIntoView()", element);
	 }

}
