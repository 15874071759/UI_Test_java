package Pages.backyardpages.custompages;

import org.openqa.selenium.WebDriver;

import Common.Locator;
import Common.basepage;

public class trashpage extends basepage{
	
	public trashpage(WebDriver driver) {
		super(driver);
	}
	public String gettitle(){
		return title();
	}
  Locator trashLink=getLocator("trashLink");
  Locator objectTypebutton=getLocator("objectTypebutton");
  Locator objectIDbutton=getLocator("objectIDbutton");
  Locator actorbutton=getLocator("actorbutton");
  Locator datebutton=getLocator("datebutton");
  
   public void clicktrash(){                                          //点击后台然之回收站链接
	  click(trashLink);
   }
  
   public void clickobjectTypebuttonn(){                             //点击后台然之回收站页对象类型按钮
		click(objectTypebutton);
  }
  
   public void clickobjectIDbutton(){                                //点击后台然之回收站页ID按钮
		click(objectIDbutton);
  }
  
   public void clickactorbutton(){                                   //点击后台然之回收站页操作者按钮
		click(actorbutton);
  }
   
   public void clicdatebutton(){                                     //点击后台然之回收站页日期按钮
		click(datebutton);
  }
   
}