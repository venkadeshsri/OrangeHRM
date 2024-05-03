package orange_Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.OrangeTestBase;

public class Orange_HomePage extends OrangeTestBase {
	
	@FindBy(xpath="//span[@class='oxd-topbar-header-breadcrumb']") WebElement dashboardlabel;
	@FindBy(xpath="//p[normalize-space()='My Actions']") WebElement myactions;
	@FindBy(xpath="//button[@class='oxd-icon-button oxd-icon-button--success orangehrm-report-icon']") WebElement LRapprovebutton;
	@FindBy(xpath="//button[@class='oxd-icon-button oxd-icon-button--warn orangehrm-report-icon']") WebElement timesheetapprovebutton ;
	@FindBy(xpath="//button[@class='oxd-icon-button oxd-icon-button--danger orangehrm-report-icon']") WebElement pendingbutton ;
	@FindBy(xpath="//button[@class='oxd-icon-button oxd-icon-button--info orangehrm-report-icon']") WebElement candidatebutton ;
	@FindBy(xpath="//span[normalize-space()='PIM']")WebElement pim_menu;
	@FindBy(xpath="(//div[@class='oxd-pie-chart'])[1]") WebElement subunit_chart;
	@FindBy(xpath="(//div[@class='emp-distrib-chart'])[2]")WebElement location_chart;
	


	//Initiating PageFactory elements --> driver will access from "base" -->needs to give "extends OrangeTestBase"
	  public Orange_HomePage() 
	  { 
		  PageFactory.initElements(driver, this);
		  
	  }

	  //Actions
	  public Boolean verifydashboard() {
		  return dashboardlabel.isDisplayed();
	  }
	  
	  public String verifymyactions()
	  {
		 return myactions.getText();
	  }
	  
	  public Boolean verifybutton1() {
		  return LRapprovebutton.isEnabled();
	  }
	  public Boolean verifybutton2() {
		  return timesheetapprovebutton.isEnabled();
	  }
	  public Boolean verifybutton3() {
		  return pendingbutton.isEnabled();
	  }
	  public Boolean verifybutton4() {
		  return candidatebutton.isEnabled();
	  }
	  
	  public Boolean menu_pim_test_display()
	  {
		  return pim_menu.isDisplayed();
		  
	  }
	  
	  public Boolean verify_locationchart()
	  {
		  return location_chart.isDisplayed();
	  }
	  
	  public Boolean verify_subunitchart(){
		  return subunit_chart.isDisplayed();
	  }
	  
	  public Orange_viewemployeepage menu_pim_test_click() {
		   pim_menu.click();
		   return new Orange_viewemployeepage();
	  }


}
