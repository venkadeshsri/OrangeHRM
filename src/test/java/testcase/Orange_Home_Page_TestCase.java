package testcase;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.OrangeTestBase;
import orange_Pages.Orange_HomePage;
import orange_Pages.Orange_LoginPage;

public class Orange_Home_Page_TestCase extends OrangeTestBase {
	Orange_LoginPage loginpage;
	Orange_HomePage homepage_ORANGE;
	
	
	@BeforeMethod
	public void setup() throws InterruptedException
	{
		browsersetup();
		loginpage = new Orange_LoginPage();
		Thread.sleep(3000);
		homepage_ORANGE = loginpage.test_usrname("Admin","admin123");
		
	}
	
	@Test(priority=1)
	public void verifyDashboard() throws InterruptedException
	{
		Thread.sleep(3000);
		Assert.assertTrue(homepage_ORANGE.verifydashboard(),"Text not matched");
	}
	
	@Test(priority=2)
	public void verify_My_Actions_menu() throws InterruptedException
	{
		Thread.sleep(3000);
		String myaction_title = homepage_ORANGE.verifymyactions();
		
		
		try {
			Assert.assertEquals(myaction_title, "My Actions","");
		} catch (AssertionError e) {
		    System.out.println("Menu Title not matched");
		    throw e;
		}
		System.out.println("Menu Title  matched");
	}
	
	@Test(priority=3)
	public void verify_myActions_list() throws InterruptedException
	{
		Thread.sleep(3000);
		Assert.assertTrue(homepage_ORANGE.verifybutton1(),"Text not Found / matched");
		Assert.assertTrue(homepage_ORANGE.verifybutton2(),"Text not Found / matched");
		Assert.assertTrue(homepage_ORANGE.verifybutton3(),"Text not Found / matched");
		Assert.assertTrue(homepage_ORANGE.verifybutton4(),"Text not Found / matched");
	}
	
	@Test(priority=4)
	public void verify_Pim_menu() throws InterruptedException
	{
		Thread.sleep(3000);
		Boolean menu = homepage_ORANGE.menu_pim_test_display();
		System.out.println("Is PIM Menu displaying :   " + menu);
	}
	
	@Test(priority=5)
	
	public void verify_chart()throws InterruptedException
	{
		Thread.sleep(3000);
		Boolean sub_chart = homepage_ORANGE.verify_subunitchart();
		Boolean loc_chart = homepage_ORANGE.verify_locationchart();
		System.out.println("Is Sub unit Chart displaying  : " + sub_chart);
		System.out.println("Is Location unit Chart displaying  : " + loc_chart);
		
	}
	
	@Test(priority=6)
	public void verify_pim_link_working() throws InterruptedException
	{
		Thread.sleep(3000);
		homepage_ORANGE.menu_pim_test_click();
		
	}
	
	
	@AfterMethod
	public void quit() throws InterruptedException
	{
		Thread.sleep(5000);
		
	}
	

}
