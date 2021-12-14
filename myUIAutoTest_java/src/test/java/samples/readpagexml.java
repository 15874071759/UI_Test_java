package samples;

import org.dom4j.DocumentException;

import Common.Locator;
import Common.XmlUtil;

public class readpagexml {

	public static void main(String[] args) throws DocumentException {
		Locator locator;
		locator = XmlUtil.read_page_elements("D:\\android_workspace\\UIAutoTest_T49\\xmls\\pages.xml", "loginpage").get("usernameInputbox");
		System.out.println(locator.getName());
		readpagexml re = new readpagexml();
		re.cl();
	}
	
	public void cl(){
		System.out.println(this.getClass().getSimpleName());
	}

}
