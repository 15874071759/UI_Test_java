package Common;

public class Locator {
	public enum ByType {
		xpath,id,linkText,name,className,cssSelector,partialLinkText,tagName
	}
	private String name;
	private String element;
	private int timeout;
	private ByType byType;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getElement() {
		return element;
	}
	public void setElement(String value) {
		this.element = value;
	}
	public int getTimeout() {
		return timeout;
	}
	public void setTimeout(int timeout) {
		this.timeout = timeout;
	}
	public ByType getByType() {
		return byType;
	}
	public void setByType(ByType type) {
		this.byType = type;
	}
	
	public Locator(String element){
		this.name = "元素:"+element;
		this.element = element;
		this.timeout = 3;
		this.byType = ByType.xpath;
	}
	
	public Locator(String element, int waitSec){
		this.name = "元素:"+element;
		this.element = element;
		this.timeout = waitSec;
		this.byType = ByType.xpath;
	}
	
	public Locator(String element,int waitSec,ByType byType){
		this.name = "元素:"+element;
		this.element = element;
		this.timeout = waitSec;
		this.byType = byType;
	}
	public Locator(String element,int waitSec,ByType byType,String name){
		this.name = name;
		this.element = element;
		this.timeout = waitSec;
		this.byType = byType;
	}

}
