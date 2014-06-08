package ru.akorolev.xml;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;

/**
 * Created by akorolev on 5/23/14.
 */
public class Main {
    public static void main(String[] args) throws IOException, SAXException, ParserConfigurationException {
        DocumentBuilderFactory f = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = f.newDocumentBuilder();
        Document doc = builder.parse(new File("src/main/resources/simple.xml"));

        System.out.println(doc.getDocumentElement().getNodeName());//выводим название корневой ноды
        NodeList nodeList = doc.getChildNodes();
        for(int i = 0; i < nodeList.getLength(); i ++) {
            Node node = nodeList.item(i);
            System.out.println("current node: " + node.getNodeName());
            if (node.getNodeType() == Node.ELEMENT_NODE) {
                Element element = (Element) node;
                System.out.println(element.getElementsByTagName("product").item(0).getChildNodes().item(1).getTextContent());
            }

        }

        NodeList products = doc.getDocumentElement().getElementsByTagName("product");//беру два продукта
        for (int i = 0; i < products.getLength(); i++) {
            Node node = products.item(i);
            if(node.getNodeType() == Node.ELEMENT_NODE) {
                Element element = (Element) node;
                System.out.println("name = " + element.getElementsByTagName("name").item(0).getChildNodes().item(0).getTextContent());
                for (int j = 0; j < element.getChildNodes().getLength(); j++) {//бегу по нодам продукта - каждый тэг + окружение. Если внутри тэга что-то есть - это целиком одна нода
                }
            }
        }

    }
}
