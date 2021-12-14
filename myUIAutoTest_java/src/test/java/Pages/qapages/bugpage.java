package Pages.qapages;

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
	Locator uncloselink = getLocator("uncloselink");
	Locator alllink = getLocator("alllink");
	Locator assigntomelink = getLocator("assigntomelink");
	Locator openedbymelink = getLocator("openedbymelink");
	Locator resolvedbymelink = getLocator("resolvedbymelink");
	Locator unconfirmedlink = getLocator("unconfirmedlink");
	Locator assigntonulllink = getLocator("assigntonulllink");
	Locator unresolved = getLocator("unresolved");
	Locator toclosedlink = getLocator("toclosedlink");
	Locator longlifebugs = getLocator("longlifebugs");
	Locator postponedbugs = getLocator("postponedbugs");
	Locator needconfirm = getLocator("needconfirm");
	Locator outputlink = getLocator("outputlink");
	Locator outputdatelink = getLocator("outputdatelink");
	Locator reportlink = getLocator("reportlink");
	Locator addlink = getLocator("addlink");
	Locator creatbuglink = getLocator("creatbuglink");
	
	
	public void uncloselink(){
		click(uncloselink);
	}
	public void alllink(){
		click(alllink);
	}
	public void assigntomelink(){
		click(assigntomelink);
	}
	public void openedbymelink(){
		click(openedbymelink);
	}
	public void resolvedbymelink(){
		click(resolvedbymelink);
	}
	public void unconfirmedlink(){
		click(unconfirmedlink);
	}
	public void assigntonulllink(){
		click(assigntonulllink);
	}
	public void unresolved(){
		click(unresolved);
	}
	public void toclosedlink(){
		click(toclosedlink);
		
	}
	public void longlifebugs(){
		click(longlifebugs);
		
	}
	public void postponedbugs(){
		click(postponedbugs);
		
	}
	public void needconfirm(){
		click(needconfirm);
		
	}
	public void outputlink(){
		click(outputlink);
		
	}
	public void reportlink(){
		click(reportlink);
		
	}
	public void addlink(){
		click(addlink);
		
	}
	public void creatbuglink(){
		click(creatbuglink);
		
	}
}
