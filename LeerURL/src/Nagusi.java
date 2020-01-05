import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.net.URL;
import java.util.Stack;

import javax.swing.text.html.HTML.Tag;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;

public class Nagusi {

	public static void main(String[] args) {

		leerAlbergues();

	}

	public static void leerAlojamientoRurales() {

		try {

			File fileAloRural = new File("../LeerURL/alojamientoRural.xml");
			FileReader fr = new FileReader(fileAloRural);
			BufferedReader br = new BufferedReader(fr);
			String entrada;
			String cadena = "";

			while ((entrada = br.readLine()) != null) {
				cadena = cadena + entrada;
			}

			DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
			DocumentBuilder db = dbf.newDocumentBuilder();

			InputSource archivo = new InputSource();
			archivo.setCharacterStream(new StringReader(cadena));

			Document documento = db.parse(archivo);
			documento.getDocumentElement().normalize();

			NodeList nodeLista = documento.getElementsByTagName("row");
//			System.out.println("Informacion de los libros");

			for (int s = 0; s < nodeLista.getLength(); s++) {

				Stack<Tag> tagStack = new Stack<Tag>();
				Node nodoResponsable = nodeLista.item(s);
				NodeList listaDeNodos;
				Element elementos;
				int cont = 0;
				String titulo;
				String descripcion;
				String telefono;
				String direccion;
				String marks; // zona ej:Costa vasca...
				String disf_fis;
				String disf_vis;
				String disf_audi;
				String disf_inte;
				String disf_orga;

				if (nodoResponsable.getNodeType() == Node.ELEMENT_NODE) {

					System.out.println("-------------------------");
					Element primerElemento = (Element) nodoResponsable;
					listaDeNodos = primerElemento.getElementsByTagName("documentname");

					elementos = (Element) listaDeNodos.item(0);
					if (elementos != null) {
						listaDeNodos = elementos.getChildNodes();
						titulo = ((Node) listaDeNodos.item(0)).getNodeValue().toString();
						System.out.println(titulo);
					}
					
					listaDeNodos = primerElemento.getElementsByTagName("turismdescription");
					elementos = (Element) listaDeNodos.item(1);
					if (elementos != null) {
						listaDeNodos = elementos.getChildNodes();
						descripcion = ((Node) listaDeNodos.item(0)).getNodeValue().toString();
						System.out.println(descripcion);
					}
					
					listaDeNodos = primerElemento.getElementsByTagName("phone");
					elementos = (Element) listaDeNodos.item(0);
					if (elementos != null) {
						listaDeNodos = elementos.getChildNodes();
						telefono = ((Node) listaDeNodos.item(0)).getNodeValue().toString();
						System.out.println(telefono);
					}

					listaDeNodos = primerElemento.getElementsByTagName("address");
					elementos = (Element) listaDeNodos.item(0);
					if (elementos != null) {
						listaDeNodos = elementos.getChildNodes();
						direccion = ((Node) listaDeNodos.item(0)).getNodeValue().toString();
						System.out.println(direccion);
					}

					listaDeNodos = primerElemento.getElementsByTagName("marks");
					elementos = (Element) listaDeNodos.item(0);
					if (elementos != null) {
						listaDeNodos = elementos.getChildNodes();
						marks = ((Node) listaDeNodos.item(0)).getNodeValue().toString();
						System.out.println(marks);
					}

					listaDeNodos = primerElemento.getElementsByTagName("physical");
					elementos = (Element) listaDeNodos.item(0);
					if (elementos != null) {
						listaDeNodos = elementos.getChildNodes();
						disf_fis = ((Node) listaDeNodos.item(0)).getNodeValue().toString();
						System.out.println(disf_fis);
					}

					listaDeNodos = primerElemento.getElementsByTagName("visual");
					elementos = (Element) listaDeNodos.item(0);
					if (elementos.getFirstChild() != null) {
						listaDeNodos = elementos.getChildNodes();
						disf_vis = ((Node) listaDeNodos.item(0)).getNodeValue().toString();
						System.out.println(disf_vis);
					}

					listaDeNodos = primerElemento.getElementsByTagName("auditive");
					elementos = (Element) listaDeNodos.item(0);
					if (elementos != null) {
						listaDeNodos = elementos.getChildNodes();
						disf_audi = ((Node) listaDeNodos.item(0)).getNodeValue().toString();
						System.out.println(disf_audi);
					}

					listaDeNodos = primerElemento.getElementsByTagName("organic");
					elementos = (Element) listaDeNodos.item(0);
					if (elementos != null) {
						listaDeNodos = elementos.getChildNodes();
						disf_orga = ((Node) listaDeNodos.item(0)).getNodeValue().toString();
						System.out.println(disf_orga);
					}
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}

	public static void leerCampings() {

		try {

			File fileAloRural = new File("../LeerURL/camping.xml");
			FileReader fr = new FileReader(fileAloRural);
			BufferedReader br = new BufferedReader(fr);
			String entrada;
			String cadena = "";

			while ((entrada = br.readLine()) != null) {
				cadena = cadena + entrada;
			}

			DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
			DocumentBuilder db = dbf.newDocumentBuilder();

			InputSource archivo = new InputSource();
			archivo.setCharacterStream(new StringReader(cadena));

			Document documento = db.parse(archivo);
			documento.getDocumentElement().normalize();

			NodeList nodeLista = documento.getElementsByTagName("row");
//			System.out.println("Informacion de los libros");

			for (int s = 0; s < nodeLista.getLength(); s++) {

				Stack<Tag> tagStack = new Stack<Tag>();
				Node nodoResponsable = nodeLista.item(s);
				NodeList listaDeNodos;
				Element elementos;
				int cont = 0;
				String titulo;
				String descripcion;
				String telefono;
				String direccion;
				String marks; // zona ej:Costa vasca...
				String disf_fis;
				String disf_vis;
				String disf_audi;
				String disf_inte;
				String disf_orga;

				if (nodoResponsable.getNodeType() == Node.ELEMENT_NODE) {

					System.out.println("-------------------------");
					Element primerElemento = (Element) nodoResponsable;
					listaDeNodos = primerElemento.getElementsByTagName("documentname");

					elementos = (Element) listaDeNodos.item(0);
					if (elementos != null) {
						listaDeNodos = elementos.getChildNodes();
						titulo = ((Node) listaDeNodos.item(0)).getNodeValue().toString();
						System.out.println(titulo);
					}
					
					listaDeNodos = primerElemento.getElementsByTagName("turismdescription");
					elementos = (Element) listaDeNodos.item(1);
					if (elementos != null) {
						listaDeNodos = elementos.getChildNodes();
						descripcion = ((Node) listaDeNodos.item(0)).getNodeValue().toString();
						System.out.println(descripcion);
					}
					
					listaDeNodos = primerElemento.getElementsByTagName("phone");
					elementos = (Element) listaDeNodos.item(0);
					if (elementos != null) {
						listaDeNodos = elementos.getChildNodes();
						telefono = ((Node) listaDeNodos.item(0)).getNodeValue().toString();
						System.out.println(telefono);
					}

					listaDeNodos = primerElemento.getElementsByTagName("address");
					elementos = (Element) listaDeNodos.item(0);
					if (elementos != null) {
						listaDeNodos = elementos.getChildNodes();
						direccion = ((Node) listaDeNodos.item(0)).getNodeValue().toString();
						System.out.println(direccion);
					}

					listaDeNodos = primerElemento.getElementsByTagName("marks");
					elementos = (Element) listaDeNodos.item(0);
					if (elementos != null) {
						listaDeNodos = elementos.getChildNodes();
						marks = ((Node) listaDeNodos.item(0)).getNodeValue().toString();
						System.out.println(marks);
					}

					listaDeNodos = primerElemento.getElementsByTagName("physical");
					elementos = (Element) listaDeNodos.item(0);
					if (elementos != null) {
						listaDeNodos = elementos.getChildNodes();
						disf_fis = ((Node) listaDeNodos.item(0)).getNodeValue().toString();
						System.out.println(disf_fis);
					}

					listaDeNodos = primerElemento.getElementsByTagName("visual");
					elementos = (Element) listaDeNodos.item(0);
					if (elementos.getFirstChild() != null) {
						listaDeNodos = elementos.getChildNodes();
						disf_vis = ((Node) listaDeNodos.item(0)).getNodeValue().toString();
						System.out.println(disf_vis);
					}

					listaDeNodos = primerElemento.getElementsByTagName("auditive");
					elementos = (Element) listaDeNodos.item(0);
					if (elementos != null) {
						listaDeNodos = elementos.getChildNodes();
						disf_audi = ((Node) listaDeNodos.item(0)).getNodeValue().toString();
						System.out.println(disf_audi);
					}

					listaDeNodos = primerElemento.getElementsByTagName("organic");
					elementos = (Element) listaDeNodos.item(0);
					if (elementos != null) {
						listaDeNodos = elementos.getChildNodes();
						disf_orga = ((Node) listaDeNodos.item(0)).getNodeValue().toString();
						System.out.println(disf_orga);
					}
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}

	public static void leerAlbergues() {

		try {

			File fileAloRural = new File("../LeerURL/alberges.xml");
			FileReader fr = new FileReader(fileAloRural);
			BufferedReader br = new BufferedReader(fr);
			String entrada;
			String cadena = "";

			while ((entrada = br.readLine()) != null) {
				cadena = cadena + entrada;
			}

			DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
			DocumentBuilder db = dbf.newDocumentBuilder();

			InputSource archivo = new InputSource();
			archivo.setCharacterStream(new StringReader(cadena));

			Document documento = db.parse(archivo);
			documento.getDocumentElement().normalize();

			NodeList nodeLista = documento.getElementsByTagName("row");
//			System.out.println("Informacion de los libros");

			for (int s = 0; s < nodeLista.getLength(); s++) {

				Stack<Tag> tagStack = new Stack<Tag>();
				Node nodoResponsable = nodeLista.item(s);
				NodeList listaDeNodos;
				Element elementos;
				int cont = 0;
				String titulo;
				String descripcion;
				String telefono;
				String direccion;
				String marks; // zona ej:Costa vasca...
				String disf_fis;
				String disf_vis;
				String disf_audi;
				String disf_inte;
				String disf_orga;

				if (nodoResponsable.getNodeType() == Node.ELEMENT_NODE) {

					System.out.println("-------------------------");
					Element primerElemento = (Element) nodoResponsable;
					listaDeNodos = primerElemento.getElementsByTagName("documentname");

					elementos = (Element) listaDeNodos.item(0);
					if (elementos != null) {
						listaDeNodos = elementos.getChildNodes();
						titulo = ((Node) listaDeNodos.item(0)).getNodeValue().toString();
						System.out.println(titulo);
					}
					
					listaDeNodos = primerElemento.getElementsByTagName("turismdescription");
					elementos = (Element) listaDeNodos.item(1);
					if (elementos != null) {
						listaDeNodos = elementos.getChildNodes();
						descripcion = ((Node) listaDeNodos.item(0)).getNodeValue().toString();
						System.out.println(descripcion);
					}
					
					listaDeNodos = primerElemento.getElementsByTagName("phone");
					elementos = (Element) listaDeNodos.item(0);
					if (elementos != null) {
						listaDeNodos = elementos.getChildNodes();
						telefono = ((Node) listaDeNodos.item(0)).getNodeValue().toString();
						System.out.println(telefono);
					}

					listaDeNodos = primerElemento.getElementsByTagName("address");
					elementos = (Element) listaDeNodos.item(0);
					if (elementos != null) {
						listaDeNodos = elementos.getChildNodes();
						direccion = ((Node) listaDeNodos.item(0)).getNodeValue().toString();
						System.out.println(direccion);
					}

					listaDeNodos = primerElemento.getElementsByTagName("marks");
					elementos = (Element) listaDeNodos.item(0);
					if (elementos != null) {
						listaDeNodos = elementos.getChildNodes();
						marks = ((Node) listaDeNodos.item(0)).getNodeValue().toString();
						System.out.println(marks);
					}

					listaDeNodos = primerElemento.getElementsByTagName("physical");
					elementos = (Element) listaDeNodos.item(0);
					if (elementos != null) {
						listaDeNodos = elementos.getChildNodes();
						disf_fis = ((Node) listaDeNodos.item(0)).getNodeValue().toString();
						System.out.println(disf_fis);
					}

					listaDeNodos = primerElemento.getElementsByTagName("visual");
					elementos = (Element) listaDeNodos.item(0);
					if (elementos.getFirstChild() != null) {
						listaDeNodos = elementos.getChildNodes();
						disf_vis = ((Node) listaDeNodos.item(0)).getNodeValue().toString();
						System.out.println(disf_vis);
					}

					listaDeNodos = primerElemento.getElementsByTagName("auditive");
					elementos = (Element) listaDeNodos.item(0);
					if (elementos != null) {
						listaDeNodos = elementos.getChildNodes();
						disf_audi = ((Node) listaDeNodos.item(0)).getNodeValue().toString();
						System.out.println(disf_audi);
					}

					listaDeNodos = primerElemento.getElementsByTagName("organic");
					elementos = (Element) listaDeNodos.item(0);
					if (elementos != null) {
						listaDeNodos = elementos.getChildNodes();
						disf_orga = ((Node) listaDeNodos.item(0)).getNodeValue().toString();
						System.out.println(disf_orga);
					}
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}
}