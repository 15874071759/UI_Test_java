package Pages.organizationpages;

import org.openqa.selenium.WebDriver;

import Common.Locator;
import Common.basepage;

       //“组织”视图下的“公司”子页面
	   public class organizationpages_company extends basepage{

	    public organizationpages_company(WebDriver driver) {
		super(driver);
	}
	//
	Locator edit = getLocator("edit");
	Locator companynameInput = getLocator("companynameInput");
	Locator telephoneInput = getLocator("telephoneInput");
	Locator faxInput = getLocator("faxInput");
	Locator addressInput = getLocator("addressInput");
	Locator zipcodeInput = getLocator("zipcodeInput");
	Locator websiteInput = getLocator("websiteInput");
	Locator backyardInput = getLocator("backyardInput");
	Locator guestnologin = getLocator("guestnologin");
	Locator guestlogin = getLocator("guestlogin");
	Locator submit = getLocator("submit");
	Locator close = getLocator("close");


	public void clickedit(){
		click(edit);
	}
	//点击，输入“公司名称”
	public void clickcompanynameInput(){
		click(companynameInput);
	}
	public void typecompanyname(String companyname){
		type(companynameInput,companyname);
	}
	//点击，输入“联系电话”
	public void clicktelephoneInput(){
		click(telephoneInput);
	}
	public void typetelephone(String telephone){
		type(telephoneInput,telephone);
	}
	//点击，输入“传真”
	public void clickfaxInput(){
		click(faxInput);
	}
	public void typefax(String fax){
		type(faxInput,fax);
	}
	//点击，输入“通讯地址”
	public void clickaddressInput(){
		click(addressInput);
	}
	public void typeaddress(String address){
		type(addressInput,address);
	}
	//点击，输入“邮政编码”
	public void clickzipcodeInput(){
		click(zipcodeInput);
	}
	public void typezipcode(String zipcode){
		type(zipcodeInput,zipcode);
	}
	//点击，输入“官网”
	public void clickwebsiteInput(){
		click(websiteInput);
	}
	public void typewebsite(String website){
		type(websiteInput,website);
	}
	//点击，输入“内网”
	public void clickbackyardInput(){
		click(backyardInput);
	}
	public void typebackyard(String backyard){
		type(backyardInput,backyard);
	}
	//点击“匿名登录-不允许”
	public void clickguestnologin(){
		click(guestnologin);
	}
	//点击“匿名登录-允许”
	public void clickguestlogin(){
		click(guestlogin);
	}
	//点击“保存”
	public void clicksubmit(){
		click(submit);
	}
	//点击“关闭”
	public void clickclose(){
		click(close);
	}
}


	       
		


