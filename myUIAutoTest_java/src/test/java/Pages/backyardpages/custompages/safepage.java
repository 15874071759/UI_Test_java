package Pages.backyardpages.custompages;

import org.openqa.selenium.WebDriver;

import Common.Locator;
import Common.basepage;

public class safepage extends basepage{
	public safepage(WebDriver driver) {
		super(driver);
	}
	public String gettitle(){
		return title();
	}
	 Locator safeLink=getLocator("safeLink");
	 Locator safepasswdsetLink=getLocator("safepasswdsetLink");
	 Locator mode0button=getLocator("mode0button");
	 Locator mode1button=getLocator("mode1button");
	 Locator mode2button=getLocator("mode2button");
	 Locator weakboxInputbox=getLocator("weakboxInputbox");
	 Locator submitbutton=getLocator("submitbutton");
	 Locator checkWeakLink=getLocator("checkWeakLink");
	 Locator iconbutton=getLocator("iconbuttong");
	
	 public void clicksafe(){                                           //点击后台安全链接
			click(safeLink);
	   }
	 public void clicksafepasswdset(){                                 //点击后台安全页密码安全设置链接
			click(safepasswdsetLink);
	   }
	 public void clickmode0button(){                                    //点击后台安全页不检查按钮按钮选项
			click(mode0button);
	   }
	 public void clickmode1button(){                                    //点击后台安全页中按钮选项
			click(mode1button);
	   }
	 public void clickmode2button(){                                    //点击后台安全页强按钮选项
			click(mode2button);
	   }
	 public void typeweakbox(String weakbox){                            //选择后台安全页常用弱口令输入框
			type( weakboxInputbox, weakbox);
		}
	 public void clicksubmit(){                                           //点击后台安全页保存按钮
			click(submitbutton);
	   }
	 public void clickcheckWeak(){                                        //点击后台安全页弱口令扫描链接
			click(checkWeakLink);
	   }
	 public void clickicon(){                                             //点击后台安全页编辑用户按钮
			click(iconbutton);
	   }
	 	 
}