package pom_fb;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;



public class pom_login  {
  
	@FindBy(how=How.XPATH,using=("//input[@name='email']"))
			private WebElement username;
	
	@FindBy(how=How.XPATH,using=("//input[@name='pass']"))
	private WebElement pass;
	
    @FindBy(how=How.XPATH,using=("//button[@name='login']"))
    private WebElement login_btn;

	public WebElement getUsername() {
		return username;
	}


	public WebElement getPass() {
		return pass;
	}



	public WebElement getlogin_btn() {
		return login_btn;
	}

	
    
    
    
    
    
			
	
}
