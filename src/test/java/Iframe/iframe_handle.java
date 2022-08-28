package Iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class iframe_handle extends Base_class {
	
	@Test
	public static void tc_001() throws Exception {
	//	driver.switchTo().frame(1);//handle by index
//WebElement seleniumframe =driver.findElement(By.xpath("//iframe[@name='Selenium']"));
    //   driver.switchTo().frame(seleniumframe);//handle by frame webElement

        driver.switchTo().frame("Selenium");//handle by string name of framework
		driver.findElement(By.xpath("//button[@class='navbar-toggler']")).click();
		Thread.sleep(5000);
		driver.switchTo().defaultContent();//driver Switch to the main page
		//driver.switchTo().frame(2);another frame switch


		//driver.switchTo().parentFrame();//driver swtich from child frame to parent frame  
		//if inbuilt frame present in one frame.
		driver.findElement(By.xpath("//a[text()=' Click here for Login FaceBook ']")).click();
		Thread.sleep(3000);
		driver.navigate().back();
	}

}
