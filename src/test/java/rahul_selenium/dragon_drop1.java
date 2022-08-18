package rahul_selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class dragon_drop1 {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		driver.manage().window().maximize();
		
		Actions act=new Actions (driver);
		     
    WebElement bank = driver.findElement(By.xpath("(//a[@class='button button-orange'])[5]"));
    WebElement amount  = driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
    
    act.dragAndDrop(bank, amount).build().perform();
    Thread.sleep(1000);
   WebElement amount1 = driver.findElement(By.xpath("(//a[@class='button button-orange'])[2]"));
    WebElement account2 = driver.findElement(By.xpath("(//li[@class='placeholder'])[3]"));
      WebElement accountsales = driver.findElement(By.xpath("(//a[@class='button button-orange'])[6]"));
   
    WebElement creditamount   = driver.findElement(By.xpath("(//li[@class='placeholder'])[2]"));

     act.dragAndDrop(accountsales, creditamount).build().perform();
     act.dragAndDrop(amount1, account2).build().perform();
     
     
     
         
      
      
       
     
	}

}
