package Pages.myzone;

import org.openqa.selenium.WebDriver;

import Common.Locator;
import Common.basepage;

public class myzone_daochupage extends basepage{

	public myzone_daochupage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	Locator wanjiansrLink=getLocator("wanjiansrLink");
	Locator csvLink=getLocator("csvLink");
	Locator xmlLink=getLocator("xmlLink");
	Locator htmlLink=getLocator("htmlLink");
	Locator UTF8Link=getLocator("UTF8Link");
	Locator gbkLink=getLocator("gbkLink");
	Locator qianbuLink=getLocator("qianbuLink");
	Locator xuanzhongLink=getLocator("xuanzhongLink");
	Locator daochuLink=getLocator("daochuLink");
	Locator guanbiLink=getLocator("guanbiLink");
	public void clickwanjiansr()
	{
		click(wanjiansrLink);
	}
	public void clickcsv()
	{
		click(csvLink);
	}
	public void clickxml()
	{
		click(xmlLink);
	}
	public void clickhtml()
	{
		click(htmlLink);
	}
	public void clickUTF8()
	{
		click(UTF8Link);
	}
	public void clickgbk()
	{
		click(gbkLink);
	}
	public void clickqianbu()
	{
		click(qianbuLink);
	}
	public void clickxuanzhong()
	{
		click(xuanzhongLink);
	}
	public void clickdaochu()
	{
		click(daochuLink);
	}
	public void clickguanbi()
	{
		click(guanbiLink);
	}
}
