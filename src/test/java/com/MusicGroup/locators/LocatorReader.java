package test.java.com.MusicGroup.locators;



import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.io.SAXReader;

import test.java.com.MusicGroup.util.PropertyReader;

public class LocatorReader {

	private Document doc;
	private  PropertyReader propObj;  
	
	public LocatorReader(String xmlName) {
		SAXReader reader = new SAXReader();
		try {
			//URL url = getClass().getResource(xmlName);
			//File file = new File(url.getFile());
			propObj = new PropertyReader();
			String localPath = propObj.getFilePath();
			localPath = localPath+"//src//test//java//com//MusicGroup//locators//";			
			doc = reader.read(localPath+xmlName);
		} catch (DocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public String getLocator(String locator){
		return doc.selectSingleNode("//" + locator.replace('.', '/')).getText();
		
	}
}
