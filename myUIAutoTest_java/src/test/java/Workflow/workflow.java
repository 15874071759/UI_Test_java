package Workflow;

import java.lang.reflect.InvocationTargetException;

import org.openqa.selenium.WebDriver;

import Functions.loginOperate;
import Functions.openprojectpage;
import Pages.mainpage;
import Pages.projectpage;

public class workflow {
	private static WebDriver driver;
	public static void setdriver(WebDriver drivers){
		driver = drivers;
	}
	public  static WebDriver  getdriver(){
		return driver;
	}
	public static String openbugpage() throws ClassNotFoundException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException{
		loginOperate.setdriver(driver);
		mainpage mg = loginOperate.login("admin","123456");		
		openprojectpage.setdriver(driver);
		projectpage pg =openprojectpage.open(mg);
		pg.clickBug();
		return pg.gettitle();
	}
}
