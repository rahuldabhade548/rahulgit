package rahul_selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class maven6_autosuggestion {

	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
		WebElement serach  = driver.findElement(By.xpath("//input[@name='q']"));
		serach.sendKeys("maven");
		Thread.sleep(3000);
		
		List<WebElement> autosuggestion=driver.findElements(By.xpath("//ul[@class='G43f7e']/li"));       
		          System.out.println(autosuggestion.size());
		          
		          for(int a=0;a<=autosuggestion.size();a++) {
		        	  System.out.println(autosuggestion.get(a).getText());
		       
		        	  if(autosuggestion.get(a).getText().equals("maven download")) {
		        		 autosuggestion.get(a).click();
		        	  }
		          }
		

	}

}
