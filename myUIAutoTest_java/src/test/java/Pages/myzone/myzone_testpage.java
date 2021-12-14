package Pages.myzone;

import org.openqa.selenium.WebDriver;

import Common.Locator;
import Common.basepage;

public class myzone_testpage extends basepage{

	public myzone_testpage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	Locator daiceLink=getLocator("daiceLink");
	Locator yiceLink=getLocator("yiceLink");
	Locator geiwodeLink=getLocator("geiwodeLink");
	Locator wojiandeLink=getLocator("wojiandeLink");
	public void clickdaice(){
		click(daiceLink);
	}
	public void yice(){
		click(yiceLink);
	}
	public void clickgeiwode(){
		click(geiwodeLink);
	}
	public void clickwojiande(){
		click(wojiandeLink);
	}

}
