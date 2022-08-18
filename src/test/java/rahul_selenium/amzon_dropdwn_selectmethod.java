package rahul_selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class amzon_dropdwn_selectmethod {
 
	public static void main(String[]args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		  driver.get("https://www.amazon.in/");
		  driver.manage().window().maximize();
		  
	WebElement alltab	  = driver.findElement(By.xpath("//select[@name='url']"));
	
	Select sel=new Select(alltab);
	List<WebElement> list =sel.getOptions();
	System.out.println(list.size());
	sel.selectByVisibleText("Office Products");
	    Thread.sleep(2000);
	
             driver.findElement(By.xpath("//input[@value='Go']")).click();
	Thread.sleep(1000);
  WebElement element    =driver.findElement(By.xpath("(//span[@class='nav-a-content'])[2]"));
	 Actions act=new Actions (driver);
	 act.moveToElement(element).click().build().perform();
	 
	 driver.navigate().to("https://www.instagram.com/");
	 Thread.sleep(1000);
  WebElement username	 =driver.findElement(By.xpath("//input[@name='username']"));
    username.sendKeys("rahul");
   WebElement pass    =driver.findElement(By.xpath("(//input[@aria-required='true'])[2]"));
	 
	 pass.sendKeys("rahul@123");
	     WebElement login          = driver.findElement(By.xpath("//button[@class='sqdOP  L3NKy   y3zKF     ']"));
	  login.click();
	
	 String title= driver.getTitle();
	 System.out.println(title);
	    driver.navigate().back();
	    Thread.sleep(2000);
	    
	    driver.navigate().back();
	    
	    Thread.sleep(2000);
	    
            driver.get("https://demo.guru99.com/test/simple_context_menu.html");
            Thread.sleep(1000);
	WebElement rightclick        = driver.findElement(By.xpath(" //span[text()='right click me']"));
	act.contextClick(rightclick).build().perform();
	
	  driver.findElement(By.xpath("//li[@class='context-menu-item context-menu-icon context-menu-icon-edit']")).click();
	  
	}

	
}
