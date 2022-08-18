package rahul_selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class amazon_autosuggestion {

	public static void main(String[] args) throws Exception {
     
		WebDriverManager.chromedriver().setup();
		
		 WebDriver driver=new ChromeDriver();
		 driver.get("https://www.amazon.in/");
		 driver.manage().window().maximize();
		 WebElement serach = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		  
		      serach.sendKeys("laptop");
		      Thread.sleep(3000);
		      
   List<WebElement> suggetion= driver.findElements(By.xpath("//div[@class='autocomplete-results-container']/div"));
		
            System.out.println(suggetion.size());
            
            for(int i=0;i<=suggetion.size();i++) {
            	System.out.println(suggetion.get(i).getText());
            	if(suggetion.get(i).getText().equals("laptop bag")) {
            		suggetion.get(i).click();
            		
            	}
            	
            }
   
   
	}

}
