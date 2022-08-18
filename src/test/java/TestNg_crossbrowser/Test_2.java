package TestNg_crossbrowser;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Test_2 extends base_class {
	
	@Test(groups="Sanity")
	public void amazon_testcase1() {
		driver.get("https://www.amazon.in/");
		driver.findElement(By.xpath("(//a[@class='nav-a  '])[3]")).click();
	}
	
	@Test(groups="Regression")
	
	public void amazon_testcase2() {
		driver.get("https://www.amazon.in/");
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("laptop");
	}

}
