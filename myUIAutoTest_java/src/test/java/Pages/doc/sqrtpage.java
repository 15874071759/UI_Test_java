package Pages.doc;

import org.openqa.selenium.WebDriver;

import Common.basepage;

public class sqrtpage extends basepage{
	public sqrtpage(WebDriver driver){
		super(driver);
		driver.get("http://127.0.0.1/zentao/user-login.html");
	}
	
}
