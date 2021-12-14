package Pages.projectpages;

import org.openqa.selenium.WebDriver;

import Common.Locator;
import Common.basepage;

public class addprojectpage extends basepage{

	public addprojectpage(WebDriver driver) {
		super(driver);
	}
	public String gettitle(){
		return title();
	}
	Locator projectnameLink = getLocator("projectnameLink"); //项目页增加项目项目名称
	Locator codeLink = getLocator("codeLink");//项目代号
	Locator begindateLink = getLocator("begindateLink");//开始日期
	Locator enddateLink = getLocator("enddateLink");//结束日期
	Locator daysLink = getLocator("daysLink");//可用工作日
	Locator oneweekLink = getLocator("oneweekLink");//一星期
	Locator twoweekLink = getLocator("twoweekLink");//两星期
	Locator onemonthLink = getLocator("onemonthLink");//一个月
	Locator twomonthLink = getLocator("twomonthLink");//两个月
	Locator threemonthLink = getLocator("threemonthLink");//3个月
	Locator sixmonthLink = getLocator("sixmonthLink");//半年
	Locator oneyearLink = getLocator("oneyearLink");//一年
	Locator teamnameLink = getLocator("teamnameLink");//团队名称
	Locator sprintLink = getLocator("sprintLink");//短期项目
	Locator waterfallLink = getLocator("waterfallLink");//长期项目
	Locator opsLink = getLocator("opsLink");//运维项目
	Locator chosen_defaultLink = getLocator("chosen_defaultLink");//关联产品
	Locator article_contentLink = getLocator("article_contentLink");//项目描述
	Locator aclopenLink = getLocator("aclopenLink");//默认设置
	Locator aclprivateLink = getLocator("aclprivateLink");//私有项目
	Locator aclcustomLink = getLocator("aclcustomLink");//自定义白名单
	Locator whiteadminLink = getLocator("whiteadminLink");//管理员
	Locator whitetestLink = getLocator("whitetestLink");//测试
	Locator submitLink = getLocator("submitLink");//保存
	Locator backLink = getLocator("backLink");//返回
	public void typeprojectname(String projectname){
		type(projectnameLink,projectname);
	}
	public void typecode(String code){
		type(codeLink,code);
	}
	public void typebegindate(String begindate){
		type(begindateLink,begindate);
	}
	public void typeenddate(String enddate){
		type(enddateLink,enddate);
	}
	public void typedays(String days){
		type(daysLink,days);
	}
	public void clickoneweek(){
		click(oneweekLink);
	}
	public void clicktwoweek(){
		click(twoweekLink);
	}
	public void clickonemonth(){
		click(onemonthLink);
	}
	public void clicktwomonth(){
		click(twomonthLink);
	}
	public void clickthreemonth(){
		click(threemonthLink);
	}
	public void clicksixmonth(){
		click(sixmonthLink);
	}
	public void clickoneyear(){
		click(oneyearLink);
	}
	public void typeteamname(String teamname){
		type(teamnameLink,teamname);
	}
	public void clicksprint(){
		click(sprintLink);
	}
	public void clickwaterfall(){
		click(waterfallLink);
	}
	public void clickops(){
		click(opsLink);
	}
	public void clickchosen_default(){
		click(chosen_defaultLink);
	}
	public void typearticle_content(String content){
		type(article_contentLink,content);
	}
	public void clickaclopen(){
		click(aclopenLink);
	}
	public void clickaclprivate(){
		click(aclprivateLink);
	}
	public void clickaclcustom(){
		click(aclcustomLink);
	}
	public void clickwhiteadmin(){
		click(whiteadminLink);
	}
	public void clickwhitetest(){
		click(whitetestLink);
	}
	public void clicksubmit(){
		click(submitLink);
	}
	public void clickback(){
		click(backLink);
	}

}
