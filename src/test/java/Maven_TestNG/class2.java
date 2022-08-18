package Maven_TestNG;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class class2 extends class1 {

	@Test
	public void testcase1() throws Exception {

		WebElement email=driver.findElement(By.xpath("//input[@name='email']"));
		    WebElement pass=   driver.findElement(By.xpath("//input[@id='pass']"));
		String path="C:\\Users\\hp\\eclipse-workspace\\rahul\\rahul_maven\\testdata\\data.xlsx";
		FileInputStream fil=new FileInputStream (path);
		XSSFWorkbook xcel=new XSSFWorkbook(fil);
		 String emaildata    = xcel.getSheet("Sheet1").getRow(3).getCell(1).getStringCellValue();
		email.sendKeys(emaildata);
		 String passdata         =xcel.getSheet("Sheet1").getRow(2).getCell(1).getStringCellValue();
		          pass.sendKeys(passdata);
		   driver.findElement(By.xpath("//button[@name='login']")).click()  ;     
		
	}}