package Pages;

import org.openqa.selenium.WebDriver;

import Common.Locator;
import Common.basepage;

public class projectpage extends basepage{

	public projectpage(WebDriver driver) {
		super(driver);
	}	
	public String gettitle(){
		return title();
	}
	
	Locator bugLink = getLocator("bugLink");
	
	public void clickBug(){
		click(bugLink);
	}

}
