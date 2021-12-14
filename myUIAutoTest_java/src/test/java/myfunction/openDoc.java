package myfunction;

import java.lang.reflect.InvocationTargetException;

import org.openqa.selenium.WebDriver;

import Common.PageFactory;
import Pages.mainpage;
import Pages.projectpage;
import Pages.doc.allDocpage;

public class openDoc {
	private static WebDriver driver;
	public static void setdriver(WebDriver drivers){
		driver = drivers;
	}
	public  static WebDriver  getdriver(){
		return driver;
	}
	/**
	 * 进入文档模块
	 * @param mgs
	 * @return
	 * @throws ClassNotFoundException
	 * @throws NoSuchMethodException
	 * @throws SecurityException
	 * @throws IllegalArgumentException
	 * @throws InvocationTargetException
	 */
	public static allDocpage open(mainpage mgs) throws ClassNotFoundException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException{
		mainpage mg=mgs;
		mg.clickdocLink();
		return (allDocpage)PageFactory.getPage(allDocpage.class,driver);
	}
} 
