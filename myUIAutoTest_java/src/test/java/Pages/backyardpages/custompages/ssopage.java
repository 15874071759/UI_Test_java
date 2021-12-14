package Pages.backyardpages.custompages;

import org.openqa.selenium.WebDriver;

import Common.Locator;
import Common.basepage;

public class ssopage extends basepage{
	
	public ssopage(WebDriver driver) {
		super(driver);
	}
	public String gettitle(){
		return title();
	}
  Locator assoLink=getLocator("ssoLink");
  Locator openbutton=getLocator("openbutton");
  Locator closebuton=getLocator("closebuton");
  Locator addrInputbox=getLocator("addrInputbox");
  Locator codeInputbox=getLocator("codeInputbox");
  Locator keyInputbox=getLocator(" keyInputbox");
  Locator submitbuton=getLocator("submitbuton");
  
   public void clickasso(){                                      //后台然之集成链接
		click(assoLink);
 }
  
   public void clickopenbutton(){                                 //点击后台然之集成打开按钮
	    click(openbutton);
  }

   public void clicksubmitbutton(){                                //点击后台然之集成保存按钮
	    click(submitbuton);
 }
   public void clickclosebuton(){                                  //后台然之集成关闭按钮
	    click(closebuton);
  }

   public void typeaddr(String addr){                              //后台然之集成接口地址输入框
	    type(addrInputbox,addr);
   }

   public void typekey(String key){                                //后台然之集成密匙输入框
	    type(keyInputbox,key);
   }
   
   public void typecode(String code){                                //后台然之集成代号输入框
	    type(codeInputbox,code);
   }
}