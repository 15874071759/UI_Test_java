package Pages.countpages;

import java.util.concurrent.TimeUnit;

import org.dom4j.DocumentException;
import org.openqa.selenium.WebDriver;

import Common.Locator;
import Common.XmlUtil;
import Common.basepage;

public class countpage_organization extends basepage{

	public countpage_organization(WebDriver driver) {
		super(driver);
	}
	public String gettitle(){
		return title();
	}
	
	Locator offproduct = getLocator("offproduct");
	Locator starttime = getLocator("starttime");
	Locator endtime = getLocator("endtime");
	Locator workingdays = getLocator("workingdays");
	Locator workinghourseveryday = getLocator("workinghourseveryday");
	Locator starttimeInputbox = getLocator("starttimeInputbox");
	Locator endtimeInputbox = getLocator("endtimeInputbox");
	Locator workingdaysInputbox = getLocator("workingdaysInputbox");
	Locator workinghourseverydayInputbox = getLocator("workinghourseverydayInputbox");
	Locator submit = getLocator("submit");
	
	public void clickoffproduct(){
		click(offproduct);
	}
	public void typestarttime(String starttime){
		type(starttimeInputbox,starttime);
	}
	public void typeendtime(String endtime){
		type(endtimeInputbox,endtime);
	}
	public void typeworkingdays(String workingdays){
		type(workingdaysInputbox,workingdays);
	}
	public void typeworkinghourseveryday(String workinghourseveryday){
		type(workinghourseverydayInputbox,workinghourseveryday);
	}
	public void clicksubmit(){
		click(submit);
	}
}
