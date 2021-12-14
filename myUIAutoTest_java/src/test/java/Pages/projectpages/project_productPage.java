package Pages.projectpages;

import org.openqa.selenium.WebDriver;

import Common.Locator;
import Common.basepage;

public class project_productPage extends basepage{
	public project_productPage(WebDriver driver){
		super(driver);
	}
	public String gettitle(){
		return title();
	}

	Locator product1 = getLocator("product1");
	Locator submit = getLocator("submit");
	
	public void clickproduct1(){
		click(product1);
	}
	public void clicksubmit(){
		click(submit);
	}
}
