package Pages.backyardpages.custompages;

import org.openqa.selenium.WebDriver;

import Common.Locator;
import Common.basepage;

public class backuppage extends basepage{
	public backuppage(WebDriver driver) {
		super(driver);
	}
	public String gettitle(){
		return title();
	}

	/*获取Locater对象*/
   Locator backupLink=getLocator("backupLink");
   Locator backupButton=getLocator("backupButton");
   Locator resetLink=getLocator("resetLink");
  
   public void clickbackup(){                              //点击后台备份链接
		click(backupLink);
   }
   public void clickbackupbutton(){                       //点击后台备份页备份按钮
		click(backupButton);
  }
   
   public void clickreset(){
 		click(resetLink);                               //点击后台备份页修改链接
   } 
}
