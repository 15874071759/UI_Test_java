package Pages;

import org.openqa.selenium.WebDriver;

import Common.Locator;
import Common.basepage;

public class mainpage extends basepage{

	public mainpage(WebDriver driver) {
		super(driver);
	}
	
	public String gettitle(){
		return title();
	}
	/**
	 * 最上面的导航栏
	 */
	Locator MyLink = getLocator("MyLink");
	Locator projectLink = getLocator("projectLink");
	Locator testLink = getLocator("testLink");
	Locator productLink = getLocator("productLink");
	Locator docLink = getLocator("docLink");
	Locator reportLink = getLocator("reportLink");
	Locator companyLink = getLocator("companyLink");
	Locator adminLink = getLocator("adminLink");
	Locator definitionLink = getLocator("definitionLink");
	/**
	 * 我的地盘导航栏
	 */
	Locator firstLink = getLocator("firstLink");
	Locator mytodoLink = getLocator("my-todoLink");
	Locator mytaskLink = getLocator("my-taskLink");
	Locator mybugLink = getLocator("my-bugLink");
	Locator mytesttaskLink = getLocator("my-testtaskLink");
	Locator mystoryLink = getLocator("my-storyLink");
	Locator myprojectLink = getLocator("my-projectLink");
	Locator mydynamicLink = getLocator("my-dynamicLink");
	Locator myprofileLink = getLocator("my-profileLink");
	Locator changepasswordLink = getLocator("changepasswordLink");
	Locator mymanagecontactsLink = getLocator("my-managecontactsLink");
	/**
	 * 页面元素导航
	 */
	Locator addblockLink = getLocator("addblockLink");
	
	public void clickMy(){
		click(MyLink);
	}
	public void clickProject(){
		click(projectLink);
	}
	public void clickest(){
		click(testLink);
	}
	
	public void clickproduct(){
		click(productLink);
	}
	public void clickdocLink(){
		click(docLink);
	}
	public void clickreportLink(){
		click(reportLink);
	}
	public void clickcompanyLink(){
		click(companyLink);
	}
	public void clickadminLink(){
		click(adminLink);
	}
	public void clickdefinitionLink(){
		click(definitionLink);
	}
	public void clickfirstLink(){
		click(firstLink);
	}
	public void clickmytodoLink(){
		click(mytodoLink);
	}
	public void clickmytaskLink(){
		click(mytaskLink);
	}
	public void clickmybugLink(){
		click(mybugLink);
	}
	public void clickmytesttaskLink(){
		click(mytesttaskLink);
	}
	public void clickmystoryLink(){
		click(mystoryLink);
	}
	public void clickmyprojectLink(){
		click(myprojectLink);
	}
	public void clickmydynamicLink(){
		click(mydynamicLink);
	}
	public void clickmyprofileLink(){
		click(myprofileLink);
	}
	public void clickchangepasswordLink(){
		click(changepasswordLink);
	}
	public void clickmymanagecontactsLink(){
		click(mymanagecontactsLink);
	}
	public void clickaddblockLink(){
		click(addblockLink);
	}
}
