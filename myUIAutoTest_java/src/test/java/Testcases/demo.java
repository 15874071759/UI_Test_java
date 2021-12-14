package Testcases;

import java.lang.reflect.InvocationTargetException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Functions.loginOperate;
import Pages.loginpage;
import Pages.mainpage;
import Workflow.workflow;

public class demo {

	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
		WebDriver driver = new ChromeDriver();
//		loginOperate.setdriver(driver);
	//	mainpage mg=loginOperate.login("admin", "123456");
//		login_language.setdriver(driver);
//		login_language.login("admin", "123456");
//		System.out.println(mg.gettitle());
//		workflow.setdriver(driver);
//		workflow.openbugpage();
		loginpage lg= new loginpage(driver);
		lg.typeusername("admin");
		lg.typepassword("123456");
		lg.clickloginbutton();
	//	lg.keepLoginbutton();
  //  	lg.forgetPasswdLink();
//		lg.clicklanguagebutton();
	  //  lg.selectChinese();
//	    lg.selectEnglish();
	 //   lg.selectSchinese();
	//    lg.selectPhone();
	    mainpage mg=new mainpage(driver);
	    mg.clickaddblockLink();
//	    mg.clickdefinitionLink();
//	    mg.clickfirstLink();
	    
	}
}
