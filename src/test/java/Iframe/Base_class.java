package Iframe;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base_class {
	public static  WebDriver driver;
	
	@BeforeMethod
	public static void BM() {
  WebDriverManager.chromedriver().setup();
   driver=new ChromeDriver();
   driver.get("file:///C:/Users/hp/Desktop/Iframe.html ");
   driver.manage().window().maximize();
		
	}
	
	@AfterMethod
	public static void AM() {
		driver.close();
	}

}
