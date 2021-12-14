package Pages.doc;

import org.openqa.selenium.WebDriver;

import Common.Locator;
import Common.basepage;

public class Dockupage extends basepage{
	public Dockupage(WebDriver driver) {
		super(driver);
	//	driver.get("http://127.0.0.1/zentao/user-login.html");
	}
	Locator dockuName = getLocator("dockuName");
	Locator saveClick = getLocator("saveClick");
	/**
	 * @获取文档库名称
	 */
	public void dockuName(String name){
		type(dockuName,name);
	}
	/**
	 * @名称保存
	 */
	public void saveClick(){
		click(saveClick);
	}
}
