import java.io.IOException;
import java.util.ArrayList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class Parser2 {
	
	private Document dom = null;
	private ArrayList<Libro> libros = null;
	private ArrayList<autor> autor=null;
	
	
	public Parser2() {
		
		libros = new ArrayList<Libro>();
		
	}
	
public void parseFicheroXml(String fichero) {
		
		// creamos una factory
				DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();

				try {
					// creamos un documentbuilder
					DocumentBuilder db = dbf.newDocumentBuilder();

					// parseamos el XML y obtenemos una representación DOM
					dom = db.parse(fichero);
				} catch (ParserConfigurationException pce) {
					pce.printStackTrace();
				} catch (SAXException se) {
					se.printStackTrace();
				} catch (IOException ioe) {
					ioe.printStackTrace();
				}
		
		
	}
	

public void parseDocument() {
	
	// obtenemos el elemento raíz
	Element docEle = dom.getDocumentElement();

	// obtenemos el nodelist de elementos
	NodeList nl = docEle.getElementsByTagName("libro");
	if (nl != null && nl.getLength() > 0) {
		for (int i = 0; i < nl.getLength(); i++) {

			// obtenemos un elemento de la lista (persona)
			Element el = (Element) nl.item(i);

			// obtenemos una persona
			Libro p = recuperarLibro(el);

			// lo añadimos al array
			libros.add(p);
		}
	}
	
	

}
