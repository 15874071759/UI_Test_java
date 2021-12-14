package Pages.myzone;

import org.openqa.selenium.WebDriver;

import Common.Locator;
import Common.basepage;

public class myzone_dangan extends basepage{

	public myzone_dangan(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	Locator modfyDangan=getLocator("modfyDangan");
	Locator chadiao=getLocator("chadiao");
	Locator realname=getLocator("realname");
	Locator genderf=getLocator("genderf");
	Locator genderm=getLocator("genderm");
	Locator email=getLocator("email");
	Locator birthday=getLocator("birthday");	
	Locator account=getLocator("account");
	Locator password1=getLocator("password1");
	Locator commiter=getLocator("commiter");
	Locator password2=getLocator("password2");	
	Locator mobile=getLocator("mobile");
	Locator qq=getLocator("qq");
	Locator zipcode=getLocator("zipcode");
	Locator address=getLocator("address");	
	Locator verifyPassworde=getLocator("verifyPassworde");
	Locator submit=getLocator("submit");
	public void clickmodfyDangan(){
		click(modfyDangan);
	}
	public void clickchadiao(){
		click(chadiao);
	}
	public void clickrealname(){
		click(realname);
	}
	public void clickgenderf(){
		click(genderf);
	}
	public void clickgenderm(){
		click(genderm);
	}
	public void clickemail(){
		click(email);
	}
	public void clickbirthday(){
		click(birthday);
	}	
	public void clickaccount(){
		click(account);
	}
	public void clickpassword1(){
		click(password1);
	}
	public void clickcommiter(){
		click(commiter);
	}
	public void clickpassword2(){
		click(password2);
	}	
	public void clickmobile(){
		click(mobile);
	}
	public void clickqq(){
		click(qq);
	}
	public void clickzipcode(){
		click(zipcode);
	}
	public void clickaddress(){
		click(address);
	}	
	public void clickverifyPassworde(){
		click(verifyPassworde);
	}
	public void clicksubmit(){
		click(submit);
	}



}
