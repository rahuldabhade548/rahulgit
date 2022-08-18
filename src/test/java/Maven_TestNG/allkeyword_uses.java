package Maven_TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class allkeyword_uses extends opening_closing_code {
	
	@Test(priority=4,invocationCount=2)
	public void testcase_A() {
		System.out.println("testcase A"); 
	}
	@Test(priority=3,dependsOnMethods="testcase_d")
	public void testcase_B() {
		System.out.println("testcase B");
	}
	@Test(priority=2)
	public void testcase_c() {
		System.out.println("testcase C");
	}
	@Test(priority=1)
	public void testcase_d() {
		System.out.println("testcase D");
		Assert.assertEquals(true, false);//this statement make the testcase manually false
	}

}
