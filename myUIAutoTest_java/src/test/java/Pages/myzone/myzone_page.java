package Pages.myzone;

import org.openqa.selenium.WebDriver;

import Common.Locator;
import Common.basepage;

public class myzone_page extends basepage{

	public myzone_page(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	Locator shouyeLink=getLocator("shouyeLink");
	Locator daibangLink=getLocator("daibangLink");
	Locator renwuLink=getLocator("renwuLink");
	Locator BugLink=getLocator("BugLink");
	Locator ceshiLink=getLocator("ceshiLink");
	Locator xuqiuLink=getLocator("xuqiuLink");
	Locator xianghmuLink=getLocator("xianghmuLink");
	Locator dongtaiLink=getLocator("dongtaiLink");
	Locator danganLink=getLocator("danganLink");
	Locator mimaLink=getLocator("mimaLink");
	Locator lianxirenLink=getLocator("lianxirenLink");
	public void clickshouye()
	{
		click(shouyeLink);
	}
	public void clickdaibang()
	{
		click(daibangLink);
	}
	public void clickrenwu()
	{
		click(renwuLink);
	}
	public void clickBug()
	{
		click(BugLink);
	}
	public void clickceshi()
	{
		click(ceshiLink);
	}
	public void clickxuqiu()
	{
		click(xuqiuLink);
	}
	public void clickxianghmu()
	{
		click(xianghmuLink);
	}
	public void clickmima()
	{
		click(mimaLink);
	}
	public void clicklianxiren()
	{
		click(lianxirenLink);
	}
	

}
