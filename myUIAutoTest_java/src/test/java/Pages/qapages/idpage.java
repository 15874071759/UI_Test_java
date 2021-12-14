package Pages.qapages;

import org.openqa.selenium.WebDriver;

import Common.Locator;
import Common.basepage;

public class idpage extends basepage{
	public idpage(WebDriver driver) {
		super(driver);
	}
	
	public String gettitle(){
		return title();
	}
	Locator productdropdown = getLocator("productdropdown");
	Locator inputbox = getLocator("inputbox");
	Locator chooseclick = getLocator("chooseclick");
	
	public void productdropdown(){
		click(productdropdown);
	}
	public void productdropdown(String inputbox){
		type(productdropdown,inputbox);
	}
	public void chooseclick(){
		click(chooseclick);
	}
}
