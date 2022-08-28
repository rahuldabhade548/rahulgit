package test;

import org.testng.Assert;
import org.testng.annotations.Test;

import Base_class.base_class2;

public class Testcase_003 extends base_class2 {
	
	@Test(groups="Sanity",priority=1,enabled=false)
	public void tc_001() {
		System.out.println("tc_001 pass");
		
		
	}
	
	@Test(groups="Regression",priority=2)
	public void tc_002() {
		System.out.println("tc_002 pass");
	}
	@Test(groups="Critical sanity",priority=3)
	public void tc_003() {
		System.out.println("tc_003 pass");
	}
	
	  
     
      
      
      
         
    
     
    	
    
     
  
 
      
     
   
	
	}
	


