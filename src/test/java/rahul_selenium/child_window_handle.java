package rahul_selenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class child_window_handle {

	public static void main(String[] args) {
   WebDriverManager.chromedriver().setup();
     WebDriver driver=new ChromeDriver();
            driver.get("https://demo.guru99.com/popup.php");
        driver.manage().window().maximize()  ;
       
    String parentwindowadd   =driver.getWindowHandle();//parent window address stored
        System.out.println(parentwindowadd);
        driver.findElement(By.xpath("//a[text()='Click Here']")).click();
   Set<String> alladdress  =driver.getWindowHandles();
   System.out.println(alladdress);
      Iterator<String> it = alladdress.iterator();
      
      while(it.hasNext()) {
    	 String childwindowadd = it.next();
    	 if(!parentwindowadd.equals(childwindowadd)) {
    		 driver.switchTo().window(childwindowadd);
    		 
    		 driver.findElement(By.xpath("//input[@name='emailid']")).sendKeys("");
    		 driver.close();
    		 
    		 
    		 
    		 
    	 }driver.close();
    	  
      }
      
                      
   

	}

}
