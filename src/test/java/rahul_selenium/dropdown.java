package rahul_selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class dropdown {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		  driver.get("https://demo.guru99.com/test/newtours/register.php");
		  driver.manage().window().maximize();
		  
   WebElement drop  =driver.findElement(By.xpath("//select[@name='country']"));
    Select sel =new Select(drop);
    System.out.println(sel.getFirstSelectedOption().getText());
    
    //select by index
    sel.selectByIndex(2);
    
    Thread.sleep(3000);
    
    sel.selectByValue("ANTARCTICA");
    
    Thread.sleep(3000);
    
    sel.selectByVisibleText("BERMUDA");
    
 List<WebElement>    list =sel.getOptions();
 
 System.out.println(list.size());
 
 for(int i=0;i<=list.size();i++) {
	String txt= list.get(i).getText();
	 if(txt.equals("BHUTAN")) {
		 sel.selectByVisibleText("BHUTAN");
		 break;
	 }
	 
 }
  
  
  
        
         
	}

}
