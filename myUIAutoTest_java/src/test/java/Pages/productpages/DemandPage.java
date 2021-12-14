package Pages.productpages;

import org.openqa.selenium.WebDriver;

import Common.basepage;

public class DemandPage extends basepage{

	public DemandPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public void clickunlose(){           //点击未关闭
		click(getLocator("unclose"));
	}
	
	public void clickalldemand(){        //点击所有需求
		click(getLocator("alldemand"));
	}
	
	public void clickgivemy(){        //点击指派给我
		click(getLocator("givemy"));
	}
	
	public void clickcreatbyme(){        //点击由我创建
		click(getLocator("creatbyme"));
	}
	
	public void clickreviewbyme(){        //点击由我创建
		click(getLocator("reviewbyme"));
	}
	
	
	public void clickclosebyme(){        //点击由我关闭
		click(getLocator("closebyme"));
	}
	
	public void clickdraft(){        //点击草稿
		click(getLocator("draft"));
	}
		
	public void clickactive(){        //点击激活
		click(getLocator("active"));
	}
	
	public void clickchange(){        //点击已变更
		click(getLocator("change"));
	}
	
	public void clickwillclose(){        //点击待关闭
		click(getLocator("willclose"));
	}
	
	public void clickclosed(){        //点击已关闭
		click(getLocator("closed"));
	}
	
	public void clicksearch(){        //点击搜索
		click(getLocator("search"));
	}
	
	public void clickoutput(){        //点击导出
		click(getLocator("output"));
	}
	
	public void clickreportform(){        //点击报表
		click(getLocator("reportform"));
	}
	
	public void clickbatchadd(){        //点击批量添加
		click(getLocator("batchadd"));
	}
	
	public void clicksubmitdemand(){        //点击提需求
		click(getLocator("submitdemand"));
	}
	
	
	
}








