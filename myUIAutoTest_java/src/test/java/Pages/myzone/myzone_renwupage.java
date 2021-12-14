package Pages.myzone;

import org.openqa.selenium.WebDriver;

import Common.Locator;
import Common.basepage;

public class myzone_renwupage extends basepage{

	public myzone_renwupage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	Locator zhipaiLink=getLocator("zhipaiLink");
	Locator chuangjianLink=getLocator("chuangjianLink");
	Locator wanchengLink=getLocator("wanchengLink");
	Locator guanbiLink=getLocator("guanbiLink");
	Locator quxiaoLink=getLocator("quxiaoLink");
	public void clickzhipaiLink()
	{
		click(zhipaiLink);
	}
	public void clickchuangjianLink()
	{
		click(chuangjianLink);
	}
	public void clickwanchengLink()
	{
		click(wanchengLink);
	}
	public void clickguanbiLink()
	{
		click(guanbiLink);
	}
	public void clickquxiaoLink()
	{
		click(quxiaoLink);
	}

}
