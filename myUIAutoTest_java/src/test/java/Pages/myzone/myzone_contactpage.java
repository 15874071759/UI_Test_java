package Pages.myzone;

import org.openqa.selenium.WebDriver;

import Common.Locator;
import Common.basepage;

public class myzone_contactpage extends basepage{

	public myzone_contactpage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	Locator liebiaoName=getLocator("liebiaoName");
	Locator selectUser=getLocator("selectUser");
	Locator selectUserClick=getLocator("selectUserClick");
	Locator baocunButton=getLocator("baocunButton");
	public void clickliebiaoName(){
		click(liebiaoName);
	}
	public void clickselectUser(){
		click(selectUser);
	}
	public void clickselectUserClick(){
		click(selectUserClick);
	}
	public void ClickbaocunButton(){
		click(baocunButton);
	}

}
