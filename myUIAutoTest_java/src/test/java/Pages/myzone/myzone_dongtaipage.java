package Pages.myzone;

import org.openqa.selenium.WebDriver;

import Common.Locator;
import Common.basepage;

public class myzone_dongtaipage extends basepage{

	public myzone_dongtaipage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	Locator jintian=getLocator("jintian");
	Locator zuotian=getLocator("zuotian");
	Locator qiantian=getLocator("qiantian");
	Locator benzhou=getLocator("benzhou");
	Locator shangzhou=getLocator("shangzhou");
	Locator benyue=getLocator("benyue");
	Locator shangyue=getLocator("shangyue");
	Locator suoyou=getLocator("suoyou");
	public void clickjintian()
	{
		click(jintian);
	}
	public void clickzuotian()
	{
		click(zuotian);
	}
	public void clickqiantian()
	{
		click(qiantian);
	}
	public void clickbenzhou()
	{
		click(benzhou);
	}
	public void clickshangzhou()
	{
		click(shangzhou);
	}
	public void clickbenyue()
	{
		click(benyue);
	}
	public void clickshangyue()
	{
		click(shangyue);
	}
	public void clicksuoyou()
	{
		click(suoyou);
	}
	

}
