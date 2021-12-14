package Pages.doc;

import org.openqa.selenium.WebDriver;

import Common.Locator;
import Common.basepage;

public class allDocpage extends basepage {
	public allDocpage(WebDriver driver) {
		super(driver);
		//driver.get("http://127.0.0.1/zentao/user-login.html");
	}
	Locator chosenDoc = getLocator("chosenDoc");
	Locator projectDoc = getLocator("projectDoc");
	Locator productDoc = getLocator("productDoc"); 
	Locator docLink = getLocator("docLink");  
	Locator editDoc = getLocator("editDoc");  
	Locator ClassificationDoc = getLocator("ClassificationDoc");
	Locator deleteDoc = getLocator("deleteDoc");  
	Locator addDocku = getLocator("addDocku");  
	Locator sqrtDoc = getLocator("sqrtDoc");
	Locator sqrtButton = getLocator("sqrtButton");
	Locator createDoc = getLocator("createDoc");
	Locator sqrtClick = getLocator("sqrtClick");
	Locator weihu = getLocator("weihu");
	/**
	 * @1文档库选择
	 */
	public void chosenDoc(){
		click(chosenDoc);
	}
	/**
	 * @2选择项目文档库
	 */
	public void projectDoc(){
		click(projectDoc);
	}
	/**
	 * @3选择产品文档库
	 */
	public void productDoc(){
		click(productDoc);
	}
	/**
	 * @4文档链接点击
	 */
	public void docLink(){
		click(docLink);
	}
	/**
	 * @5文档编辑点击
	 */
	public void editDoc(){
		click(editDoc);
	}
	/**
	 * @6文档分类点击
	 */
	public void ClassificationDoc(){
		click(ClassificationDoc);
	}
	
	/**
	 * @7删除链接点击
	 */
	public void deleteDoc(){
		click(deleteDoc);
	}
	
	/**
	 * @8添加文档库按钮
	 */
	public void addDockulink(){
		click(addDocku);
	}
	/**
	 * @9文档查询按钮
	 */
	public void sqrtButton(){
		click(sqrtButton);
	}
	/**
	 * @10文档编号输入
	 */
	public void sqrtDoc(String docNum){
		type(sqrtDoc,docNum);
	}
	/**
	 * @11创建文档
	 */
	public void createDoc(){
		click(createDoc);
	}
	/**
	 * @12搜索
	 */
	public void sqrtClick(){
		click(sqrtClick);
	}
	/**
	 * @13.维护链接
	 */
	public void weihu(){
		click(weihu);
	}
}
