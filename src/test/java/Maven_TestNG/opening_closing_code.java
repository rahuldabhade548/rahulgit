package Maven_TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class opening_closing_code {
	WebDriver driver;
	@BeforeMethod
	public void Browser_open() {
		WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
	}
	@AfterMethod
	public void Browser_close() {
		driver.close();
	}
	

}
