package testcase;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.OrangeTestBase;
import orange_Pages.Orange_HomePage;
import orange_Pages.Orange_LoginPage;
import orange_Pages.Orange_Pim_AddEmp;
import orange_Pages.Orange_viewemployeepage;

public class Orange_Pim_AddEmp_TestCase extends OrangeTestBase {
	
	Orange_LoginPage loginpage;
	Orange_HomePage homepage_ORANGE;
	Orange_viewemployeepage Orange_view_Emp_list_Search;
	Orange_Pim_AddEmp Orange_Pim_AddEmployee;
	
	@BeforeMethod
	public void setup() throws InterruptedException
	{
		browsersetup();
		loginpage = new Orange_LoginPage();
		Thread.sleep(3000);
		homepage_ORANGE = loginpage.test_usrname("Admin", "admin123");
		Thread.sleep(2000);
		homepage_ORANGE.menu_pim_test_click();
        Thread.sleep(5000);
   	 Orange_view_Emp_list_Search = new Orange_viewemployeepage();
   	 Orange_view_Emp_list_Search.add_EMP_button_Click();
        Orange_Pim_AddEmployee = new Orange_Pim_AddEmp();
       // Orange_Pim_AddEmployee = Orange_view_Emp_list_Search.verify_emp_name_tbox("TEST");
      	Thread.sleep(3000);
		
	}

	
	  @Test(priority=1) 
	  public void pim_addbutton_click() throws InterruptedException
	  {
		 /* Orange_Pim_AddEmployee.addbutton();
		  Thread.sleep(3000); */
	  Orange_Pim_AddEmployee.input_Add_firstname("testing");
	  Orange_Pim_AddEmployee.input_Add_lastname("venkat");
	  Orange_Pim_AddEmployee.save_emp();
	 
	  }
	 
	
	@AfterMethod
	public void quit() throws InterruptedException
	{
		Thread.sleep(5000);
		driver.quit();
	}
	
}
