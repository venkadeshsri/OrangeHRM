package orange_Pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.OrangeTestBase;

public class Orange_viewemployeepage extends OrangeTestBase {
	
	@FindBy(xpath="(.//a[@class='oxd-topbar-body-nav-tab-item'])[1]") WebElement Employee_List_Tab;
	@FindBy(xpath="//div[@class='oxd-table-filter-header-title']") WebElement Emp_Info_Title;
	@FindBy(xpath="//label[normalize-space()='Employee Name']") WebElement emp_name_label;
	@FindBy(xpath="//body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/"
			+ "div[2]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/input[1]") WebElement emp_name_tbox;
	@FindBy(xpath="//button[normalize-space()='Search']") WebElement Search_button;
	@FindBy(xpath="(//button[normalize-space()='Add'])[1]") WebElement addemp;
	
	
	  public Orange_viewemployeepage() 
	  { 
		  PageFactory.initElements(driver, this);
		  
	  } 
	  
	  public Boolean verify_employee_list_Tab()
	  {
		//  WebElement Employee_List_Tab = driver.findElement(By.xpath(".//a[@class='oxd-topbar-body-nav-tab-item'])[1]"));
		  return Employee_List_Tab.isDisplayed();
	  }

	  public boolean verify_emp_info_label()
	  {
		 // WebElement Emp_Info_Title = driver.findElement(By.xpath("//div[@class='oxd-table-filter-header-title']"));
		  return Emp_Info_Title.isDisplayed();
	  }
	  
	  public boolean verify_empname_label()
	  {
		  return emp_name_label.isDisplayed();
	  }
	  
      public Orange_Pim_AddEmp verify_emp_name_tbox(String searchname)
      {
    	  
    	 emp_name_tbox.sendKeys(searchname);
    	 Search_button.click();
    	 String Searchtext = emp_name_tbox.getText();
    	 
    	 return new Orange_Pim_AddEmp();
      }  
      public Orange_Pim_AddEmp add_EMP_button_Click()
      {
    	  
         addemp.click();
    	 
    	 return new Orange_Pim_AddEmp();
      }  
	  
	  
}
