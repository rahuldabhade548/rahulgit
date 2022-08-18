package rahul_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class maven3 {

	public static void main(String[] args) throws Exception {
		//browser open code
		 WebDriverManager.chromedriver().setup();
		 
		 WebDriver driver=new ChromeDriver();
		 driver.get("https://www.facebook.com/login/");
		 driver.manage().window().maximize();
		 Thread.sleep(5000);
		 
	WebElement	username =driver.findElement(By.name("email"));
	username.sendKeys("rahuldabhade548@gmail.com");
//webElement is a return type of findElement so we used weblement & its reference variable
// sendkey is the method of webElement	
	
	 WebElement  pass   =driver.findElement(By.id("pass"));
	 pass.sendKeys("8698581232");
	 Thread.sleep(5000);
	 WebElement button= driver.findElement(By.id("loginbutton"));
	 button.click();
	 Thread.sleep(5000);
	 driver.close();
	       
     
		 

	}

}
