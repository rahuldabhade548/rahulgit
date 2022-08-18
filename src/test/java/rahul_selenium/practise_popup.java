package rahul_selenium;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Iterator;
import java.util.Set;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class practise_popup {

	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		           driver.get("https://demo.guru99.com/popup.php");
		           driver.manage().window().maximize();
		           
		 String parentwindowadd   =driver.getWindowHandle();
		           
		       driver.findElement(By.xpath("//a[text()='Click Here']")).click();
		       
   //child window -popup handling  
		       
	Set <String> allwindowadd   = driver.getWindowHandles();
	   Iterator <String> it  = allwindowadd .iterator();
	   
	       while(it.hasNext())      {
	    String childwindowadd = it.next();
	    
	    if(! parentwindowadd.equals(childwindowadd)) {
	    	driver.switchTo().window(childwindowadd);
	 WebElement submit_txt  =driver.findElement(By.xpath("//input[@name='emailid']"));
	 
	String path="C:\\Users\\hp\\eclipse-workspace\\rahul\\rahul_maven\\testdata\\data.xlsx";
	 FileInputStream file=new FileInputStream(path);
	 XSSFWorkbook xecl=new XSSFWorkbook(file);
	   String data    =  xecl.getSheet("Sheet1").getRow(2).getCell(1).getStringCellValue();
	               
           submit_txt.sendKeys(data);
        driver.findElement(By.xpath("//input[@name='btnLogin']")).click();
           Thread.sleep(1000);
	    	
	    	driver.close();//close child window
	    }
	    	
	       }
		       
		      
		           
		
		
	}

}
