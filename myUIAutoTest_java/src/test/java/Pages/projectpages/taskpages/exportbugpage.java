package Pages.projectpages.taskpages;

import org.openqa.selenium.WebDriver;

import Common.Locator;
import Common.basepage;

public class exportbugpage extends basepage{

	public exportbugpage(WebDriver driver) {
		super(driver);
	}
	public String gettitle(){
		return title();
	}
	
//	第一组
	Locator  titleselect=getLocator("titleselect");//bug标题选择框
	Locator  onegrouponeinclude=getLocator("onegrouponeinclude");//第一组第一个包含选择框
	Locator  titletype=getLocator("titletype");//标题输入框
	Locator  onegrouponeand=getLocator("onegrouponeand");//第一组第一个并且选择框
	Locator  bugidselect=getLocator("bugidselect");//bug编号选择框
	Locator  onegrouponedengyuselect=getLocator("onegrouponedengyuselect");//第一组等于号选择框
	Locator  bugidtype=getLocator("bugidtype");//bug编号输入框
	Locator  onegrouptwoand=getLocator("onegrouptwoand");//第一组第二个并且选择框
	Locator  keywordselect=getLocator("keywordselect");//关键词选择框
	Locator  onegrouptwoinclude=getLocator("onegrouptwoinclude");//第一组第二个个包含选择框
	Locator  keywordtype=getLocator("keywordtype");//关键词输入框
	
	public void clicktitleselect(){
		click(titleselect);
	}
	public void clickonegrouponeinclude(){
		click(onegrouponeinclude);
	}
	public void typetitletype(String title){
		type(titletype,title);
	}
	
	public void clickonegrouponeand(){
		click(onegrouponeand);
	}
	public void clickbugidselect(){
		click(bugidselect);
	}
	
	public void clickonegrouponedengyuselect(){
		click(onegrouponedengyuselect);
	}
	
	public void typebugidtype(String bugid){
		type(bugidtype,bugid);
	}
	
	public void clickonegrouptwoand(){
		click(onegrouptwoand);
	}
	
	public void clickkeywordselect(){
		click(keywordselect);
	}
	public void clickonegrouptwoinclude(){
		click(onegrouptwoinclude);
	}
	public void typekeywordtype(String keyword){
		type(keywordtype,keyword);
	}
	
	
//	中间的
    
	Locator  zhongjianand=getLocator("zhongjianand");//中间的并且选择框
	
	public void clickzhongjianand(){
		click(zhongjianand);
	}
	
	//第二组
	Locator  stepselect=getLocator("stepselect");//重现步骤选择框
	Locator  twogrouponeinclude=getLocator("twogrouponeinclude");//第二组包含选择框
	Locator  stepstype=getLocator("stepstype");//重现步骤输入框
	Locator  twogrouponeand=getLocator("twogrouponeand");//第二组第一个并且选择框
	Locator  assignedtoselect=getLocator("assignedtoselect");//指派给选择框
	Locator  twogrouponedengyuselect=getLocator("twogrouponedengyuselect");//第二组第一个等于选择框
	Locator  selectyonghu=getLocator("selectyonghu");//选择用户框
	Locator  twogrouptwoand=getLocator("twogrouptwoand");//第二组第二个并且选择框
	Locator  confirmedselect=getLocator("confirmedselect");//是否确认选择框
	Locator  twogrouptwodengyuselect=getLocator("twogrouptwodengyuselect");//第二组第二个等于选择框
	Locator  querenselect=getLocator("querenselect");//确认选择框
	
	public void clickstepselect(){
		click(stepselect);
	}
	public void clicktwogrouponeinclude(){
		click(twogrouponeinclude);
	}
	public void typestepstype(String step){
		type(stepstype,step);
	}
	
	public void clicktwogrouponeand(){
		click(twogrouponeand);
	}
	public void clickassignedtoselect(){
		click(assignedtoselect);
	}
	
	public void clicktwogrouponedengyuselect(){
		click(twogrouponedengyuselect);
	}
	
	public void clickselectyonghu(){
		click(selectyonghu);
	}
	
	
	public void clicktwogrouptwoand(){
		click(twogrouptwoand);
	}
	
	public void clickconfirmedselect(){
		click(confirmedselect);
	}
	public void clicktwogrouptwodengyuselect(){
		click(twogrouptwodengyuselect);
	}
	public void clickquerenselect(){
		click(querenselect);
	}
	
//	后面的
	
	Locator  search=getLocator("search");//搜索
	Locator  defaultdd=getLocator("default");//重置
	Locator  save=getLocator("save");//保存
	Locator  mysearchselect=getLocator("mysearchselect");//我的查询
	Locator  removeclick=getLocator("removeclick");//删除按钮
	Locator  searchlite=getLocator("searchlite");//缩小点击
	Locator  rowsselect=getLocator("rowsselect");//选择
	Locator  importt=getLocator("import");//导入
	Locator  back=getLocator("back");//返回
	public void clicksearch(){
		click(search);
	}
	public void clickdefaultdd(){
		click(defaultdd);
	}
	
	public void clicksave(){
		click(save);
	}
	
	public void clickmysearchselect(){
		click(mysearchselect);
	}
	
	
	public void clickremoveclick(){
		click(removeclick);
	}
	
	public void clicksearchlite(){
		click(searchlite);
	}
	public void clickrowsselect(){
		click(rowsselect);
	}
	public void clickimportt(){
		click(importt);
	}
	public void clickback(){
		click(back);
	}
}
