package Pages.projectpages;

import org.openqa.selenium.WebDriver;

import Common.Locator;
import Common.basepage;

public class allprojectpage extends basepage{

	public allprojectpage(WebDriver driver) {
		super(driver);
	}	
	public String gettitle(){
		return title();
	}
	
	Locator undoneTabLink = getLocator("undoneTabLink");
	Locator allTabLink = getLocator("allTabLink");
	Locator waitTabLink = getLocator("waitTabLink");
	Locator doingTabLink = getLocator("doingTabLink");
	Locator suspendedTabLink = getLocator("suspendedTabLink");
	Locator doneTabLink = getLocator("doneTabLink");
	Locator choseproductLink = getLocator("choseproductLink");
	Locator selectproductLink = getLocator("selectproductLink");
	Locator addprojectLink = getLocator("addprojectLink");
	Locator selectcheckboxLink = getLocator("selectcheckboxLink");
	Locator editLink = getLocator("editLink");
	public void clickundoneTab(){
		click(undoneTabLink);
	}
	public void clickallTab(){
		click(allTabLink);
	}
	public void clickwaitTab(){
		click(waitTabLink);
	}
	public void clickdoingTab(){
		click(doingTabLink);
	}
	public void clicksuspendedTab(){
		click(suspendedTabLink);
	}
	public void clickdoneTab(){
		click(doneTabLink);
	}
	public void clickchoseproduct(){
		click(choseproductLink);
	}
	public void clickselectproduct(){
		click(selectproductLink);
	}
	public void clickaddproject(){
		click(addprojectLink);
	}
	public void clickselectcheckbox(){
		click(selectcheckboxLink);
	}
	public void clickedit(){
		click(editLink);
	}

}
