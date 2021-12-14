package Pages.countpages;

import java.util.concurrent.TimeUnit;

import org.dom4j.DocumentException;
import org.openqa.selenium.WebDriver;

import Common.Locator;
import Common.XmlUtil;
import Common.basepage;

public class countpage_product extends basepage{

	public countpage_product(WebDriver driver) {
		super(driver);
	}
	public String gettitle(){
		return title();
	}

	Locator offproduct = getLocator("offproduct");
	Locator overdueplan = getLocator("overdueplan");
	
	public void clickoffproduct(){
		click(offproduct);
	}
	public void clickoverdueplan(){
		click(overdueplan);
	}
}
