package rahul_selenium;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.commons.io.FileUtils;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.xmlbeans.impl.xb.xsdschema.ListDocument.List;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.utility.RandomString;

public class fb_test {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		           driver.get("https://www.facebook.com/");
		 driver.manage().window().maximize();
     driver.navigate().to("https://www.amazon.in/");
   WebElement all  =driver.findElement(By.xpath("//select[@name='url']"));
   Select sel=new Select(all);
   
        sel.selectByVisibleText("Appliances");
        WebElement serach  =driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
        
        String path="C:\\Users\\hp\\eclipse-workspace\\rahul\\rahul_maven\\testdata\\data.xlsx";
        
         FileInputStream fis=new FileInputStream(path);
         XSSFWorkbook xcel=new XSSFWorkbook(fis);
      String serch   =xcel.getSheet("Sheet1").getRow(11).getCell(1).getStringCellValue();
      serach.sendKeys(serch);
      driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
      
      Thread.sleep(2000);
      //scrrenshot
      String path1="C:\\Users\\hp\\eclipse-workspace\\rahul\\rahul_maven\\selenium_screenshot";
         String rm  = RandomString.make(3);
         TakesScreenshot ts=(TakesScreenshot)driver;
                File scr  =  ts.getScreenshotAs(OutputType.FILE);
                File dest=new File(path1+"\\"+rm+".png");
                FileUtils.copyFile(scr, dest);
WebElement se=        driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"))   ;
se.click();
                 
     java.util.List<WebElement> auto=driver.findElements(By.xpath("//div[@class='s-suggestion-container']/div"));
     
     for(int i=0;i<=auto.size()-1;i++) {
    	   // String Txt= auto.get(i).getText();
    	    System.out.println(auto.get(i).getText());
    	 
     }
           
      
        
	}

}
