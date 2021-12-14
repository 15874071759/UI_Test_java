package Pages.productpages;

import org.openqa.selenium.WebDriver;
import Common.basepage;

public class CreateproductPage extends basepage{

	public CreateproductPage(WebDriver dv) {
		super(dv);
		// TODO Auto-generated constructor stub
	}

	//输入产品名字
	public void input_productname(String str){
		type(getLocator("productname"),str);
	}
	
	//输入产品代码
	public void input_productcode(String str){
		type(getLocator("productcode"),str);
	}
	
	//点击保存
	public void click_submit()
	{
		click(getLocator("productsubmit"));
	}
}
