package Pages.projectpages.crepages;


import org.openqa.selenium.WebDriver;

import Common.Locator;
import Common.basepage;



public class createreportpage extends basepage {
	public createreportpage(WebDriver driver) {
		super(driver);
		driver.get("http://127.0.0.1/zentao/user-login-L3plbnRhby8=.html");
	}
	public String gettitle(){
		return title();
	}
	Locator count1Link=getLocator("count1Link");
	Locator count2Link=getLocator("count2Link");
	Locator count3Link=getLocator("count3Link");
	Locator count4Link=getLocator("count4Link");
	Locator count5Link=getLocator("count5Link");
	Locator count6Link=getLocator("count6Link");
	Locator count7Link=getLocator("count7Link");
	Locator count8Link=getLocator("count8Link");
	Locator count9Link=getLocator("count9Link");
	Locator count10Link=getLocator("count10Link");
	Locator count11Link=getLocator("count11Link");
	Locator count12Link=getLocator("count12Link");
	Locator allcheckerLink=getLocator("allcheckerLink");
	Locator submitLink=getLocator("submitLink");
	Locator btnLink=getLocator("btnLink");
	
	public void clickcount1(){
    	click(count1Link);
    }
	public void clickcount2(){
    	click(count2Link);
    }
	public void clickcount3(){
    	click(count3Link);
    }
	public void clickcount4(){
    	click(count4Link);
    }
	public void clickcount5(){
    	click(count5Link);
    }
	public void clickcount6(){
    	click(count6Link);
    }
	public void clickcount7(){
    	click(count7Link);
    }
	public void clickcount8(){
    	click(count8Link);
    }
	public void clickcount9(){
    	click(count9Link);
    }
	public void clickcount10(){
    	click(count10Link);
    }
	public void clickcount11(){
    	click(count11Link);
    }
	public void clickcount12(){
    	click(count12Link);
    }
	public void clickallchecker(){
    	click(allcheckerLink);
    }
	public void clicksubmit(){
    	click(submitLink);
    }
	public void clickbtn(){
    	click(btnLink);
    }
}
    