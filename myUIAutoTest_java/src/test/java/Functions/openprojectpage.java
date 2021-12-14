package Functions;

import java.lang.reflect.InvocationTargetException;

import org.openqa.selenium.WebDriver;

import Common.PageFactory;
import Pages.mainpage;
import Pages.projectpage;

public class openprojectpage {
	private static WebDriver driver;
	public static void setdriver(WebDriver drivers){
		driver = drivers;
	}
	public  static WebDriver  getdriver(){
		return driver;
	}
	public static projectpage open(mainpage mg) throws ClassNotFoundException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException{
		mg.clickProject();
		return (projectpage)PageFactory.getPage(projectpage.class,driver);
	}
}
