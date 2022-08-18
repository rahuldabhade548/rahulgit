package rahul_selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class maven2 {

	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		Thread.sleep(10000);
	    String title=driver.getTitle();//get title
	     System.out.println(title);//print title in console
		
	  String url=  driver.getCurrentUrl();
          System.out.println(url);
		driver.navigate().to("https://www.amazon.in/your-account");
		Thread.sleep(10000);
		driver.navigate().back();
		Thread.sleep(10000);
		driver.navigate().forward();
		Thread.sleep(5000);
		driver.navigate().refresh();
		
		
		driver.close();
	
		
		
		
	}

}
