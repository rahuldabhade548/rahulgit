package Maven_TestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class how_test_annotation_work {
 @BeforeSuite
 
 public void BS() {
	 System.out.println("BS");
 }
 
 @BeforeTest
 public void BT() {
	 System.out.println("BT");
 }
 
 @BeforeClass
 public void BC() {
	 System.out.println("BC");
 }
 
	@BeforeMethod
	public void BM(){
		System.out.println("BM--browser open code");
	}
	@ Test
	public void testcase1() {
		System.out.println("testcase1 code");
	}
	@Test
	public void testcase2() {
		System.out.println("test case2 code");
	}
	@AfterMethod
	public void AM() {
		System.out.println("AM-browser close code");
	}
	@AfterClass
	public void AC() {
		System.out.println("AC");
	}
	@AfterTest 
	public void AT() {
		System.out.println("AT");
	}
	
	@AfterSuite
	
	public void AS() {
		System.out.println("AS");
	}
}
