package Pages.productpages;

import org.openqa.selenium.WebDriver;

import Common.basepage;

public class SubmitdemandPage extends basepage {
	
	public SubmitdemandPage(WebDriver driver){
		super(driver);
	}
	
	public void clickbelongproduct()   //点击所属产品
	{
		click(getLocator("belongproduct"));
	}
	
	public void clickproductname()    //点击所选的产品
	{
		click(getLocator("productname"));
	}
	
	public void clickbelongmodle()    //点击所属模块
	{
		click(getLocator("belongmodle"));
	}
	
	public void clickbelongplan()    //点击所属计划
	{
		click(getLocator("belongplan"));
	}	
	
	public void clickdemandsource()    //点击需求来源
	{
		click(getLocator("demandsource"));
	}
	
	public void clickcustomer()    //点击选择客户
	{
		click(getLocator("customer"));
	}	
	
	public void clickremark()    //点击备注
	{
		click(getLocator("remark"));
	}
	
	public void clickneednoreview()    //点击不需要评审
	{
		click(getLocator("neednoreview"));
	}	
	
	public void clickwhoreview()    //点击由谁评审
	{
		click(getLocator("whoreview"));
	}	
	
	public void clickperson1()    //点击所选的评审人
	{
		click(getLocator("person1"));
	}	
	
	public void clickdemandname()    //点击需求名称
	{
		click(getLocator("demandname"));
	}	
	
	public void clickpriority()    //点击优先级
	{
		click(getLocator("priority"));
	}	
	
	public void clickdefault()    //点击选择默认
	{
		click(getLocator("default"));
	}
	
	public void inputestimate()    //输入预计时间为8小时
	{
		type(getLocator("estimate"),"8");
	}
	
	public void clickconserve()    //点击保存
	{
		click(getLocator("conserve"));
	}		
}
