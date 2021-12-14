package Pages.projectpages;

import org.openqa.selenium.WebDriver;

import Common.Locator;
import Common.basepage;

public class project_documentPage extends basepage{
	public project_documentPage(WebDriver driver){
		super(driver);
	}
	public String gettitle(){
		return title();
	}
	Locator doc = getLocator("doc");
	Locator createProject = getLocator("createProject");
	Locator ID = getLocator("ID");
	Locator category = getLocator("category");
	Locator documentTitle = getLocator("documentTitle");
	Locator whoAdd = getLocator("whoAdd");
	Locator addTime = getLocator("addTime");
	Locator belongProject = getLocator("belongProject");
	Locator choseProjectButton = getLocator("choseProjectButton");
	Locator choseProject = getLocator("choseProject");
	Locator belongProduct = getLocator("belongProduct");
	Locator choseProductButton = getLocator("choseProductButton");
	Locator choseProduct = getLocator("choseProduct");
	Locator belongKind = getLocator("belongKind");
	Locator choseKindButton = getLocator("choseKindButton");
	Locator chosekind = getLocator("chosekind");
	Locator file = getLocator("file");
	Locator link = getLocator("link");
	Locator webPage = getLocator("webPage");
	Locator tittle = getLocator("tittle");
	Locator keyword = getLocator("keyword");
	Locator summary = getLocator("summary");
	Locator extraFile = getLocator("extraFile");
	Locator addTittle = getLocator("addTittle");
	Locator delTittle = getLocator("delTittle");
	Locator submit = getLocator("submit");
	Locator back = getLocator("back");

	public void clickdoc(){
		click(doc);
	}
	public void clickcreateProject(){
		click(createProject);
	}
	public void clickID(){
		click(ID);
	}
	public void clickcategory(){
		click(category);
	}
	public void clickdocumentTitle(){
		click(documentTitle);
	}
	public void clickwhoAdd(){
		click(whoAdd);
	}
	public void clickaddTime(){
		click(addTime);
	}
	public void clickbelongProject(){
		click(belongProject);
	}
	public void clickchoseProjectButton(){
		click(choseProjectButton);
	}
	public void clickchoseProject(){
		click(choseProject);
	}
	public void clickbelongProduct(){
		click(belongProduct);
	}
	public void clickchoseProductButton(){
		click(choseProductButton);
	}
	public void clickchoseProduct(){
		click(choseProduct);
	}
	public void clickbelongKind(){
		click(belongKind);
	}
	public void clickchoseKindButton(){
		click(choseKindButton);
	}
	public void clickchosekind(){
		click(chosekind);
	}
	public void clickfile(){
		click(file);
	}
	public void clicklink(){
		click(link);
	}
	public void clickwebPage(){
		click(webPage);
	}
	public void typetittle(String context){
		type(tittle,context);
	}
	public void typekeyword(String context){
		type(tittle,context);
	}
	public void typesummary(String context){
		type(tittle,context);
	}
	public void clickextraFile(){
		click(extraFile);
	}
	public void clickaddTittle(){
		click(addTittle);
	}
	public void clickdelTittle(){
		click(delTittle);
	}
	public void clicksubmit(){
		click(submit);
	}
	public void clickback(){
		click(back);
	}

}
