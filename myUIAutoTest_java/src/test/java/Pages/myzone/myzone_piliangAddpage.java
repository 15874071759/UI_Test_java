package Pages.myzone;

import org.openqa.selenium.WebDriver;

import Common.Locator;
import Common.basepage;

public class myzone_piliangAddpage extends basepage{

	public myzone_piliangAddpage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	Locator date=getLocator("date");
	Locator switchDate=getLocator("switchDate");
	Locator actions=getLocator("actions");
	Locator fieldstype=getLocator("fieldstype");
	Locator fieldspri=getLocator("fieldspri");
	Locator fieldsdesc=getLocator("fieldsdesc");
	Locator fieldsbeginAndEnd=getLocator("fieldsbeginAndEnd");
	Locator baocunButton=getLocator("baocunButton");
	Locator chadiao=getLocator("chadiao");
	Locator types0c=getLocator("types0c");
	Locator types0b=getLocator("types0b");
	Locator types0t=getLocator("types0t");
	Locator pris01=getLocator("pris01");
	Locator pris02=getLocator("pris02");
	Locator pris03=getLocator("pris03");
	Locator pris04=getLocator("pris04");
	Locator nameBox1=getLocator("nameBox1");
	Locator nameBox1Select=getLocator("nameBox1Select");
	Locator describle=getLocator("describle");
	Locator fanhui=getLocator("fanhui");
	public void clickdate()
	{
		click(date);
	}
	public void clickswitchDate()
	{
		click(switchDate);
	}
	public void clickactions()
	{
		click(actions);
	}
	public void clickfieldstype()
	{
		click(fieldstype);
	}
	
	public void clickfieldspri()
	{
		click(fieldspri);
	}
	public void clickfieldsdesc()
	{
		click(fieldsdesc);
	}
	public void clickfieldsbeginAndEnd()
	{
		click(fieldsbeginAndEnd);
	}public void clickbaocunButton()
	{
		click(baocunButton);
	}
	
	public void clickchadiao()
	{
		click(chadiao);
	}
	public void clicktypes0c()
	{
		click(types0c);
	}
	public void clicktypes0b()
	{
		click(types0b);
	}
	public void clicktypes0t()
	{
		click(types0t);
	}
	public void clickpris01()
	{
		click(pris01);
	}
	public void clickpris02()
	{
		click(pris02);
	}
	public void clickpris03()
	{
		click(pris03);
	}
	public void clickpris04()
	{
		click(pris04);
	}
	public void clicknameBox1()
	{
		click(nameBox1);
	}
	public void clicknameBox1Select()
	{
		click(nameBox1Select);
	}
	public void clickdescrible()
	{
		click(describle);
	}
	public void clickfanhui()
	{
		click(fanhui);
	}
	
}
