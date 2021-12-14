package Pages.qapages;

import org.openqa.selenium.WebDriver;

import Common.Locator;
import Common.basepage;

public class versionspage extends basepage{
	public versionspage(WebDriver driver) {
		super(driver);
	}
	
	public String gettitle(){
		return title();
	}
	Locator versionslink = getLocator("versionslink");
	Locator waittasklink = getLocator("waittasklink");
	Locator donetasklink = getLocator("donetasklink");
	Locator submitbuglink = getLocator("submitbuglink");
	
	public void versionslink(){
		click(versionslink);
	}
	public void waittasklink(){
		click(waittasklink);
	}
	public void donetasklink(){
		click(donetasklink);
	}
	public void submitbuglink(){
		click(submitbuglink);
	}
}