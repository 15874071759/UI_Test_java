package Pages.productpages;

import org.openqa.selenium.WebDriver;

import Common.Locator;
import Common.basepage;

public class documentpage extends basepage{

	public documentpage(WebDriver driver) {
		super(driver);
		
	}
	public String gettitle(){
		return title();
	}
	
	Locator createproduct = getLocator("createproduct");
	Locator IDbutton = getLocator("IDbutton");
	Locator classButton = getLocator("classButton");
	Locator ducumenttitleButton = getLocator("ducumenttitleButton");
	Locator addbutton = getLocator("addbutton");
	Locator timebuttonk = getLocator("timebuttonk");
	Locator operationbutton = getLocator("operationbutton");
	Locator producttext = getLocator("producttext");
	Locator classtext = getLocator("classtext");
	Locator typefilebutton = getLocator("typefilebutton");
	Locator typeurbutton = getLocator("typeurbutton");
	Locator typetextbutton = getLocator("typetextbutton");
	Locator documenttitletext = getLocator("documenttitletext");
	Locator keywordstext = getLocator("keywordstext");
	Locator digesttext = getLocator("digesttext");
	Locator fileControlbutton = getLocator("fileControlbutton");
	Locator accessorytitle = getLocator("accessorytitle");
	Locator accessoryplus = getLocator("accessoryplus");
	Locator accessoryremove = getLocator("accessoryremove");
	Locator submitbutton = getLocator("submitbutton");
	Locator backbutton = getLocator("backbutton");
	
	public void clickcreateproduct(){
		click(createproduct);
	}
	public void clickIDbutton(){
		click(IDbutton);
	}
	public void clickclassButton(){
		click(classButton);
	}
	public void clickducumenttitleButton(){
		click(ducumenttitleButton);
	}
	public void clickaddbutton(){
		click(addbutton);
	}
	public void clicktimebuttonk(){
		click(timebuttonk);
	}
	public void clickoperationbutton(){
		click(operationbutton);
	}
	public void clicktypefilebutton(){
		click(typefilebutton);
	}
	public void clicktypeurbutton(){
		click(typeurbutton);
	}
	public void clicktypetextbutton(){
		click(typetextbutton);
	}
	public void clickaccessoryplus(){
		click(accessoryplus);
	}
	public void clickaccessoryremove(){
		click(accessoryremove);
	}
	public void clicksubmitbutton(){
		click(submitbutton);
	}
	public void clickbackbutton(){
		click(backbutton);
	}
	public void typeproducttext(String product){
		type(producttext,product);
	}
	public void typeclasstext(String classword){
		type(classtext,classword);
	}
	public void typedocumenttitletext(String document){
		type(documenttitletext,document);
	}
	public void typekeywordstext(String keywords){
		type(keywordstext,keywords);
	}
	public void typedigesttext(String digest){
		type(digesttext,digest);
	}
	public void typeaccessorytitle(String accessory){
		type(accessorytitle,accessory);
	}


}
