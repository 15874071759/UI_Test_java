package Pages.productpages;

import java.util.concurrent.TimeUnit;

import org.dom4j.DocumentException;
import org.openqa.selenium.WebDriver;

import Common.Locator;
import Common.XmlUtil;
import Common.basepage;

public class surveypage extends basepage{

	public surveypage(WebDriver driver) {
		super(driver);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://192.168.0.140:81/zentao/");
	}
	Locator sequencebutton = getLocator("sequencebutton");
	Locator displaybutton = getLocator("displaybutton");
	Locator offbutton = getLocator("offbutton");
	Locator editpjtbutton = getLocator("editpjtbutton");
	Locator removepjtbutton = getLocator("removepjtbutton");
	Locator backbutton1 = getLocator("backbutton1");
	Locator remarksinput = getLocator("remarksinput");
	Locator submitbotton = getLocator("submitbotton");
	Locator pjtnameinput = getLocator("pjtnameinput");
	Locator pjtcodeinput = getLocator("pjtcodeinput");
	Locator pjtpeochargeinput = getLocator("pjtpeochargeinput");
	Locator testpeochargeinput = getLocator("testpeochargeinput");
	Locator releasepeochargeinput = getLocator("releasepeochargeinput");
	Locator pjttypedropbox = getLocator("pjttypedropbox");
	Locator statuedropbutton = getLocator("statuedropbutton");
	Locator pjtdescribeinput = getLocator("pjtdescribeinput");
	Locator defaultsetbutton = getLocator("defaultsetbutton");
	Locator privatebutton = getLocator("privatebutton");
	Locator aclcustombutton = getLocator("aclcustombutton");
	Locator whitelist1 = getLocator("whitelist1");
	Locator whitelist2 = getLocator("whitelist2");
	Locator whitelist3 = getLocator("whitelist3");
	Locator whitelist4 = getLocator("whitelist4");
	Locator whitelist5 = getLocator("whitelist5");
	Locator whitelist6 = getLocator("whitelist6");
	Locator whitelist7 = getLocator("whitelist7");
	Locator whitelist8 = getLocator("whitelist8");
	Locator whitelist9 = getLocator("whitelist9");
	Locator whitelist10 = getLocator("whitelist10");
	Locator whitelist11= getLocator("whitelist11");
	
	
	
	
	
	public void clicksequencebutton(){
		click(sequencebutton);
	}
	public void clickdisplaybutton(){
		click(displaybutton);
	}
	public void clickoffbutton(){
		click(offbutton);
	}
	public void clickeditpjtbutton(){
		click(editpjtbutton);
	}
	public void clickremovepjtbutton(){
		click(removepjtbutton);
	}
	public void clickbackbutton1(){
		click(backbutton1);
	}
	public void typeremarks(String remarks){
		type(remarksinput,remarks);
	}
	public void clicksubmitbotton(){
		click(submitbotton);
	}
	public void typepjtname(String pjtname){
		type(pjtnameinput,pjtname);
	}
	public void typepjtcode(String pjtcode){
		type(pjtcodeinput,pjtcode);
	}
	public void typepjtpeocharge(String pjtpeocharge){
		type(pjtnameinput,pjtpeocharge);
	}
	public void typetestpeocharge(String testpeocharge){
		type(testpeochargeinput,testpeocharge);
	}
	public void typepjttypedropbox(String pjttype){
		type(pjttypedropbox,pjttype);
	}
	public void typereleasepeocharge(String releasepeocharge){
		type(releasepeochargeinput,releasepeocharge);
	}
	public void typepjtdescribe(String pjtdescribe){
		type(pjtdescribeinput,pjtdescribe);
	}
	
	public void clickstatuedropbutton(){
		click(statuedropbutton);
	}
	public void clickdefaultsetbutton(){
		click(defaultsetbutton);
	}
	public void clickprivatebutton(){
		click(privatebutton);
	}
	public void clickwhitelist1(){
		click(whitelist1);
	}
	public void clickwhitelist2(){
		click(whitelist2);
	}public void clickwhitelist3(){
		click(whitelist3);
	}public void clickwhitelist4(){
		click(whitelist4);
	}public void clickwhitelist5(){
		click(whitelist5);
	}public void clickwhitelist6(){
		click(whitelist6);
	}public void clickwhitelist7(){
		click(whitelist7);
	}public void clickwhitelist8(){
		click(whitelist8);
	}public void clickwhitelist9(){
		click(whitelist9);
	}public void clickwhitelist10(){
		click(whitelist10);
	}public void clickwhitelist11(){
		click(whitelist11);
	}
	

}

