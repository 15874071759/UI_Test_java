package Functions;

import java.lang.reflect.InvocationTargetException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import Common.PageFactory;
import Pages.loginpage;
import Pages.mainpage;

public class loginOperate {
	private static WebDriver driver;
	public static void setdriver(WebDriver drivers){
		driver = drivers;
	}
	public  static WebDriver  getdriver(){
		return driver;
	}
	public static mainpage login(String username,String passwd) throws ClassNotFoundException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException{
		WebDriverWait wait = new WebDriverWait(driver,10);
		loginpage lg = new loginpage(driver);
		lg.typeusername(username);
		lg.typepassword(passwd);
		lg.clickloginbutton();
		return (mainpage)PageFactory.getPage(mainpage.class,driver);
	}
}
