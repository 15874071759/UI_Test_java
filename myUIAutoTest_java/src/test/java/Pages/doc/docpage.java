package Pages.doc;

import org.openqa.selenium.WebDriver;

import Common.Locator;
import Common.basepage;

public class docpage extends basepage{
	public docpage(WebDriver driver){
		super(driver);
		//driver.get("http://127.0.0.1/zentao/user-login.html");
	}
	Locator productbelongs = getLocator("productbelongs");
	Locator classbelongs = getLocator("classbelongs");
	Locator docfile = getLocator("docfile");
	Locator doclink = getLocator("doclink");
	Locator docweb = getLocator("docweb");
	Locator doctitle = getLocator("doctitle");
	Locator keyword = getLocator("keyword");
	Locator docsummary = getLocator("docsummary");
	Locator attachment = getLocator("attachment");
	Locator addTitle = getLocator("addTitle");
	Locator addRow = getLocator("addRow");
	Locator deletRow = getLocator("deletRow");
	Locator save = getLocator("save");
	Locator back = getLocator("back");
	/**
	 * 获取所属产品
	 */
	public void productbelongs(){
		click(productbelongs);
	}
	/**
	 * 获取所属分类
	 */
	public void classbelongs(){
		click(classbelongs);
	}
	/**
	 * 文档类型为文件
	 */
	public void docfile(){
		click(docfile);
	}
	/**
	 * 文档类型为链接
	 */
	public void doclink(){
		click(doclink);
	}
	/**
	 * 文档类型为网页
	 */
	public void docweb(){
		click(docweb);
	}
	/**
	 * 获取文件标题
	 */
	public void doctitle(String getdoctitle){
		type(doctitle,getdoctitle);
	}
	/**
	 * 获取文件关键字
	 */
	public void keyword(String getkeyword){
		type(keyword,getkeyword);
	}
	/**
	 * 获取文件摘要
	 */
	public void docsummary(String getdocsummary){
		type(docsummary,getdocsummary);
	}
	/**
	 * 浏览
	 */
	public void attachment(){
		click(attachment);
	}
	/**
	 * 获取文件标题
	 */
	public void addTitle(String addtitle){
		type(addTitle,addtitle);
	}
	/**
	 * @增加一行
	 */
	public void addRow(){
		click(addRow);
	}
	/**
	 * @删除一行
	 */
	public void deletRow(){
		click(deletRow);
	}
	/**
	 * 保存
	 */
	public void save(){
		click(save);
	}
	/**
	 * 返回
	 */
	public void back(){
		click(back);
	}
}
