package Pages.productpages;

import org.openqa.selenium.WebDriver;

import Common.basepage;

public class projectpage extends basepage{

	public projectpage(WebDriver driver) {
		super(driver);
	}
	public String gettitle(){
		return title();
	}

}
