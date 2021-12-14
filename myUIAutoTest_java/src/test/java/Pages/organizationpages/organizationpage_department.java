package Pages.organizationpages;

import org.openqa.selenium.WebDriver;

import Common.Locator;
import Common.basepage;

public class organizationpage_department extends basepage{

	public organizationpage_department(WebDriver driver) {
		super(driver);
	}
	
	public String gettitle(){
		return title();
	}
	Locator downdepartment1 = getLocator("downdepartment1");
	Locator downdepartment2 = getLocator("downdepartment2");
	Locator downdepartment3 = getLocator("downdepartment3");
	Locator downdepartment4 = getLocator("downdepartment4");
	Locator downdepartment5 = getLocator("downdepartment5");
	Locator downdepartment6 = getLocator("downdepartment6");
	Locator downdepartment7 = getLocator("downdepartment7");
	Locator downdepartment8 = getLocator("downdepartment8");
	Locator downdepartment9 = getLocator("downdepartment9");
	Locator downdepartment10 = getLocator("downdepartment10");
	Locator preserve = getLocator("preserve");
	Locator back = getLocator("back");
	
	public void typedepartmentname1(String departmentname){
		type(downdepartment1,departmentname);
	}
	public void typedepartmentname2(String departmentname){
		type(downdepartment2,departmentname);
	}
	public void typedepartmentname3(String departmentname){
		type(downdepartment3,departmentname);
	}
	public void typedepartmentname4(String departmentname){
		type(downdepartment4,departmentname);
	}
	public void typedepartmentname5(String departmentname){
		type(downdepartment5,departmentname);
	}
	public void typedepartmentname6(String departmentname){
		type(downdepartment6,departmentname);
	}
	public void typedepartmentname7(String departmentname){
		type(downdepartment7,departmentname);
	}
	public void typedepartmentname8(String departmentname){
		type(downdepartment8,departmentname);
	}
	public void typedepartmentname9(String departmentname){
		type(downdepartment9,departmentname);
	}
	public void typedepartmentname10(String departmentname){
		type(downdepartment10,departmentname);
	}
	public void clickpreserve(){
		click(preserve);
	}
	public void clickback(){
		click(back);
	}
}