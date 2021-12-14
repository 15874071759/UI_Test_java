package Pages.projectpages;

import org.openqa.selenium.WebDriver;

import Common.Locator;
import Common.basepage;

public class buildpage extends basepage{

	public buildpage(WebDriver driver) {
		super(driver);
	}
	public String gettitle(){
		return title();
	}
	Locator addbuildLink=getLocator("addbuildLink");
	
	public void clickaddbuild(){
		click(addbuildLink);
	}

}
