package Pages.qapages;

import org.openqa.selenium.WebDriver;

import Common.Locator;
import Common.basepage;

public class testspage extends basepage{
	public testspage(WebDriver driver) {
		super(driver);
	}
	
	public String gettitle(){
		return title();
	}
	Locator alllink = getLocator("alllink");
	Locator needchangelink = getLocator("needchangelink");
	Locator grouptablink = getLocator("grouptablink");
	Locator nonecaselink = getLocator("nonecaselink");
	Locator searchlink = getLocator("searchlink");
	Locator dropdownlink = getLocator("dropdownlink");
	Locator dropdowndatalink = getLocator("dropdowndatalink");
	Locator dropdownmobillink = getLocator("dropdownmobillink");
	Locator exportlink = getLocator("exportlink");
	Locator batchcreatelink = getLocator("batchcreatelink");
	Locator createlink = getLocator("createlink");

	public void alllink(){
		click(alllink);
	}
	public void needchangelink(){
		click(needchangelink);
	}
	public void grouptablink(){
		click(grouptablink);
	}
	public void nonecaselink(){
		click(nonecaselink);
	}
	public void searchlink(){
		click(searchlink);
	}
	public void dropdownlink(){
		click(dropdownlink);
	}
	public void dropdowndatalink(){
		click(dropdowndatalink);
	}
	public void dropdownmobillink(){
		click(dropdownmobillink);
	}
	public void exportlink(){
		click(exportlink);
	}
	public void batchcreatelink(){
		click(batchcreatelink);
	}
	public void createlink(){
		click(createlink);
	}

}
