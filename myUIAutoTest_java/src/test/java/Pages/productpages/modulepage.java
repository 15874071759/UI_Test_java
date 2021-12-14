package Pages.productpages;

import java.util.concurrent.TimeUnit;

import org.dom4j.DocumentException;
import org.openqa.selenium.WebDriver;

import Common.Locator;
import Common.XmlUtil;
import Common.basepage;

public class modulepage extends basepage{

	public modulepage(WebDriver driver) {
		super(driver);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://192.168.0.140:81/zentao/");
	}
	Locator moduleinput = getLocator("moduleinput");
	Locator shortsinput = getLocator("shortsinput");
	Locator addbutton = getLocator("addbutton");
	Locator removebutton = getLocator("removebutton");
	Locator submitbutton = getLocator("submitbutton");
	Locator backbutton = getLocator("backbutton");
	Locator copybutton = getLocator("copybutton");
	Locator projectdropbox = getLocator("projectdropbox");
	

	public void typemodule(String module){
		type(moduleinput,module);
	}
	public void typeshorts(String shorts){
		type(shortsinput,shorts);
	}
	public void clickaddbutton(){
		click(addbutton);
	}
	public void clickremovebutton(){
		click(removebutton);
	}
	public void clicksubmitbutton(){
		click(submitbutton);
	}
	public void clickbackbutton(){
		click(backbutton);
	}
	public void clickcopybutton(){
		click(copybutton);
	}
	public void clickprojectdropbox(){
		click(projectdropbox);
	}
	

}
