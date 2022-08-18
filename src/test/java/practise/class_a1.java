package practise;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class class_a1 extends base_class {

	
	@Test
	public void testcase_1() throws Exception {
		driver.get("https://demo.guru99.com/V4/");
		driver.manage().window().maximize();
	WebElement userid	=driver.findElement(By.xpath("//input[@name='uid']"));
	 WebElement pass=   driver.findElement(By.xpath("//input[@name='password']"));
	userid.sendKeys("1232");
	Actions act =new Actions(driver);
	   act.keyDown(Keys.TAB).keyUp(Keys.TAB).sendKeys("4516").build().perform(); 
	 driver.findElement(By.xpath("//input[@name='btnLogin']")).click();
	
	     
      
    Alert alt =  driver.switchTo().alert();
	      alt.accept();
	      
	           
	           
	           
	    
	     
	}
	
	@Test
	
	public void testcase_2() {
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		driver.manage().window().maximize();
		Actions act=new Actions (driver);
WebElement five		=driver.findElement(By.xpath("(//a[@class='button button-orange'])[4]"));
 WebElement amount =  driver.findElement(By.xpath("(//li[@class='placeholder'])[2]"));
 
    act.dragAndDrop(five, amount);
    
   WebElement selenium    = driver.findElement(By.xpath("(//a[@class='dropdown-toggle'])[1]"));
   WebElement opt   = driver.findElement(By.xpath("(//a[@class='dropdown-toggle'])[2]"));
   
    act.moveToElement(selenium).clickAndHold().build().perform();
    
     act.moveToElement(opt).contextClick().build().perform();
     
		
	}
	
}


