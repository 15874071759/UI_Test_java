package samples;

import java.io.File;
import java.util.Iterator;
import java.util.List;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

public class readxml {

	public static void main(String[] args) throws DocumentException {
		SAXReader reader = new SAXReader(); // 创建saxreader对象  D:\\android_workspace\\UIAutoTest_T49\\xmls\\pages.xml
		Document document = reader.read(new File("D:\\workspace-32\\UIAutoTest_T49\\xmls\\loginpage.xml"));// 读取一个文件，把这个文件转换成Document对象
		Element node = document.getRootElement();// 获取根元素
		System.out.println(node.getName());
	
		System.out.println(node.attributeValue("name"));//根元素name属性值
		List<Element> page = node.elements("page");
		Element loginpage = page.get(2);
		System.out.println(loginpage.attributeValue("name"));
		List<Element> childList = loginpage.elements("element");//当前节点下面子节点list
		for(Element i:childList)
			System.out.println(i.getText()); //节点的文本
//		
//		Iterator<Element> it = node.elementIterator("element");//当前节点下面子节点迭代器 
//		while(it.hasNext()){
//			System.out.println(it.next().attributeValue("name"));
//		}
	}

}
