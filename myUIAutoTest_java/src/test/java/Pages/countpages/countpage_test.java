package Pages.countpages;

import java.util.concurrent.TimeUnit;

import org.dom4j.DocumentException;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

import org.dom4j.DocumentException;
import org.openqa.selenium.WebDriver;

import Common.Locator;
import Common.XmlUtil;
import Common.basepage;

public class countpage_test extends basepage{

	public countpage_test(WebDriver driver) {
		super(driver);
	}
	public String gettitle(){
		return title();
	}
	
	Locator Bugcreatetable = getLocator("Bugcreatetable");
	Locator Bugassigntable = getLocator("Bugassigntable");
	Locator offproduct = getLocator("offproduct");
	Locator overdueplan = getLocator("overdueplan");
	Locator product = getLocator("product");
	Locator project = getLocator("project");
	Locator offproductInputbox = getLocator("offproductInputbox");
	Locator overdueplanInputbox = getLocator("overdueplanInputbox");
	
	public void clickBugcreatetable(){
		click(Bugcreatetable);
	}
	public void clickBugassigntable(){
		click(Bugassigntable);
	}
	public void typeoffproduct(String offproduct){
		type(offproductInputbox,offproduct);
	}
	public void typeoverdueplan(String overdueplan){
		type(overdueplanInputbox,overdueplan);
	}
	public void clickproduct(){
		click(product);
	}
	public void clickproject(){
		click(project);
	}
}
