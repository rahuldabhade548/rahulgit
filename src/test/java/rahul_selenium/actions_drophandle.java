package rahul_selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class actions_drophandle {

	public static void main(String[] args) throws Exception {
		
	  WebDriverManager.chromedriver().setup();
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://demo.guru99.com/V4/");
	  driver.manage().window().maximize();
	  
	WebElement selenium_element = driver.findElement(By.xpath("(//a[@class=\'dropdown-toggle\'])[1]"));
	  Actions act=new Actions(driver);
	  
	  act.moveToElement(selenium_element).click().build().perform();
	  
	   List<WebElement>   list  =driver.findElements(By.xpath("//ul[@class='dropdown-menu']/li"));
         System.out.println(list.size());
         Thread.sleep(1000);
         for (int i=0;i<=list.size();i++)	   {
        	 String txt=list.get(i).getText();
        	 System.out.println(txt);
        	 if(txt.equals("File Upload")) {
        		list.get(i).click();
        		Thread.sleep(2000);
        		driver.navigate().back();
        		Thread.sleep(2000);
        	// move on and click on agile project element on Webpage	
     WebElement agile  =driver.findElement(By.xpath("//a[text()='Agile Project']"));
        act.moveToElement(agile).doubleClick().build().perform();
        		 
        	 }
      
         }
         
         
         
	}

}
