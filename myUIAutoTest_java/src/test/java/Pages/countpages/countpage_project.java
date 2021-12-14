package Pages.countpages;

import java.util.concurrent.TimeUnit;

import org.dom4j.DocumentException;
import org.openqa.selenium.WebDriver;

import Common.Locator;
import Common.XmlUtil;
import Common.basepage;

public class countpage_project extends basepage{

	public countpage_project(WebDriver driver) {
		super(driver);
	}
	public String gettitle(){
		return title();
	}

	Locator starttime = getLocator("starttime");
	Locator endtime = getLocator("endtime");
	Locator starttimeInputbox = getLocator("starttimeInputbox");
	Locator endtimeInputbox = getLocator("endtimeInputbox");	
	
	public void typestarttime(String starttime){
		type(starttimeInputbox,starttime);
	}
	public void typeendtime(String endtime){
		type(endtimeInputbox,endtime);
	}
}
