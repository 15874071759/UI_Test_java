package Pages.organizationpages;

import org.openqa.selenium.WebDriver;

import Common.Locator;
import Common.basepage;

public class organizationpage extends basepage{

	public organizationpage(WebDriver driver) {
		super(driver);
	}
	
	public String gettitle(){
		return title();
	}
	Locator usernameLink = getLocator("usernameLink");
	Locator departmentLink = getLocator("departmentLink");
	Locator authority = getLocator("authority");
	Locator company = getLocator("company");
	Locator dynamic = getLocator("dynamic");
	Locator adduserLink = getLocator("adduserLink");
	Locator addpart = getLocator("addpart");
	Locator addgroup = getLocator("addgroup");
	
	public void usernameLink(){
		click(usernameLink);
	}
	public void departmentLink(){
		click(departmentLink);
	}
	public void authority(){
		click(authority);
	}
	public void company(){
		click(company);
	}
	public void dynamic(){
		click(dynamic);
	}
	public void adduserLink(){
		click(adduserLink);
	}
	public void addpart(){
		click(addpart);
	}
	public void addgroup(){
		click(addgroup);
	}
	
}
