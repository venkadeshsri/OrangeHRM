package testcase;

import java.awt.AWTException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.OrangeTestBase;
import orange_Pages.Orange_HomePage;
import orange_Pages.Orange_LoginPage;
import orange_Pages.Orange_Pim_AddEmp;
import orange_Pages.Orange_Pim_personaldetails;
import orange_Pages.Orange_viewemployeepage;

public class Orange_Pim_Personaldetails_TestCase extends OrangeTestBase {
	
	Orange_LoginPage loginpage;
	Orange_HomePage homepage_ORANGE;
	Orange_viewemployeepage Orange_view_Emp_list_Search;
	Orange_Pim_AddEmp Orange_Pim_AddEmployee;
	Orange_Pim_AddEmp_TestCase orange_pim_addtestcase;
	Orange_Pim_personaldetails Pim_personaldetails_ORANGE;
    
	
	@BeforeMethod
	public void setup() throws InterruptedException
	{
	/*  browsersetup();
	   loginpage = new Orange_LoginPage();
	   Thread.sleep(3000);
	   homepage_ORANGE = loginpage.test_usrname("Admin", "admin123");
	   Thread.sleep(3000);
	   homepage_ORANGE.menu_pim_test_click();
	   Orange_Pim_AddEmployee = new Orange_Pim_AddEmp();
	   Pim_personaldetails_ORANGE = new Orange_Pim_personaldetails();
	   Orange_Pim_AddEmployee.addbutton();
 	   Thread.sleep(5000);
 	   Orange_Pim_AddEmployee.input_Add_firstname("testing");
 	   Orange_Pim_AddEmployee.input_Add_lastname("venkat");
 	   Orange_Pim_AddEmployee.save_emp();
 	   Thread.sleep(2000);  
		*/
		
	 browsersetup();
	 loginpage = new Orange_LoginPage();
	 Thread.sleep(3000);
	 homepage_ORANGE = loginpage.test_usrname("Admin", "admin123");
	 Thread.sleep(3000);
	 homepage_ORANGE.menu_pim_test_click();
	 Thread.sleep(3000);
	 Orange_view_Emp_list_Search = new Orange_viewemployeepage();
	 Orange_view_Emp_list_Search.add_EMP_button_Click();
	 Thread.sleep(3000);
	 Orange_Pim_AddEmployee = new Orange_Pim_AddEmp();
	 Orange_Pim_AddEmployee.input_Add_firstname("testing");
	 Orange_Pim_AddEmployee.input_Add_lastname("venkat");
	 Orange_Pim_AddEmployee.save_emp();
	 Thread.sleep(2000);  
	 Pim_personaldetails_ORANGE = new Orange_Pim_personaldetails();
		
	}
	
	 @Test(priority=1) 
	 public void personal_details_displaying() throws InterruptedException
	 {
		 Thread.sleep(3000); 
		 Pim_personaldetails_ORANGE.verify_fandl_names();
	 }
		
	 @Test(priority=2) 
	 public void nationality_ddl() throws AWTException, InterruptedException	 
	 {
		 Thread.sleep(2000); 
		 Pim_personaldetails_ORANGE.selecting_Maritial_DOB();
	 }
	 
	
    @AfterMethod
	public void quit() throws InterruptedException
	{
		Thread.sleep(5000);
		driver.quit();
	}
}
