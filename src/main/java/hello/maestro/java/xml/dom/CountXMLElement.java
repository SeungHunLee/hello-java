package hello.maestro.java.xml.dom;

import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

/**
 * 출처 : http://www.mkyong.com/java/how-to-count-xml-elements-in-java-dom-parser/
 * 
 * In this example, we show you how to use DOM Parser to count the total number
 * of elements in a XML file. First, search the element, and then you can use
 * NodeList.getLength() to get the total number of available elements
 * 
 */
public class CountXMLElement {

	public static void main(String[] args) {

		try {
			
			String filepath = "src/main/java/hello/maestro/java/xml/dom/count.xml";
			DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
			Document doc = docBuilder.parse(filepath);
			
			NodeList list = doc.getElementsByTagName("staff");
			
			System.out.println("Total of elements : " + list.getLength());

		} catch (ParserConfigurationException e) {
			e.printStackTrace();
		} catch (SAXException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
