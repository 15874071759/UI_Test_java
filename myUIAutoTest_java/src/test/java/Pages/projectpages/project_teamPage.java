package Pages.projectpages;

import org.openqa.selenium.WebDriver;

import Common.Locator;
import Common.basepage;

public class project_teamPage extends basepage{
	public project_teamPage(WebDriver driver){
		super(driver);
	}
	public String gettitle(){
		return title();
	}
	Locator teamManage = getLocator("teamManage");
	Locator orderUser = getLocator("orderUser");
	Locator orderRole = getLocator("orderRole");
	Locator orderJionDate = getLocator("orderJionDate");
	Locator orderAvailableHours = getLocator("orderAvailableHours");
	Locator orderAvailableDays = getLocator("orderAvailableDays");
	Locator orderTotal = getLocator("orderTotal");
	Locator orderOperate = getLocator("orderOperate");
	
	public void clickteamManage(){
		click(teamManage);
	}
	public void clickorderUser(){
		click(orderUser);
	}
	public void clickorderRole(){
		click(orderRole);
	}
	public void clickorderJionDate(){
		click(orderJionDate);
	}
	public void clickorderAvailableHours(){
		click(orderAvailableHours);
	}
	public void clickorderAvailableDays(){
		click(orderAvailableDays);
	}
	public void clickorderTotal(){
		click(orderTotal);
	}
	public void clickorderOperate(){
		click(orderOperate);
	}

}
