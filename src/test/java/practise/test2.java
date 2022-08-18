package practise;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class test2 extends test1 {
	 @Test
	 public void popup() throws InterruptedException {
		 driver.get("https://demo.guru99.com/popup.php");
		 driver.manage().window().maximize();
	String parentadd	= driver.getWindowHandle();
	  System.out.println(parentadd);
	  driver.findElement(By.xpath("//a[text()='Click Here']")).click();
	Set<String>    alladd     =driver.getWindowHandles();
	 System.out.println(alladd);
	     Iterator<String> it   =alladd.iterator();
	      while(it.hasNext()) {
	    String childadd=it.next();
	    if(!parentadd.equals(childadd)) {
	    	driver.switchTo().window(childadd);
	    	
	WebElement submit    	=driver.findElement(By.xpath("//input[@name='btnLogin']"));

      Actions act=new Actions(driver);
         act.click().build().perform();
	    	
	    	
	    }
	    	  
	      }
	  
	 }

}
