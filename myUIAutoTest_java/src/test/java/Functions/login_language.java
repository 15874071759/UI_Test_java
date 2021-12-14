package Functions;

import org.openqa.selenium.WebDriver;

import Pages.loginpage;

public class login_language {
	private static WebDriver driver;
	public static void setdriver(WebDriver drivers){
		driver = drivers;
	}
	public  static WebDriver  getdriver(){
		return driver;
	}
	public static void login(String username,String passwd){
		loginpage lg = new loginpage(driver);
		lg.clicklanguagebutton();
	//	lg.selectlanguage();
		lg.selectChinese(); //
		lg.timewait(3);
		lg.typeusername(username);
		lg.typepassword(passwd);
		lg.clickloginbutton();
	}
}
