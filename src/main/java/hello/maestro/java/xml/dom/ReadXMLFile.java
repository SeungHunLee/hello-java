package hello.maestro.java.xml.dom;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/**
 * 출처 : http://www.mkyong.com/java/how-to-read-xml-file-in-java-dom-parser/
 * In this tutorial, we will show you how to read an XML file via DOM XML parser. 
 * DOM parser parses the entire XML document and loads it into memory; 
 * then models it in a "TREE" structure for easy traversal or manipulation.
 * 
 * In short, it turns a XML file into DOM or Tree structure, and you have to traverse a node by node to get what you want
 * 
 * [What is Node?]
 * In the DOM, everything in an XML document is a node.
 * 
 * [Warning]
 * Dom Parser is slow and consumes a lot of memory when it loads an XML document which contains a lot of data.
 * Please consider SAX parser as solution for it, SAX is faster than DOM and use less memory.
 * 
 * This example shows you how to get the node by "name", and display the value.
 * */
public class ReadXMLFile {

	public static void main(String[] args) {

		try {
			File fXmlFile = new File("src/main/java/hello/maestro/java/xml/dom/staff.xml");
			DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
			Document doc = dBuilder.parse(fXmlFile);
			
			//optional, but recommended
			//read this - http://stackoverflow.com/questions/13786607/normalization-in-dom-parsing-with-java-how-does-it-work
			doc.getDocumentElement().normalize();
			
			System.out.println("Root element : " + doc.getDocumentElement().getNodeName());
			
			NodeList nList = doc.getElementsByTagName("staff");
			
			System.out.println("--------------------------------------");
			
			for(int temp = 0; temp < nList.getLength(); temp++){
				Node nNode = nList.item(temp);
				System.out.println("\nCurrent Element :" + nNode.getNodeName());
				
				if(nNode.getNodeType() == Node.ELEMENT_NODE){
					Element eElement = (Element)nNode;
					
					System.out.println("Staff id : " + eElement.getAttribute("id"));
					System.out.println("First Name : " + eElement.getElementsByTagName("firstname").item(0).getTextContent());
					System.out.println("Last Name : " + eElement.getElementsByTagName("lastname").item(0).getTextContent());
					System.out.println("Nick Name : " + eElement.getElementsByTagName("nickname").item(0).getTextContent());
					System.out.println("Salary Name : " + eElement.getElementsByTagName("salary").item(0).getTextContent());
				}
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
