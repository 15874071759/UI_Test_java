package Pages.organizationpages;


import java.util.concurrent.TimeUnit;

import org.dom4j.DocumentException;
import org.openqa.selenium.WebDriver;

import Common.Locator;
import Common.XmlUtil;
import Common.basepage;

public class organizationpages_power extends basepage{

	public organizationpages_power(WebDriver driver) {
		super(driver);
	}
	//权限页面
	Locator id = getLocator("id");
	Locator groupName = getLocator("groupName");
	Locator groupDescription = getLocator("groupDescription");
	Locator userList = getLocator("userList");
	Locator addaddGroup = getLocator("addaddGroup");
	Locator deliverPower = getLocator("deliverPower");
	
	//新增分组按钮子页
	Locator nameInput = getLocator("nameInput");
	Locator descriptionInput = getLocator("descriptionInput");
	Locator submit = getLocator("submit");
	Locator close = getLocator("close");
	
	//按模块分配权限按钮子页
	Locator submitsubmit = getLocator("submitsubmit");
	Locator closeclose = getLocator("closeclose");

	public void clickid(){
		click(id);
	}
	public void clickgroupName(){
		click(groupName);
	}
	public void clickgroupDescription(){
		click(groupDescription);
	}
	public void clickuserList(){
		click(userList);
	}
	public void clickaddaddGroup(){
		click(addaddGroup);
	}
	public void clickdeliverPower(){
		click(deliverPower);
	}
	
	public void clicknameInput(){
		click(nameInput);
	}
	public void clickdescriptionInput(){
		click(descriptionInput);
	}
	public void typename(String name){
		type(nameInput,name);
	}
	public void typepassword(String description){
		type(descriptionInput,description);
	}
	
	public void clicksubmit(){
		click(submit);
	}
	public void clickclose(){
		click(close);
	}
	public void clicksubmitsubmit(){
		click(submitsubmit);
	}
	public void clickcloseclose(){
		click(closeclose);
	}	

}

