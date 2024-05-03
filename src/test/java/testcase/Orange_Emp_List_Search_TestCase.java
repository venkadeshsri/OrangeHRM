package testcase;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.OrangeTestBase;
import orange_Pages.Orange_HomePage;
import orange_Pages.Orange_LoginPage;
import orange_Pages.Orange_viewemployeepage;

public class Orange_Emp_List_Search_TestCase extends OrangeTestBase {
	
	Orange_LoginPage loginpage;
	Orange_HomePage homepage_ORANGE;
	Orange_viewemployeepage Orange_view_Emp_list_Search;
	
	
	@BeforeMethod
	public void setup() throws InterruptedException
	{
		browsersetup();
		loginpage = new Orange_LoginPage();
		Thread.sleep(3000);
		homepage_ORANGE = loginpage.test_usrname("Admin", "admin123");
		Thread.sleep(2000);
		homepage_ORANGE.menu_pim_test_click();
		Orange_view_Emp_list_Search = new Orange_viewemployeepage();  // if we didnt declared here it will display nullpointer Exception error message
	}
	
	/*
	@Test(priority=1)
	public void verify_Emp_List_Tab() throws InterruptedException
	{
		Thread.sleep(5000);
		Boolean Tab = Orange_view_Emp_list_Search.verify_employee_list_Tab();
		System.out.println("Is Employee List Tab Displaying  : " + Tab);
	}
	
	@Test(priority=2)
	public void verify_emp_info_label() throws InterruptedException
	{
	
		Thread.sleep(3000);
		Boolean labeltext = Orange_view_Emp_list_Search.verify_emp_info_label();
		System.out.println("Is Employee Name is displaying : " + labeltext);
	
	} */
	
	
	@Test(priority=3)
	public void verify_Emp_Textbox() throws InterruptedException
	{
		Thread.sleep(3000);
		
	    Orange_view_Emp_list_Search.verify_emp_name_tbox("testing");
	    
	    System.out.println(Orange_view_Emp_list_Search);
       // System.out.println("Searched text" + Searchtext );
		//System.out.println("Textbox enabled: ");

	
		
	}
	
	


	@AfterMethod
	public void quit() throws InterruptedException
	{
		Thread.sleep(5000);
		driver.quit();
	}
	
}
