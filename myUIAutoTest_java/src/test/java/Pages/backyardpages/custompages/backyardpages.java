package Pages.backyardpages.custompages;

import org.openqa.selenium.WebDriver;

import Common.Locator;
import Common.basepage;

public class backyardpages extends basepage{
	  public backyardpages(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
     
	 Locator indexLink= getLocator("indexLink");
	 Locator extensionLink=getLocator("extensionLink");
	 Locator mailLink=getLocator("mailLink");
	 Locator customLink=getLocator("customLink");
	 
	  public void clickindexLink(){
		  click(indexLink);
	  }

	  public void clickextensionLink(){
		  click(extensionLink);
	  }
	   
	  public void clickmailLink(){
		  click(mailLink);
	  }
	  
	  public void clickcustomLink(){
		  click(customLink);
	  }
		
	      
	    
   
}
