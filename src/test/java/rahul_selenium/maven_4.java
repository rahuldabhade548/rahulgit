package rahul_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class maven_4 {
     //here we open amazon page in google chrome and search hp laptop
	public static void main(String[] args) throws Exception {
	
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		Thread.sleep(5000);
		
           WebElement searchtab =driver.findElement(By.id("twotabsearchtextbox"));
                      String title     =driver.getTitle();
                      System.out.println(title);
                searchtab.sendKeys("hp laptop");
                    
           WebElement searchbutton=driver.findElement(By.id("nav-search-submit-button"));
           searchbutton.click();
           
           String title1=driver.getTitle();
           
	 
	 
	 
	  
		
		

	}

}
