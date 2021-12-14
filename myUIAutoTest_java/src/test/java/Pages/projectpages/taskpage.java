	package Pages.projectpages;

import org.openqa.selenium.WebDriver;

import Common.Locator;
import Common.basepage;

public class taskpage extends basepage {

	public taskpage(WebDriver driver) {
		super(driver);
		
	}
	public String gettitle(){
		return title();
	}
	Locator settaskLink= getLocator("settaskLink");
	Locator indexLink = getLocator("indexLink");
	Locator unclosedTabLink = getLocator("unclosedTabLink");
	Locator allTabLink = getLocator("allTabLink");
	Locator delayedTabLink = getLocator("delayedTabLink");
	Locator needconfirmTabLink = getLocator("needconfirmTabLink");
	//更多
	Locator statusTabLink = getLocator("statusTabLink");
	Locator waitLink = getLocator("waitLink");
	Locator doingLink = getLocator("doingLink");
	Locator finishedbymeLink = getLocator("finishedbymeLink");
	Locator doneLink = getLocator("doneLink");
	Locator closedLink = getLocator("closedLink");
	Locator cancelLink = getLocator("cancelLink");
	//
	Locator kanbanTabLink = getLocator("kanbanTabLink");
	Locator burnTabLink = getLocator("burnTabLink");
	Locator treeTabLink = getLocator("treeTabLink");
	//分组
	
	Locator groupTabLink = getLocator("groupTabLink");
	Locator storyLink = getLocator("storyLink");
	Locator statusLink = getLocator("statusLink");
	Locator priLink = getLocator("priLink");
	Locator assignedToLink = getLocator("assignedToLink");
	Locator finishedByLink = getLocator("finishedByLink");
	Locator closedByLink = getLocator("closedByLink");
	Locator typeLink = getLocator("typeLink");
	Locator deadlineLink = getLocator("deadlineLink");
	//
	Locator bysearchTabLink = getLocator("bysearchTabLink");
	Locator reportLink = getLocator("reportLink");
	Locator exportLink = getLocator("exportLink");
	Locator exportiframeLink = getLocator("exportiframeLink");
	Locator importLink = getLocator("importLink");
	Locator importtaskLink = getLocator("importtaskLink");
	Locator importbugLink = getLocator("importbugLink");
	Locator batchcreateLink = getLocator("batchcreateLink");
	Locator createtaskLink = getLocator("createtaskLink");
	//导出数据frame
	Locator fileNameType =getLocator("fileNameType");//文件名
	Locator csvselect =getLocator("csvselect");//csv
	Locator xmlselect =getLocator("xmlselect");//xml
	Locator htmlselect =getLocator("htmlselect");//html
	Locator utfselect =getLocator("utfselect");//utf
	Locator gbkselect =getLocator("gbkselect");//gbk
	Locator allselect =getLocator("allselect");//全部记录
	Locator selectedselect =getLocator("selectedselect");//选中记录
	Locator template_chosen =getLocator("template_chosen");//选择模板
	Locator defaultselect =getLocator("defaultselect");//默认模板
	Locator export =getLocator("export");//导出
	Locator set =getLocator("set");//设置
	
	
	public void clicksettask(){
		click(settaskLink);
	}
	public void clickindex(){
		click(indexLink);
	}
	public void clickunclosedTab(){
		click(unclosedTabLink);
	}
	public void clickallTab(){
		click(allTabLink);
	}
	public void clickdelayedTab(){
		click(delayedTabLink);
	}
	public void clickneedconfirmTab(){
		click(needconfirmTabLink);
	}
	//
	public void clickstatusTab(){
		click(statusTabLink);
	}
	public void clickwait(){
		click(waitLink);
	}
	public void clickdoing(){
		click(doingLink);
	}
	public void clickfinishedbyme(){
		click(finishedbymeLink);
	}
	public void clickdone(){
		click(doneLink);
	}
	public void clickclosed(){
		click(closedLink);
	}
	public void clickcancel(){
		click(cancelLink);
	}
	//
	public void clickkanbanTab(){
		click(kanbanTabLink);
	}
	public void clickburnTab(){
		click(burnTabLink);
	}
	public void clicktreeTab(){
		click(treeTabLink);
	}
//	分组
	public void clickgroupTab(){
		click(groupTabLink);
	}
	public void clickstory(){
		click(storyLink);
	}
	public void clickstatus(){
		click(statusLink);
	}
	public void clickpri(){
		click(priLink);
	}
	public void clickassignedTo(){
		click(assignedToLink);
	}
	public void clickfinishedBy(){
		click(finishedByLink);
	}
	public void clickclosedBy(){
		click(closedByLink);
	}
	public void clicktype(){
		click(typeLink);
	}
	public void clickdeadline(){
		click(deadlineLink);
	}
//	
	public void clickbysearchTab(){
		click(bysearchTabLink);
	}
	public void clickreport(){
		click(reportLink);
	}
	public void clickexportLink(){
		click(exportLink);
	}
	public void clickexportiframe(){
		click(exportiframeLink);
	}
	public void clickimport(){
		click(importLink);
	}
	public void clickimporttask(){
		click(importtaskLink);
	}
	public void clickimportbug(){
		click(importbugLink);
	}
	public void clickbatchcreate(){
		click(batchcreateLink);
	}
	public void clickcreatetask(){
		click(createtaskLink);
	}
	//
	public void typefileName(String filename){
		type(fileNameType,filename);
	}
	public void clickcsvselect(){
		click(csvselect);
	}
	public void clickxmlselect(){
		click(xmlselect);
	}
	public void clickhtmlselect(){
		click(htmlselect);
	}
	public void clickutfselect(){
		click(utfselect);
	}
	public void clickgbkselect(){
		click(gbkselect);
	}
	public void clickallselect(){
		click(allselect);
	}
	public void clickselectedselect(){
		click(selectedselect);
	}
	public void clicktemplatechosen(){
		click(template_chosen);
	}
	public void clickdefaultselect(){
		click(defaultselect);
	}
	public void clickexport(){
		click(export);
	}
	public void clickset(){
		click(set);
	}
}
