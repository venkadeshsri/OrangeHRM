package orange_Pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.OrangeTestBase;

public class Orange_Pim_personaldetails extends OrangeTestBase {
	
	@FindBy(xpath="//h6[normalize-space()='Personal Details']")
	WebElement personal_label;
	@FindBy(xpath="//*[contains(@name,'firstName')]")
	WebElement pd_firstname;
	@FindBy(xpath="//*[contains(@name,'lastName')]") WebElement pd_lastname;
	@FindBy(xpath="//body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]"
			+ "/div[2]/div[1]/form[1]/div[2]/div[1]/div[1]/div[1]/div[2]/input[1]")
	WebElement pd_emp_id;
	
	@FindBy(xpath="(//input[@placeholder='yyyy-mm-dd'])[1]") WebElement lic_exp_dt;
	//@FindBy(xpath="(//*[contains(text(),'-- Select --')])[1]") WebElement nationality_ddl;
	
	@FindBy(xpath="/html/body/div/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[3]/div[1]/div[1]/div/div[2]/div/div") WebElement nationality_ddl;
	@FindBy(xpath="(//*[contains(text(),'-- Select --')])[2]") WebElement maritial_status;
	@FindBy(xpath="(//input[@placeholder='yyyy-mm-dd'])[2]") WebElement dob;
	@FindBy(xpath="(//input[@type='radio'])[1]") WebElement gen_male;
	@FindBy(xpath="(//input[@type='radio'])[2]") WebElement gen_female;
	@FindBy(xpath="(//button[@type='submit'])[1]") WebElement Save_button1;
	
	public Orange_Pim_personaldetails()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void verify_fandl_names()
	{
		
		
		System.out.println("Is Firstname displaying : " + pd_firstname.isDisplayed());
		System.out.println("Is Last name displaying : " + pd_lastname.isDisplayed());
		System.out.println("First name is : " + pd_firstname.getText());
		System.out.println("Last name is : " + pd_lastname.getText());
		System.out.println("Employee Id - " + pd_emp_id.getText()); 
	}
	
	public Orange_contactdetails selecting_Maritial_DOB() throws AWTException {
		
		/*Robot robot = new Robot();
		robot.keyPress(0); */
		nationality_ddl.click();
		
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_I);
		robot.keyRelease(KeyEvent.VK_I);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		Save_button1.click();
		return new Orange_contactdetails();
	}
	


}
