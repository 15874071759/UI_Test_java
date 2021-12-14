package Pages.projectpages.buildpages;

import org.openqa.selenium.WebDriver;

import Common.Locator;
import Common.basepage;

public class createbuildpage extends basepage{

	public createbuildpage(WebDriver driver) {
		super(driver);
	}
	public String gettitle(){
		return title();
	}
	Locator choseproductLink = getLocator("choseproductLink"); //项目版本页创建版本名称
	Locator nameLink = getLocator("nameLink");//名称编号
	Locator chosebuildLink = getLocator("chosebuildLink");//构建者
	Locator dateLink = getLocator("dateLink");//打包日期
	Locator scmPathLink = getLocator("scmPathLink");//源代码地址
	Locator filePathLink = getLocator("filePathLink");//下载地址
	Locator fileControlLink = getLocator("fileControlLink");//上行发行包浏览按钮
	Locator titleLink = getLocator("titleLink");//标题
	Locator artilecontentLink = getLocator("artilecontentLink");//描述
	Locator submitLink = getLocator("submitLink");//保存
	Locator backLink = getLocator("backLink");//返回
	public void clickchoseproduct(){
		click(choseproductLink);
	}
	public void typename(String name){
		type(nameLink,name);
	}
	public void clickchosebuild(){
		click(chosebuildLink);
	}
	public void clickdate(){
		click(dateLink);
	}
	public void typescmPath(String scmpath){
		type(scmPathLink,scmpath);
	}
	public void typefilePath(String filepath){
		type(filePathLink,filepath);
	}
	public void clickfileControl(){
		click(fileControlLink);
	}
	public void typetitle(String title){
		type(titleLink,title);
	}
	public void typeartilecontent(String artilecontent){
		type(artilecontentLink,artilecontent);
	}
	public void clicksubmit(){
		click(submitLink);
	}
	public void clickback(){
		click(backLink);
	}

}
