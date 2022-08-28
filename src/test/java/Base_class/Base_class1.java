package Base_class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base_class1 {
  public static	WebDriver driver;
@BeforeMethod
public void BM() {
	WebDriverManager.chromedriver().setup();
	  driver =new ChromeDriver();
	  driver.get("https://www.facebook.com/login/");
	  driver.manage().window().maximize();
	  
	  
	
}

@AfterMethod
public void AM() {
	driver.close();
}
}
