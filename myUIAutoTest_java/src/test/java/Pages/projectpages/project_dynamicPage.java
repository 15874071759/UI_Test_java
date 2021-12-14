package Pages.projectpages;

import org.openqa.selenium.WebDriver;

import Common.Locator;
import Common.basepage;

public class project_dynamicPage extends basepage{
	public project_dynamicPage(WebDriver driver) {
		super(driver);
	}
	public String gettitle(){
		return title();
	}
	Locator todayLink = getLocator("todayLink");
	Locator yesterdayLink = getLocator("yesterdayLink");
	Locator twodaysagoLink = getLocator("twodaysagoLink");
	Locator thisweekLink = getLocator("thisweekLink");
	Locator lastweekLink = getLocator("lastweekLink");
	Locator thismonthLink = getLocator("thismonthLink");
	Locator lastmonthLink = getLocator("lastmonthLink");
	Locator allLink = getLocator("allLink");
	Locator accountLink = getLocator("accountLink");
	Locator suoyouLink = getLocator("suoyouLink");
	Locator adminLink = getLocator("adminLink");
	Locator dateLink = getLocator("dateLink");
	Locator actorLink = getLocator("actorLink");
	Locator actionLink = getLocator("actionLink");
	Locator projectdynamicLink = getLocator("projectdynamicLink");
	Locator objectIDLink = getLocator("objectIDLink");
	
	public void clicktodayLink(){
		click(todayLink);
	}
	public void clickyesterdayLink(){
		click(yesterdayLink);
	}
	public void clictwodaysagoLink(){
		click(twodaysagoLink);
	}
	public void clicthisweekLink(){
		click(thisweekLink);
	}
	public void clicklastweekLink(){
		click(lastweekLink);
	}
	public void clickthismonthLink(){
		click(thismonthLink);
	}
	public void clicklastmonthLink(){
		click(lastmonthLink);
	}
	public void clickallLink(){
		click(allLink);
	}
	public void clickaccountLink(){
		click(accountLink);
	}
	public void clicksuoyouLink(){
		click(suoyouLink);
	}
	public void clickadminLink(){
		click(adminLink);
	}
	public void clickdateLink(){
		click(dateLink);
	}
	public void clickactorLink(){
		click(actorLink);
	}
	public void clickactionLink(){
		click(actionLink);
	}
	public void clickprojectdynamicLink(){
		click(projectdynamicLink);
	}
	public void clickobjectIDLink(){
		click(objectIDLink);
	}
	
}
