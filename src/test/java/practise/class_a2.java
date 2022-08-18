package practise;

import org.testng.annotations.Test;

public class class_a2 extends base_class{

	@Test(groups="Sanity")
	public void Testcase_1() {
		System.out.println("testcase_1");
		
	}
	
	@Test(groups="Regression")
	public void Testcase_2() {
		System.out.println("testcase_2");
	}

	@Test(groups="Critical Regression")
	public void Testcase_3() {
		System.out.println("testcase_2");
	}
	
	@Test(groups="Sanity")
	public void Testcase_4() {
		System.out.println("testcase_2");
	}
	
	
}
