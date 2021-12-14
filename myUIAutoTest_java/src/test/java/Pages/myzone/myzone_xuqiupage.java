package Pages.myzone;

import org.openqa.selenium.WebDriver;

import Common.Locator;
import Common.basepage;

public class myzone_xuqiupage extends basepage{

	public myzone_xuqiupage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	Locator zhipaiLink=getLocator("zhipaiLink");
	Locator chuangjianLink=getLocator("chuangjianLink");
	Locator shenpingLink=getLocator("shenpingLink");
	Locator guanbiLink=getLocator("guanbiLink");
	public void clickzhipai(){
		click(zhipaiLink);
	}
	public void clickchuangjian(){
		click(chuangjianLink);
	}
	public void clickshenping(){
		click(shenpingLink);
	}
	public void clickguanbi(){
		click(guanbiLink);
	}

}
