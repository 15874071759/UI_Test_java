package Pages.myzone;

import org.openqa.selenium.WebDriver;

import Common.Locator;
import Common.basepage;

public class myzone_xinzengpage extends basepage{

	public myzone_xinzengpage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	Locator dateLink=getLocator("dateLink");
	Locator daidingLink=getLocator("daidingLink");
	Locator zidingyiLink=getLocator("zidingyiLink");
	Locator bugLink=getLocator("bugLink");
	Locator xiangmurwLink=getLocator("xiangmurwLink");
	Locator yibanLink=getLocator("yibanLink");
	Locator zuigaoLink=getLocator("zuigaoLink");
	Locator jiaogaoLink=getLocator("jiaogaoLink");
	public void clickdateLink()
	{
		click(dateLink);
	}
	public void clickdaidingLink()
	{
		click(daidingLink);
	}
	public void clickzidingyiLink()
	{
		click(zidingyiLink);
	}
	public void clickbugLink()
	{
		click(bugLink);
	}
	public void clickxiangmurwLink()
	{
		click(xiangmurwLink);
	}
	public void clickyibanLink()
	{
		click(yibanLink);
	}
	public void clickzuigaoLink()
	{
		click(zuigaoLink);
	}
	public void clickjiaogaoLink()
	{
		click(jiaogaoLink);
	}
	Locator zuidiLink=getLocator("zuidiLink");
	Locator nameLink=getLocator("nameLink");
	Locator miaoshuLink=getLocator("miaoshuLink");
	Locator waitLink=getLocator("waitLink");
	Locator doingLink=getLocator("doingLink");
	Locator doneLink=getLocator("doneLink");
	Locator beginLink=getLocator("beginLink");
	Locator endLink=getLocator("endLink");
	public void clickzuidiLink()
	{
		click(zuidiLink);
	}
	public void clicknameLink()
	{
		click(nameLink);
	}
	public void clickmiaoshuLink()
	{
		click(miaoshuLink);
	}
	public void clickwaitLink()
	{
		click(waitLink);
	}
	public void clickdoingLink()
	{
		click(doingLink);
	}
	public void clickdoneLink()
	{
		click(doneLink);
	}
	public void clickbeginLink()
	{
		click(beginLink);
	}
	public void clickendLink()
	{
		click(endLink);
	}
	Locator unsetTime=getLocator("unsetTime");
	Locator shirenLink=getLocator("shirenLink");
	Locator saveButton=getLocator("saveButton");
	Locator fanhui=getLocator("fanhui");
	public void clickunsetTime()
	{
		click(unsetTime);
	}
	public void clickshirenLink()
	{
		click(shirenLink);
	}
	public void clicksaveButton()
	{
		click(saveButton);
	}
	public void clickfanhui()
	{
		click(fanhui);
	}
	
	
}
