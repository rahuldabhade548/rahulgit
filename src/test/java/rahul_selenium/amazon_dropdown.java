package rahul_selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class amazon_dropdown {

	public static void main(String[] args) {
	
	WebDriverManager.chromedriver().setup();	
	
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3F%26ext_vrnc%3Dhi%26tag%3Dgooginhydr1-21%26ref%3Dnav_ya_signin%26adgrpid%3D55759171661%26hvpone%3D%26hvptwo%3D%26hvadid%3D611438704220%26hvpos%3D%26hvnetw%3Dg%26hvrand%3D2323667110962631478%26hvqmt%3De%26hvdev%3Dc%26hvdvcmdl%3D%26hvlocint%3D%26hvlocphy%3D9040229%26hvtargid%3Dkwd-318610508581%26hydadcr%3D5840_2359610%26gclid%3DEAIaIQobChMI9JG-9qmo-QIVvJJmAh34YgsmEAAYASAAEgINgfD_BwE&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&");

	 driver.manage().window().maximize();
	   
	  WebElement createbtn  = driver.findElement(By.xpath("//a[@id='createAccountSubmit']"));
	  createbtn.click();
driver.findElement(By.xpath("//input[@name='customerName']")).sendKeys("rahul dabhade");
 
    driver.findElement(By.xpath("//span[@class='a-dropdown-prompt']")).click();
    
     List<WebElement>   list =driver.findElements(By.xpath("//a[@class='a-dropdown-link']"));
     System.out.println(list.size());
     
     
    for (int i=0;i<=list.size();i++) {
         String txt= list.get(i).getText();
         if(txt.equals("Germany +49")) {
        	 list.get(i).click();
        	 driver.findElement(By.xpath("//input[@name='email']")).sendKeys("8698581232") ;
        	 driver.findElement(By.xpath("//input[@name='password']")).sendKeys("dabhade123");
        	 driver.findElement(By.xpath("//input[@id='continue']")).click();

         }
    	
    }
     








	       
	
	}

}
