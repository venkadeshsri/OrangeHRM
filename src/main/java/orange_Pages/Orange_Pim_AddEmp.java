package orange_Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.OrangeTestBase;

public class Orange_Pim_AddEmp extends OrangeTestBase  {
	
	//@FindBy(xpath="(//button[normalize-space()='Add'])[1]") WebElement addemp;
//	@FindBy(xpath="//i[@class='oxd-icon bi-plus oxd-button-icon']") WebElement addemp;
	
	@FindBy(xpath="//*[contains(@name,'firstName')]")
	WebElement firstname;
	@FindBy(xpath="(//input[@name='lastName'])[1]") WebElement lastname;
	@FindBy(xpath="(//button[@type='submit'])")
	WebElement submitbutton;
	@FindBy(xpath="//button[normalize-space()='Cancel']")
	WebElement cancelbutton;
	
	public Orange_Pim_AddEmp()
	{
		PageFactory.initElements(driver, this);
	}

	public void input_Add_firstname(String fname)
	{
		firstname.sendKeys(fname);
	}
	
	public void input_Add_lastname(String lname)
	{
		lastname.sendKeys(lname);
	}

	public Orange_Pim_personaldetails save_emp()
	{
		submitbutton.click();
		return new Orange_Pim_personaldetails(); //changed
	}
	
/*	public Orange_Pim_personaldetails addbutton()
	{
	addemp.click();
	return new Orange_Pim_personaldetails();
	}
*/

}
