package TestNg_crossbrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class base_class {
WebDriver driver;
     @Parameters({"BrowserName"})
	 @BeforeMethod
	 public void BF(String BrowserName) {
    	 if(BrowserName.equalsIgnoreCase("Chrome")) {
    		 WebDriverManager.chromedriver().setup();
	          driver=new ChromeDriver();
    		
    	 }else if(BrowserName.equalsIgnoreCase("Edge")) {
    		 WebDriverManager.edgedriver().setup();
	          driver=new EdgeDriver();
    	 }
	   
	         
	 }
	 @AfterMethod
	 public void AF() {
		 driver.close();
	 }
	
}
