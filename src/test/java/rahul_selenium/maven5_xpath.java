package rahul_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class maven5_xpath {

	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/login/");  
      // xpath locator formula= "//tagname[@attribute='value']"		
		WebElement  email    =driver.findElement(By.xpath("//input[@name='email']"));
             email.sendKeys("test@123");
              
      WebElement pass   = driver.findElement(By.xpath("//input[@id='pass']"));
      pass.sendKeys("1234");
      driver.manage().window().maximize();
      Thread.sleep(5000);
         WebElement btn  = driver.findElement(By.xpath("//button[@name='login']"));
         btn.click();
         
         Thread.sleep(2000);
         
      //   WebElement forgot=driver.findElement(By.xpath("//a[@class='_97w4']"));
	//	forgot.click();
		WebElement  forgot1  = driver.findElement(By.xpath("//a[text()='Forgotten password?']"));
		forgot1.click();
	}
}
