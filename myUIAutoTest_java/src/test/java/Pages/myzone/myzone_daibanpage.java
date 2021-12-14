package Pages.myzone;

import org.openqa.selenium.WebDriver;

import Common.Locator;
import Common.basepage;

public class myzone_daibanpage extends basepage{

	public myzone_daibanpage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	Locator jinriLink=getLocator("jinriLink");
	Locator zuoriLink=getLocator("zuoriLink");
	Locator benzhouLink=getLocator("benzhouLink");
	Locator shangzhouLink=getLocator("shangzhouLink");
	Locator benyueLink=getLocator("benyueLink");
	Locator shangyueLink=getLocator("shangyueLink");
	Locator benjiLink=getLocator("benjiLink");
	Locator bennianLink=getLocator("bennianLink");
	Locator daidingLink=getLocator("daidingLink");
	Locator weiwanLink=getLocator("weiwanLink");
	Locator souyouLink=getLocator("souyouLink");
	Locator riqiLink=getLocator("riqiLink");
	Locator daochuLink=getLocator("daochuLink");
	Locator piliangzengjiaLink=getLocator("piliangzengjiaLink");
	Locator xinzengLink=getLocator("xinzengLink");
	public void clickjinri()
	{
		click(jinriLink);
	}

	public void clickzuori()
	{
		click(zuoriLink);
	}
	public void clickbenzhou()
	{
		click(benzhouLink);
	}
	public void clickshangzhou()
	{
		click(shangzhouLink);
	}
	public void clickbenyue()
	{
		click(benyueLink);
	}
	public void clickshangyue()
	{
		click(shangyueLink);
	}
	public void clickbenji()
	{
		click(benjiLink);
	}
	public void clickbennian()
	{
		click(bennianLink);
	}
	public void clickdaiding()
	{
		click(daidingLink);
	}
	public void clickweiwan()
	{
		click(weiwanLink);
	}
	public void clicksouyou()
	{
		click(souyouLink);
	}
	public void clickriqi()
	{
		click(riqiLink);
	}
	public void clickdaochu()
	{
		click(daochuLink);
	}
	public void clickpiliangzengjia()
	{
		click(piliangzengjiaLink);
	}
	public void clickxinzeng()
	{
		click(xinzengLink);
	}

}
