package Pages.organizationpages;

import org.openqa.selenium.WebDriver;

import Common.Locator;
import Common.basepage;

public class organizationpage_adduser extends basepage{

	public organizationpage_adduser(WebDriver driver) {
		super(driver);
	}
	
	public String gettitle(){
		return title();
	}
	Locator SBdepartment = getLocator("SBdepartment");
	Locator usernameInputbox = getLocator("usernameInputbox");
	Locator realnameInputbox = getLocator("realnameInputbox");
	Locator passwordInputbox = getLocator("passwordInputbox");
	Locator RepeatpasswordInputbox = getLocator("RepeatpasswordInputbox");
	Locator position = getLocator("position");
	Locator blank = getLocator("blank");
	Locator Redevelopment = getLocator("Redevelopment");
	Locator test = getLocator("test");
	Locator projectmanager = getLocator("projectmanager");
	Locator productmanager = getLocator("productmanager");
	Locator RDSupervisor = getLocator("RDSupervisor");
	Locator ProductSupervisor = getLocator("ProductSupervisor");
	Locator TestSupervisor = getLocator("TestSupervisor");
	Locator topmanagement = getLocator("topmanagement");
	Locator other = getLocator("other");
	Locator emailInputbox = getLocator("emailInputbox");
	Locator SourcecodenumberInputbox = getLocator("SourcecodenumberInputbox");
	Locator group = getLocator("group");
	Locator manager1 = getLocator("manager1");
	Locator Redevelopment1 = getLocator("Redevelopment1");
	Locator test1 = getLocator("test1");
	Locator projectmanager1 = getLocator("projectmanager1");
	Locator productmanager1 = getLocator("productmanager1");
	Locator RDSupervisor1 = getLocator("RDSupervisor1");
	Locator ProductSupervisor1 = getLocator("ProductSupervisor1");
	Locator TestSupervisor1 = getLocator("TestSupervisor1");
	Locator topmanagement1 = getLocator("topmanagement1");
	Locator other1 = getLocator("other1");
	Locator guest = getLocator("guest");
	Locator man = getLocator("man");
	Locator woman = getLocator("woman");
	Locator YourpinInputbox = getLocator("YourpinInputbox");
	Locator save = getLocator("save");
	Locator back = getLocator("back");
	
	public void clickSBdepartment(){
		click(SBdepartment);
	}
	public void typeusername(String username){
		type(usernameInputbox,username);
	}
	public void typerealname(String realname){
		type(realnameInputbox,realname);
	}
	public void typepassword(String password){
		type(passwordInputbox,password);
	}
	public void typeRepeatpassword(String Repeatpassword){
		type(RepeatpasswordInputbox,Repeatpassword);
	}
	public void clickposition(){
		click(position);
	}
	public void clickblank(){
		click(blank);
	}
	public void clickRedevelopment(){
		click(Redevelopment);
	}
	public void clicktest(){
		click(test);
	}
	public void clickprojectmanager(){
		click(projectmanager);
	}
	public void clickproductmanager(){
		click(productmanager);
	}
	public void clickRDSupervisor(){
		click(RDSupervisor);
	}
	public void clickProductSupervisor(){
		click(ProductSupervisor);
	}
	public void clickTestSupervisor(){
		click(TestSupervisor);
	}
	public void clicktopmanagement(){
		click(topmanagement);
	}
	public void clickother(){
		click(other);
	}
	public void typeemail(String email){
		type(emailInputbox,email);
	}
	public void typeSourcecodenumber(String Sourcecodenumber){
		type(SourcecodenumberInputbox,Sourcecodenumber);
	}
	public void clickgroup(){
		click(group);
	}
	public void clickmanager1(){
		click(manager1);
	}
	public void clickRedevelopment1(){
		click(Redevelopment1);
	}
	public void clicktest1(){
		click(test1);
	}
	public void clickprojectmanager1(){
		click(projectmanager1);
	}
	public void clickproductmanager1(){
		click(productmanager1);
	}
	public void clickRDSupervisor1(){
		click(RDSupervisor1);
	}
	public void clickProductSupervisor1(){
		click(ProductSupervisor1);
	}
	public void clickTestSupervisor1(){
		click(TestSupervisor1);
	}
	public void clicktopmanagement1(){
		click(topmanagement1);
	}
	public void clickother1(){
		click(other1);
	}
	public void clickguest(){
		click(guest);
	}
	public void clickman(){
		click(man);
	}
	public void clickwoman(){
		click(woman);
	}
	public void typeYourpin(String Yourpin){
		type(YourpinInputbox,Yourpin);
	}
	public void clicksave(){
		click(save);
	}
	public void clickback(){
		click(back);
	}
}