package Pages;

import java.util.concurrent.TimeUnit;

import org.dom4j.DocumentException;
import org.openqa.selenium.WebDriver;

import Common.Locator;
import Common.XmlUtil;
import Common.basepage;

public class loginpage extends basepage{

	public loginpage(WebDriver driver) {
		super(driver);
		//driver.get("http://127.0.0.1/zentao/user-login.html");
		driver.get("http://127.0.0.1/zentao/user-login-L3plbnRhby8=.html");
	}
	
	Locator usernameInputbox = getLocator("usernameInputbox");
	Locator passwordInputbox = getLocator("passwordInputbox");
	Locator loginButton = getLocator("loginButton"); 
	Locator keepLogin = getLocator("keepLogin");  //
	Locator forgetPasswd = getLocator("forgetPasswd");  //
	Locator languageButton = getLocator("languageButton");
	Locator schineseLink = getLocator("schineseLink");  //
	Locator chineseLink = getLocator("chineseLink");  //
	Locator englishLink = getLocator("englishLink");
	Locator phone = getLocator("phone");
	/**
	 * 用户名输入框传入数值，如admin
	 * @param username
	 */
	public void typeusername(String username){
		type(usernameInputbox,username);
	}
	public void typepassword(String passwd){
		type(passwordInputbox,passwd);
	}
	public void clickloginbutton(){
		click(loginButton);
	}
	/**
	 * 保持登录框勾选
	 */
	public void keepLoginbutton(){
		click(keepLogin);
	}
	/**
	 * 忘记密码链接
	 */
	public void forgetPasswdLink(){
		click(forgetPasswd);
	}
	public void clicklanguagebutton(){
		click(languageButton);
	}
	/**
	 * 选择英语
	 * @param 
	 */
	public void selectEnglish(){
		click(englishLink);
	}
	/**
	 * 选择简体
	 * @param 
	 */
	public void selectChinese(){
		click(schineseLink);
	}
	/**
	 * 选择繁体
	 * @param 
	 */
	public void selectSchinese(){
		click(chineseLink);
	}
	/**
	 * 选择手机
	 * @param 
	 */
	public void selectPhone(){
		click(phone);
	}
}
