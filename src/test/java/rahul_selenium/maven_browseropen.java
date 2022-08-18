package rahul_selenium;

import java.sql.DriverManager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import com.github.dockerjava.api.model.Driver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class maven_browseropen {
	

	

	public static void main(String[] args) {
 
     
			WebDriverManager.chromedriver().setup();
			 
			 WebDriver driver=new ChromeDriver();
			 driver.get("https://www.instagram.com/accounts/login/");
			  driver.manage().window().maximize();
			  driver.close();
			  
			  WebDriverManager.edgedriver().setup();
				WebDriver driver1=new EdgeDriver();
				driver1.get("https://www.facebook.com/login.php/");
				driver1.close();
		
		         
		
		
		
		
		
	}

}
