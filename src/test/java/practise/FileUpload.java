package practise;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FileUpload {

	public static void main(String[] args) throws IOException {
		 WebDriverManager.chromedriver().setup();
		  WebDriver driver=new ChromeDriver();
		  driver.get("https://www.ilovepdf.com/pdf_to_word");
		  driver.findElement(By.xpath("//span[text()='Select PDF file']")).click();
			
	 Runtime.getRuntime().exec("C:\\Users\\hp\\Desktop\\Fileupload1.exe");// here we give location of the exe file.
			 
	}

}
