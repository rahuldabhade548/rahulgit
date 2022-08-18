package TestNg_crossbrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Test_1 extends base_class {
	
	@Test(groups="Sanity")
	public void testcase1() {
		 driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("test@134");
	    driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("1232");

	}
	
	@Test(groups="Regression")
	public void testcase2() {
		 driver.get("https://www.facebook.com/");
			driver.findElement(By.xpath("//input[@name='email']")).sendKeys("home@134");
		    driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("45232");

	}
	@Test(groups="Critical Regression")
	public void testcase3() {
		 driver.get("https://www.facebook.com/");
			driver.findElement(By.xpath("//input[@name='email']")).sendKeys("REome@134");
		    driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("122232");

	}

}
