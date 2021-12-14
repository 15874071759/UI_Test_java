package Common;

import org.dom4j.DocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * 
 * @author Lqj
 * @time 2016-10-28 09:35
 * 页面的基本类，其它页面类都要继承该类，实现了类的公共方法
 */
public class basepage {
	private WebDriver driver;
	protected Log log = new Log(this.getClass());
	public basepage(WebDriver driver){
		this.driver = driver;
	}
	/**
	 * @author Administrator
	 * @param loc
	 * @return
	 */
	public WebElement findelement(final Locator loc){
		WebDriverWait wait = new WebDriverWait(driver, loc.getTimeout());
		WebElement el = wait.until(new ExpectedCondition<WebElement>() {   
            public WebElement apply(WebDriver d) {
                return getElement(d,loc);  
            }  
        });
		return el;
	}
	
	public WebElement getElement(WebDriver driver,Locator loc){
		WebElement el = null;
		switch(loc.getByType()){
		case xpath:
			el = driver.findElement(By.xpath(loc.getElement()));
			break;
		case id:
			el = driver.findElement(By.id(loc.getElement()));
			break;
		case linkText:
			el = driver.findElement(By.linkText(loc.getElement()));
			break;
		case name:
			el = driver.findElement(By.name(loc.getElement()));
			break;
		case className:
			el = driver.findElement(By.className(loc.getElement()));
			break;
		case cssSelector:
			el = driver.findElement(By.cssSelector(loc.getElement()));
			break;
		case partialLinkText:
			el = driver.findElement(By.partialLinkText(loc.getElement()));
			break;
		case tagName:
			el = driver.findElement(By.tagName(loc.getElement()));
			break;
		}
		log.info("网页识别 "+loc.getName()+" 成功");
		return el;
	}
	/**
	 * 
	 * 对输入进行二次封装
	 * @author Administrator
	 * @param loc
	 * @param content
	 * @return void
	 * @Time 2016-10-28 09:39
	 */
	public void type(Locator loc,String content){
		WebElement el = findelement(loc);//调用查找元素的方法
		el.sendKeys(content);
		log.info(loc.getName()+" 输入："+content);
	}
	
	public void click(Locator loc){
		WebElement el = findelement(loc);
		el.click();
    	log.info("点击："+loc.getName());
	}
	
	public String title(){
		timewait(3);
		String title = driver.getTitle();
		log.info("获取当前网页标题："+title);
		return title;
	}
	
	public void timewait(int seconds){
		try {
			log.info("开始等待："+seconds+"秒");
			Thread.sleep(seconds*1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public Locator getLocator(String element) {
		Locator locator = null;
		try {
			locator = XmlUtil.read_page_elements(System.getProperty("user.dir")+"\\xmls\\pages.xml",this.getClass().getSimpleName()).get(element);
			String path = System.getProperty("user.dir")+"\\xmls\\"+this.getClass().getSimpleName()+".xml";
			log.info(path);
			path = path.replace("\\target","");
			log.info(path);
			locator = XmlUtil.read_elements(path).get(element);
		} catch (DocumentException e) {
			e.printStackTrace();
		}
		return locator;
	}
}
