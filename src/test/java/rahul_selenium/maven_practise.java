package rahul_selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class maven_practise {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
              
	          driver.get("https://www.google.com/");
   WebElement icon =   driver.findElement(By.xpath("//div[@id='gbwa']"));
   
    Actions act=new Actions(driver);
    act.moveToElement(icon).click().build().perform();
    Thread.sleep(2000);
      driver.navigate().to("https://www.linkedin.com/login") ;
      
  driver.findElement(By.xpath("//input[@id='username']")).sendKeys("rahuldabhade548@gmail.com");
	   
	   act.keyDown(Keys.TAB).keyUp(Keys.TAB).sendKeys("Rahul@1996#").build().perform();
	   Thread.sleep(2000);
	   driver.findElement(By.xpath("(//button[text()='Sign in'])")).click();
         Thread.sleep(2000);
    	driver.navigate().to("https://www.amazon.com/")	;   
    	
WebElement alltab    	=driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
    	
    Select sel=new Select(alltab);
       List    < WebElement>    list = sel.getOptions();
     sel.selectByVisibleText("Books");
     act.keyDown(Keys.TAB).click().build().perform();
    	
    	  }
    	 
    
    
    
    
      
    
     
	}


