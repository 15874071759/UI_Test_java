package Pages.backyardpages.custompages;

import org.openqa.selenium.WebDriver;

import Common.Locator;
import Common.basepage;

public class custompage extends basepage{

	public custompage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	Locator activLink=getLocator("activLink");
	Locator taskTabLink=getLocator("taskTabLink");
	Locator bugTabLink=getLocator("bugTabLink");
	Locator testcaseTabLink=getLocator("testcaseTabLink");
	Locator testtaskTabLink=getLocator("testtaskTabLink");
	Locator todoTabLink=getLocator("todoTabLink");
	Locator userTabLink=getLocator("userTabLink");
	Locator flowLink=getLocator("flowLink");
	Locator priList=getLocator("priList");
	Locator sourceList=getLocator("sourceList");
	Locator reasonList=getLocator("reasonList");
	Locator stageList=getLocator("stageList");
	Locator statusList=getLocator("statusList");
	Locator reviewResultList=getLocator("reviewResultList");
	Locator review=getLocator("review");
	Locator priList01=getLocator("priList01");
	Locator typeList=getLocator("typeList");
	Locator reasonList01=getLocator("reasonList01");
	Locator statusList01=getLocator("statusList01");
	Locator priList02=getLocator("priList02");
	Locator severityList=getLocator("severityList");
	Locator osList=getLocator("osList");
	Locator browserList=getLocator("browserList");
	Locator typeList01=getLocator("typeList01");
	Locator resolutionList=getLocator("resolutionList");
	Locator statusList02=getLocator("statusList02");
	Locator priList03=getLocator("priList03");
	Locator typeList02=getLocator("typeList02");
	Locator stageList01=getLocator("stageList01");
	Locator resultList=getLocator("resultList");
	Locator statusList03=getLocator("statusList03");
	Locator statusList04=getLocator("statusList04");
	Locator priList05=getLocator("priList05");
	Locator typeList03=getLocator("typeList03");
	Locator statusList05=getLocator("statusList05");
	Locator userList=getLocator("userList");
	Locator statusList06=getLocator("statusList06");
	Locator input=getLocator("input");
	Locator checkbox=getLocator("checkbox");
    Locator submitbutton=getLocator("submitbutton");
    Locator defaultbutton=getLocator("defaultbutton");

	public void selectactivLink(){
		click(activLink);
	}	
	public void selecttaskTabLink(){
		click(taskTabLink);
	}	
	public void selectbugTabLink(){
		click(bugTabLink);
	}	
	public void selecttestcaseTabLink(){
		click(testcaseTabLink);
	}	
	public void selecttesttaskTabLink(){
		click(testtaskTabLink);
	}
	public void selecttodoTabLink(){
		click(todoTabLink);
	}
	public void selectuserTabLink(){
		click(userTabLink);
	}
	public void selectflowLink(){
		click(flowLink);
	}
	public void selectpriList(){
		click(priList);
	}
	public void selectsourceList(){
		click(sourceList);
	}
	public void selectreasonList(){
		click(reasonList);
	}
	public void selectstageList(){
		click(stageList);
	}
	public void selectstatusList(){
		click(statusList);
	}
	public void selectreviewResultList(){
		click(reviewResultList);
	}
	public void selectreview(){
		click(review);
	}
	public void selectpriList01(){
		click(priList01);
	}
	public void selecttypeList(){
		click(typeList);
	}
	public void selectreasonList01(){
		click(reasonList01);
	}
	public void selectstatusList01(){
		click(statusList01);
	}
	public void selectpriList02(){
		click(priList02);
	}
	public void selectseverityList(){
		click(severityList);
	}
	public void selectosList(){
		click(osList);
	}
	public void selectbrowserList(){
		click(browserList);
	}
	
	

}
