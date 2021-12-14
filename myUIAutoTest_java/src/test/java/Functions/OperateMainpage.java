package Functions;

import java.lang.reflect.InvocationTargetException;

import org.openqa.selenium.WebDriver;

import Common.PageFactory;
import Pages.mainpage;

import Pages.myzone.myzone_page;
import Pages.productpages.projectpage;

public class OperateMainpage {
	private static  WebDriver driver;
	public static WebDriver GetDriver()
	{
		return driver;
	}
	public static void SetDriver(WebDriver drivers)
	{
		driver=drivers;
	}
	public static myzone_page OpenMyzone(mainpage mg) throws ClassNotFoundException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException{
		mg.clickProject();
		return (myzone_page)PageFactory.getPage(myzone_page.class,driver);
	}
	public static projectpage open(mainpage mg) throws ClassNotFoundException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException{
		mg.clickProject();
		return (projectpage)PageFactory.getPage(projectpage.class,driver);
	}
}
