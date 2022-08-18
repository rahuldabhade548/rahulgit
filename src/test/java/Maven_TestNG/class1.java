package Maven_TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class class1 {

	 WebDriver driver;
		
  @BeforeMethod
  
  public void browseropen() {
	  WebDriverManager.chromedriver().setup();
	  driver=new ChromeDriver();
	  driver.get("https://www.facebook.com/login/");
  }
		
  @AfterMethod
  
  public void browserclose() {
	  driver.close();
  }
	

}
