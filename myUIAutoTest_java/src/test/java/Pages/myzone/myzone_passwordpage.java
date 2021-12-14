package Pages.myzone;

import org.openqa.selenium.WebDriver;

import Common.Locator;
import Common.basepage;

public class myzone_passwordpage extends basepage{

	public myzone_passwordpage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	Locator username=getLocator("username");
	Locator originalPassword=getLocator("originalPassword");
	Locator password1=getLocator("password1");
	Locator password2=getLocator("password2");
	Locator baocunButton=getLocator("baocunButton");
	public void clickusername(){
		click(username);
	}
	public void clickoriginalPassword(){
		click(originalPassword);
	}

	public void clickpassword1(){
		click(password1);
	}

	public void clickpassword2(){
		click(password2);
	}

	public void clickbaocunButton(){
		click(baocunButton);
	}


}
