package Assert_use;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class base_class {
	WebDriver driver;
	@BeforeMethod
	public void BM() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
	}
	
	@AfterMethod
	public void AF() {
		driver.close();
	}

}
