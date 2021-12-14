package myfunction;

import java.lang.reflect.InvocationTargetException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import Functions.loginOperate;
import Pages.loginpage;
import Pages.mainpage;
import Pages.projectpage;
import Pages.doc.ClassificationDocpage;
import Pages.doc.Dockupage;
import Pages.doc.allDocpage;

public class operatedemo {
	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException, InterruptedException {
	    WebDriver driver=new ChromeDriver();
		loginOperate.setdriver(driver);
		mainpage mg=loginOperate.login("admin","123456");
		openDoc.setdriver(driver);
		allDocpage docpage=openDoc.open(mg);
		operateAlldocpage.setdriver(driver);
		operateAlldocpage.addDocku(docpage, "小青青");
	//operateAlldocpage.addDocku(docpage,"小青青");
	//	createDocku.setdriver(driver);
	//	docpage=createDocku.createKu("小青青 ");	//  	
	}	
}
