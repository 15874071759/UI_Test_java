package Pages.documentpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Common.Locator;
import Common.basepage;

public class ClassificationDocpage extends basepage {
	public ClassificationDocpage(WebDriver driver){
		super(driver);
		driver.get("http://127.0.0.1/zentao/user-login.html");
	}
	Locator moduleName = getLocator("moduleName");
	Locator smoduleName = getLocator("smoduleName");
	Locator addrowClick = getLocator("addrowClick");
	Locator deleterowClick = getLocator("deleterowClick");
	Locator saveClick = getLocator("saveClick");
	Locator returnClick = getLocator("returnClick");
	/**
	 * 获取模块名称
	 * @param modulename
	 */
	public void moduleName(String modulename){
		type(moduleName,modulename);
	}
	/**
	 * 获取模块简称名称
	 * @param modulename
	 */
	public void smoduleName(String smodulename){
		type(smoduleName,smodulename);
	}
	/**
	 * @增加一行
	 */
	public void addrowClick(){
		click(addrowClick);
	}
	/**
	 * @删除一行
	 */
	public void deleterowClick(){
		click(deleterowClick);
	}
	/**
	 * @保存修改
	 */
	public void saveClick(){
		click(saveClick);
	}
	/**
	 * @返回链接
	 */
	public void returnClick(){
		click(returnClick);
	}
}
