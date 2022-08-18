package practise;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class test1 {
	WebDriver driver;
	@BeforeMethod
	public void BM() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		  
	}
	
	@AfterMethod
	public void AM() {
		driver.close();
	}

}
