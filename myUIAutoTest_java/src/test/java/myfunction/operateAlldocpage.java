package myfunction;

import java.lang.reflect.InvocationTargetException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;

import Common.PageFactory;
import Pages.loginpage;
import Pages.mainpage;
import Pages.projectpage;
import Pages.doc.allDocpage;
import Pages.doc.docpage;
import Pages.doc.ClassificationDocpage;
import Pages.doc.Dockupage;

public class operateAlldocpage {
	public static  WebDriver driver;
	public static void setdriver(WebDriver drivers){
		driver=drivers;
	}
	public static WebDriver getdriver(){
		return driver;
	}
	/**
	 * 添加文档库
	 * @param alldocs
	 * @param kunane
	 * @return
	 * @throws ClassNotFoundException
	 * @throws NoSuchMethodException
	 * @throws SecurityException
	 * @throws IllegalArgumentException
	 * @throws InvocationTargetException
	 */
	 public static allDocpage  addDocku(allDocpage alldocs,String kunane) throws ClassNotFoundException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException{
		 allDocpage alldoc=alldocs;
		 alldoc.addDockulink();
		 driver.switchTo().frame("modalIframe");
		 Dockupage createku=new Dockupage(driver);
		 createku.dockuName(kunane);
		 createku.saveClick();
    	 return (allDocpage)PageFactory.getPage(allDocpage.class,driver);	 
	 } 
	 
	 /**
	  * 进入文档模块的文档页
	  * @param alldocs
	  * @return
	  * @throws ClassNotFoundException
	  * @throws NoSuchMethodException
	  * @throws SecurityException
	  * @throws IllegalArgumentException
	  * @throws InvocationTargetException
	  */
	public static docpage EnterDocpage(allDocpage alldocs) throws ClassNotFoundException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException{
		 allDocpage alldoc=alldocs;
		 alldoc.docLink();
		return (docpage)PageFactory.getPage(docpage.class,driver);
	}
	/**
	 * 进入文档页的分类页
	 * @param alldocs
	 * @return
	 * @throws ClassNotFoundException
	 * @throws NoSuchMethodException
	 * @throws SecurityException
	 * @throws IllegalArgumentException
	 * @throws InvocationTargetException
	 */
	public static ClassificationDocpage EnterClassificationDocpage(allDocpage alldocs) throws ClassNotFoundException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException{
		 allDocpage alldoc=alldocs;
		 alldoc.ClassificationDoc();
		return (ClassificationDocpage)PageFactory.getPage(ClassificationDocpage.class,driver);
	}
	/**
	 * 重新编辑文档库
	 * @param alldocs
	 * @param kunane
	 * @return
	 * @throws ClassNotFoundException
	 * @throws NoSuchMethodException
	 * @throws SecurityException
	 * @throws IllegalArgumentException
	 * @throws InvocationTargetException
	 */
	 public static allDocpage  editDocku(allDocpage alldocs,String kunane) throws ClassNotFoundException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException{
		 allDocpage alldoc=alldocs;
		 alldoc.editDoc();
		 driver.switchTo().frame("modalIframe");
		 Dockupage createku=new Dockupage(driver);
		 createku.dockuName(kunane);
		 createku.saveClick();
    	 return (allDocpage)PageFactory.getPage(allDocpage.class,driver);	 
	 } 
	 /**
	  * 删除文档库（处理js）
	  * @param alldocs
	  * @param kunane
	  * @return
	  * @throws ClassNotFoundException
	  * @throws NoSuchMethodException
	  * @throws SecurityException
	  * @throws IllegalArgumentException
	  * @throws InvocationTargetException
	  */
	 public static allDocpage  deleteLink(allDocpage alldocs,String kunane) throws ClassNotFoundException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException{
		 allDocpage alldoc=alldocs;
		 alldoc.deleteDoc();
		 Alert alert=driver.switchTo().alert();
		 alert.accept();
    	 return (allDocpage)PageFactory.getPage(allDocpage.class,driver);	 
	 } 
	 
}
