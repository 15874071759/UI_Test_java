package Pages.projectpages.taskpages;

import org.openqa.selenium.WebDriver;

import Common.Locator;
import Common.basepage;

public class addtaskpage extends basepage{

	public addtaskpage(WebDriver driver) {
		super(driver);
	}
	public String gettitle(){
		return title();
	}
	Locator chosemoduleLink = getLocator("chosemoduleLink"); //项目任务页创建建任务所属模块
	Locator testLink = getLocator("testLink");//任务类型
	Locator assignedTo_chosenLink = getLocator("assignedTo_chosenLink");//指派给
	Locator tasknameLink = getLocator("tasknameLink");//任务名称
	Locator beginLink = getLocator("beginLink");//优先级
	Locator beginoneLink = getLocator("beginoneLink");//优先级1
	Locator begintwoLink = getLocator("begintwoLink");//优先级2
	Locator beginthreeLink = getLocator("beginthreeLink");//优先级3
	Locator beginfourLink = getLocator("beginfourLink");//优先级4
	Locator estimateLink = getLocator("estimateLink");//预算时间
	Locator articleLink = getLocator("articleLink");//任务描述
	Locator estStartedLink = getLocator("estStartedLink");//预期规划开始时间
	Locator deadlineLink = getLocator("deadlineLink");//截止时间
	Locator chosenchoicesLink = getLocator("chosenchoicesLink");//抄送给
	Locator titleLink = getLocator("titleLink");//标题
	Locator addingLink = getLocator("addingLink");//继续添加任务
	Locator tasklistLink = getLocator("tasklistLink");//返回任务列表
	Locator storylistLink = getLocator("storylistLink");//返回需求列表
	Locator submitLink = getLocator("submitLink");//保存
	Locator backLink = getLocator("backLink");//返回
	public void clickchosemodule(){
		click(chosemoduleLink);
	}
	public void clicktest(){
		click(testLink);
	}
	public void clickassignedTo_chosen(){
		click(assignedTo_chosenLink);
	}
	public void typetaskname(String taskname){
		type(tasknameLink,taskname);
	}
	public void clickbegin(){
		click(beginLink);
	}
	public void clickbeginone(){
		click(beginoneLink);
	}
	public void clickbegintwo(){
		click(begintwoLink);
	}
	public void clickbeginthree(){
		click(beginthreeLink);
	}
	public void clicktbeginfour(){
		click(beginfourLink);
	}
	public void typeestimate(String estimate){
		type(estimateLink,estimate);
	}
	public void typeestStarted(String estStarted){
		type(estStartedLink,estStarted);
	}
	public void typedeadline(String deadline){
		type(deadlineLink,deadline);
	}
	public void typearticle(String article){
		type(articleLink,article);
	}
	public void clickchosenchoices(){
		click(chosenchoicesLink);
	}
	public void typetitle(String title){
		type(titleLink,title);
	}
	public void clickadding(){
		click(addingLink);
	}
	public void clicktasklist(){
		click(tasklistLink);
	}
	public void clickstorylist(){
		click(storylistLink);
	}

	public void clicksubmit(){
		click(submitLink);
	}
	public void clickback(){
		click(backLink);
	}

}
