package testcase;



import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.OrangeTestBase;

import orange_Pages.Orange_HomePage;
import orange_Pages.Orange_LoginPage;


public class Orange_Login_Testcase extends OrangeTestBase {
	
	Orange_LoginPage loginpage;
	Orange_HomePage homepage_ORANGE;
	
	@BeforeMethod
	public void setup()
	{
		browsersetup();
		loginpage = new Orange_LoginPage();
	}
	
	@Test(priority=1)
	
	public void loginpagetesting() throws InterruptedException
	{
		String titlepage = loginpage.test_title();
		System.out.println("Application name : " + titlepage);
		
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(240));
		Thread.sleep(3000);
		Boolean logo = loginpage.test_logo();
		Boolean logo1 = loginpage.test_login_logo();
		
		System.out.println("Is Logo displaying : " + logo);
		System.out.println("Is login logo displaying : " + logo1);
		
		
	}  
	
	@Test(priority=2)
	
	public void loginpagetesting1() throws InterruptedException
	{
		Thread.sleep(3000);
		homepage_ORANGE = loginpage.test_usrname("Admin","admin123");
		
	}
	
	@AfterMethod
	public void quit() throws InterruptedException
	{
		Thread.sleep(5000);
		driver.quit();
		
	}

}
