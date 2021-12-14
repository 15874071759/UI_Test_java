package Pages.projectpages;

import org.openqa.selenium.WebDriver;

import Common.Locator;
import Common.basepage;

public class bugpage extends basepage{

	public bugpage(WebDriver driver) {
		super(driver);
	}
	public String gettitle(){
		return title();
	}
	Locator downloadLink=getLocator("downloadLink");
	Locator addbugLink=getLocator("addbugLink");
	//导出数据frame
			Locator fileNameType =getLocator("fileNameType");//文件名
			Locator csvselect =getLocator("csvselect");//csv
			Locator xmlselect =getLocator("xmlselect");//xml
			Locator htmlselect =getLocator("htmlselect");//html
			Locator utfselect =getLocator("utfselect");//utf
			Locator gbkselect =getLocator("gbkselect");//gbk
			Locator allselect =getLocator("allselect");//全部记录
			Locator selectedselect =getLocator("selectedselect");//选中记录
			Locator template_chosen =getLocator("template_chosen");//选择模板
			Locator defaultselect =getLocator("defaultselect");//默认模板
			Locator export =getLocator("export");//导出
			Locator set =getLocator("set");//设置
	public void clickdownload(){
		click(downloadLink);
	}
	public void clickaddbug(){
		click(addbugLink);
	}
	//
	public void typefileName(String filename){
		type(fileNameType,filename);
	}
	public void clickcsvselect(){
		click(csvselect);
	}
	public void clickxmlselect(){
		click(xmlselect);
	}
	public void clickhtmlselect(){
		click(htmlselect);
	}
	public void clickutfselect(){
		click(utfselect);
	}
	public void clickgbkselect(){
		click(gbkselect);
	}
	public void clickallselect(){
		click(allselect);
	}
	public void clickselectedselect(){
		click(selectedselect);
	}
	public void clicktemplatechosen(){
		click(template_chosen);
	}
	public void clickdefaultselect(){
		click(defaultselect);
	}
	public void clickexport(){
		click(export);
	}
	public void clickset(){
		click(set);
	}
}
