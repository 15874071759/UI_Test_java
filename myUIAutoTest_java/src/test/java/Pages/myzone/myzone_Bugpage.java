package Pages.myzone;

import org.openqa.selenium.WebDriver;

import Common.Locator;
import Common.basepage;

public class myzone_Bugpage extends basepage{

	public myzone_Bugpage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	Locator zpgeiwoLink=getLocator("zpgeiwoLink");
	Locator ywchuangjianLink=getLocator("ywchuangjianLink");
	Locator ywjiejueLink=getLocator("ywjiejueLink");
	Locator ywguanbiLink=getLocator("ywguanbiLink");
	public void clickzpgeiwo(){
		click(zpgeiwoLink);
	}
	public void clickywchuangjian(){
		click(ywchuangjianLink);
	}

	public void clickywjiejueL(){
		click(ywjiejueLink);
	}

	public void clickywguanbi(){
		click(ywguanbiLink);
	}


}
