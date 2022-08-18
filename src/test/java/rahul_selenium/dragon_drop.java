package rahul_selenium;

import java.awt.RenderingHints.Key;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class dragon_drop {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
       WebDriver driver=new ChromeDriver();
            driver.get("https://www.facebook.com/login/");
            
       Actions act =new Actions(driver);
       
     WebElement username   = driver.findElement(By.xpath("//input[@id='email']"));
              
      act.keyDown(Keys.SHIFT).sendKeys("rahul").keyUp(Keys.SHIFT).keyDown(Keys.TAB).sendKeys("dabhade").keyUp(Keys.TAB).build().perform();
      act.keyDown(Keys.TAB).click().keyUp(Keys.TAB).build().perform();
	}

}
