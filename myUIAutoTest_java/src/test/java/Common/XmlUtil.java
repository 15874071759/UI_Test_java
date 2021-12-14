package Common;

import java.io.File;
import java.util.HashMap;
import java.util.List;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import Common.Locator.ByType;

public class XmlUtil {
	
	public static HashMap<String,Locator> read_elements(String path) throws DocumentException{
		HashMap<String,Locator> elementsmap = new HashMap<String,Locator>();
		SAXReader reader = new SAXReader();
		Document document = reader.read(new File(path));
		Element node = document.getRootElement();
		List<Element> childList = node.elements("element");
		for(Element i:childList){
			String name = i.attributeValue("name");
			String element = i.attributeValue("value");
			int timeout = Integer.parseInt(i.attributeValue("timeout"));
			ByType bytype = getByType(i.attributeValue("type"));
			String key = i.getText();
			Locator locator = new Locator(element,timeout,bytype,name);
			elementsmap.put(key, locator);
		}
		return elementsmap;
	}
	
	public static HashMap<String,Locator> read_page_elements(String path,String pg) throws DocumentException{
		HashMap<String,Locator> elementsmap = new HashMap<String,Locator>();
		SAXReader reader = new SAXReader();
		Document document = reader.read(new File(path));
		Element node = document.getRootElement();
		List<Element> pages = node.elements("page");
		for(Element page:pages){
			if(page.attributeValue("name").equals(pg)){
				List<Element> childList = page.elements("element");
				for(Element i:childList){
					String name = i.attributeValue("name");
					String element = i.attributeValue("value");
					int timeout = Integer.parseInt(i.attributeValue("timeout"));
					ByType bytype = getByType(i.attributeValue("type"));
					String key = i.getText();
					Locator locator = new Locator(element,timeout,bytype,name);
					elementsmap.put(key, locator);
				}
				break;
			}
		}
		return elementsmap;
	}
	public static ByType getByType(String type){
		ByType byType = ByType.xpath;
		if (type == null || type.equalsIgnoreCase("xpath")){
			byType = ByType.xpath;
		}else if (type.equalsIgnoreCase("id")){
			byType = ByType.id;			
		}else if (type.equalsIgnoreCase("linkText")){
			byType = ByType.linkText;
		}else if (type.equalsIgnoreCase("name")){
			byType = ByType.name;
		}else if (type.equalsIgnoreCase("classname")){
			byType = ByType.className;
		}else if (type.equalsIgnoreCase("css")){
			byType =ByType.cssSelector;
		}else if (type.equalsIgnoreCase("partialLinkText")){
			byType = ByType.partialLinkText;
		}else if (type.equalsIgnoreCase("tagName")){
			byType = ByType.tagName;
		}
		return byType;
	}
}
