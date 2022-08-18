package rahul_selenium;

import java.awt.Desktop.Action;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class maven_action {

	public static void main(String[] args) throws Exception {
	WebDriverManager.chromedriver().setup();
	
	WebDriver driver=new ChromeDriver();
	         driver.get("https://www.google.com/");
	         
	WebElement gmail    =driver.findElement(By.xpath("//a[text()='Gmail']"));
    
	Actions act=new Actions(driver);
	
	act.moveToElement(gmail).build().perform();//only mouse goes to gmail element on webpage
	//when we want move mouse on that and click then use click action also
         //act.moveToElement(gmail).click().build().perform();
	
	
	   
	
	       
	}

}
