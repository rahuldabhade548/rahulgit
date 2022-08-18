package rahul_selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class fbdropdown {

	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver ();
		
       driver.get("https://www.facebook.com/reg/");
  WebElement firstname = driver.findElement(By.xpath("(//input[@class='inputtext _58mg _5dba _2ph-'])[1]"));
  firstname.sendKeys("rahul");
  
  driver.findElement(By.xpath("(//input[@class='inputtext _58mg _5dba _2ph-'])[2]")).sendKeys("dabahde");
   driver.findElement(By.xpath("(//input[@class='inputtext _58mg _5dba _2ph-'])[3]")).sendKeys("8945122512");
   driver.findElement(By.xpath("(//input[@class='inputtext _58mg _5dba _2ph-'])[5]")).sendKeys("rahul@123#");
   
   WebElement dob=driver.findElement(By.xpath("//select[@name='birthday_day']"));
   
      Select sel=new Select(dob);
      
      sel.getFirstSelectedOption().getText();
      Thread.sleep(3000);
      sel.selectByVisibleText("11");
  WebElement month    =driver.findElement(By.xpath("//select[@name='birthday_month']"));
      Select selec=new Select (month);
      selec.selectByVisibleText("Mar");
      Thread.sleep(2000);
  WebElement year    =driver.findElement(By.xpath("(//select[@class='_9407 _5dba _9hk6 _8esg'])[3]"));
      Select select=new Select (year);
      select.selectByValue("1996");
      Thread.sleep(2000);
        driver.findElement(By.xpath("(//label[@class='_58mt'])[2]")).click();

     
      driver.findElement(By.xpath("//button[@name='websubmit']")).click();
  
      
      
	}

}
