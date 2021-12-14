package Pages.organizationpages;

import org.openqa.selenium.WebDriver;

import Common.Locator;
import Common.basepage;

public class organizationpages_dynamic extends basepage{

	public organizationpages_dynamic(WebDriver driver){
		super(driver);
	}
	
	Locator today = getLocator("today");
	Locator yestoday = getLocator("yestoday");
	Locator twodaysage = getLocator("twodaysage");
	Locator thisweek = getLocator("thisweek");
	Locator lastweek = getLocator("lastweek");
	Locator thismonth = getLocator("thismonth");
	Locator lastmonth = getLocator("lastmonth");
	Locator all = getLocator("all");
	Locator user = getLocator("user");
	Locator product = getLocator("product");
	Locator project = getLocator("project");
	Locator search = getLocator("search");
	Locator riqi = getLocator("riqi");
	Locator operater = getLocator("operater");
	Locator movement = getLocator("movement");
	Locator objecttype = getLocator("objecttype");
	Locator id = getLocator("id");
    
	//【组织页--动态子页--搜索框】 产品框，操作者框，对象ID框，项目框，对象类型框，日期框
	Locator productBox = getLocator("productBox");
	Locator operatorBox = getLocator("operatorBox");
	Locator objectIdBox = getLocator("objectIdBox");
	Locator projectBox = getLocator("projectBox");
	Locator objectTypeBox = getLocator("objectTypeBox");
	Locator dateBox = getLocator("dateBox");
	   
	
	//【组织页--动态子页--搜索框】 6个等于框
	Locator equalBox1 = getLocator("equalBox1");
	Locator equalBox2 = getLocator("equalBox2");
	Locator equalBox3 = getLocator("equalBox3");
	Locator equalBox4 = getLocator("equalBox4");
	Locator equalBox5 = getLocator("equalBox5");
	Locator equalBox6 = getLocator("equalBox6");
	
	
	//【组织页--动态子页--搜索框】 5个并且框
	Locator andBox2 = getLocator("andBox2");
	Locator andBox3 = getLocator("andBox3");
	Locator andBox = getLocator("andBox");
	Locator andBox5 = getLocator("andBox5");
	Locator andBox6 = getLocator("andBox6");
	
	//【组织页--动态子页--搜索框】 搜索，重置，保存，我的查询，关闭   
	Locator searchButton = getLocator("searchButton");
	Locator resetButton = getLocator("resetButton");
	Locator saveButton = getLocator("saveButton");
	Locator mysearch = getLocator("mysearch");
	Locator closeButton = getLocator("closeButton");


	public void clicktoday(){
		click(today);
	}
	public void clickyewtoday(){
		click(yestoday);
	}
	public void clicktwodaysage(){
		click(twodaysage);
	}
	public void clickthisweek(){
		click(thisweek);
	}
	public void clicklastweek(){
		click(lastweek);
	}
	public void clickthismonth(){
		click(thismonth);
	}
	public void clicklastmonth(){
		click(lastmonth);
	}
	public void clickall(){
		click(all);
	}
	public void clickuser(){
		click(user);
	}
	public void clickproduct(){
		click(product);
	}
	public void clickproject(){
		click(project);
	}
	public void clicksearch(){
		click(search);
	}

	public void clickriqi(){
		click(riqi);
	}
	public void clickoperater(){
		click(operater);
	}
	public void clickmovement(){
		click(movement);
	}
	public void clickobjecttype(){
		click(objecttype);
	}
	public void clickid(){
		click(id);
	}
	
	
	//【组织页--动态子页--搜索框】 产品框，操作者框，对象ID框，项目框，对象类型框，日期框
	public void clickproductBox(){
		click(productBox);
	}
	public void clickoperatorBox(){
		click(operatorBox);
	}
	public void clickobjectIdBox(){
		click(objectIdBox);
	}
	public void clickprojectBox(){
		click(projectBox);
	}
	public void clickobjectTypeBox(){
		click(objectTypeBox);
	}
	public void clickdateBox(){
		click(dateBox);
	}
	
	
//【组织页--动态子页--搜索框】 6个等于框
	public void clickequalBox1(){
		click(equalBox1);
	}
	public void clickequalBox2(){
		click(equalBox2);
	}
	public void clickequalBox3(){
		click(equalBox3);
	}
	public void clickequalBox4(){
		click(equalBox4);
	}
	public void clickequalBox5(){
		click(equalBox5);
	}
	public void clickequalBox6(){
		click(equalBox6);
	}
	

	//【组织页--动态子页--搜索框】 5个并且框
	public void clickandBox2(){
		click(andBox2);
	}
	public void clickandBox3(){
		click(andBox3);
	}
	public void clickandBox(){
		click(andBox);
	}
	public void clickandBox5(){
		click(andBox5);
	}
	public void clickandBox6(){
		click(andBox2);
	}
	

	//【组织页--动态子页--搜索框】 搜索，重置，保存，我的查询，关闭   
	public void clicksearchButton(){
		click(searchButton);
	}
	public void clickresetButton(){
		click(resetButton);
	}
	public void clicksaveButton(){
		click(saveButton);
	}
	public void clickmysearch(){
		click(mysearch);
	}
	public void clickcloseButton(){
		click(closeButton);
	}
	
}


