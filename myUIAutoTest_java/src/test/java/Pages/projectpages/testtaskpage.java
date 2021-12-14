package Pages.projectpages;

import org.openqa.selenium.WebDriver;

import Common.Locator;
import Common.basepage;

public class testtaskpage extends basepage{

	public testtaskpage(WebDriver driver) {
		super(driver);
	}
	public String gettitle(){
		return title();
	}
	Locator addtestLink=getLocator("addtestLink");
	
	public void clickaddtest(){
		click(addtestLink);
	}

}
