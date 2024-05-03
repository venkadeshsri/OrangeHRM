package orange_Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.OrangeTestBase;

public class Orange_LoginPage extends OrangeTestBase {
	
	//logo
		@FindBy(xpath ="//img[@alt='company-branding'] ")  WebElement logo;
		@FindBy(xpath="//div[@class='orangehrm-login-logo']//img[@alt='orangehrm-logo']") WebElement loginlogo;
		
		//label
		@FindBy(xpath="//label[normalize-space()='Username']") WebElement usrnamelabel;
		@FindBy(xpath="//label[normalize-space()='Password']") WebElement pwdlabel;
		
		@FindBy(xpath=".//input[@name='username']") WebElement usrname;
		@FindBy(xpath="//input[contains(@type,'password')]") WebElement password;
		@FindBy(xpath="//button[normalize-space()='Login']") WebElement loginbutton;
		
		//Initiating PageFactory elements --> driver will access from "base" -->needs to give "extends OrangeTestBase"
		  public Orange_LoginPage() 
		  { 
			  PageFactory.initElements(driver, this);
			  
		  }
		  
		  
		  //Actions
		  
		  public String test_title()
		  {
			  return driver.getTitle();
		  }
		  
		  public Boolean test_logo()
		  {
			  return logo.isDisplayed();
			  
		  }
		  
		  public Boolean test_login_logo()
		  {
			  return loginlogo.isDisplayed();
		  }
		  
		  public String test_usrname_label()
		  {
			  return usrnamelabel.getText();
		  }
		  
		  public String test_pwd_label() {
			  return pwdlabel.getText();
		  }
		  
		  public Orange_HomePage test_usrname(String un, String pwd) {
			  
			  usrname.isEnabled();
			  password.isEnabled();
			  usrname.sendKeys(un);
			  password.sendKeys(pwd);
			  loginbutton.click();
			  return new Orange_HomePage();
		  }

	
	

}
