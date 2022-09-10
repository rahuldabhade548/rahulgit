package practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IT_script {
	
	@Test
	public static void gmail_handle() throws Exception {
		
  WebDriverManager.chromedriver().setup();
  WebDriver driver=new ChromeDriver();
  driver.get("https://www.ilovepdf.com/pdf_to_word");
  driver.findElement(By.xpath("//span[text()='Select PDF file']")).click();
	
	 Runtime.getRuntime().exec("C:\\Users\\hp\\Desktop\\Fileupload1.exe");
	 
		
  


}}
