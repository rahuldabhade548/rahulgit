package rahul_selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class maven_dropdown {

	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		
	     WebDriver driver=new ChromeDriver();
	     
	     driver.get("https://www.amazon.com/");
	     driver.manage().window().maximize();
	     
	 WebElement drop   = driver.findElement(By.xpath("//select[@name='url']"));
	     
	     drop.click();
	  Select sel=new Select(drop);
			 
	     System.out.println(sel.getFirstSelectedOption().getText());
	     
	     sel.selectByIndex(1);
	     Thread.sleep(2000);

	     sel.selectByVisibleText("Automotive");
	     
	     Thread.sleep(2000);
	     driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
		 drop.click();
	     
	      
	List<WebElement>  list = sel.getOptions();
	     
	     System.out.println(list.size());
	     
    for(int i=0;i<=list.size();i++) {
	    	 
	    	 System.out.println(list.get(i).getText());
	    	
	    	 String txt=list.get(i).getText();
	    	 if(txt.equals("Automotive")) {
	    		 
	    		 
	    	 }
	 
	    	 
	     }
	}
}


