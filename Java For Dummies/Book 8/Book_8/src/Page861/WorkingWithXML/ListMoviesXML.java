/*

 */
package Page861.WorkingWithXML;

import java.io.IOException;
import javax.xml.parsers.*;
import org.xml.sax.*;
import org.w3c.dom.*;
import java.text.*;

public class ListMoviesXML {

    private static NumberFormat cf = NumberFormat.getCurrencyInstance();

    public static void main(String[] args) {
        Document doc = getDocument("C:\\Users\\byron\\Desktop\\Java\\Java\\Java For Dummies\\Book 8\\Book_8\\src\\Page861\\WorkingWithXML\\movies.xml");               //reads movies.xml, creates Dom, assigns to doc.
        Element root = doc.getDocumentElement();
        Element movieElement = (Element) root.getFirstChild();
        Movie m;
        while (movieElement != null) {
            m = getMovie(movieElement);
            String msg = Integer.toString(m.year);
            msg += ": " + m.title;
            msg += " (" + cf.format(m.price) + ")";
            System.out.println(msg);
            movieElement = (Element) movieElement.getNextSibling();
        }
    }

    private static Document getDocument(String name) {
        try {

//DocumentBuilderFactory is an abstract class, so has no constructor. Therefore you call its
// newInstance() method to create an object. 
//The DocumentBuilderFactory is used to create a DocumentBuilder object which is used to read
// XML input and create DOM documents in memory.
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
//Once you have the DocumentBuilderFactory, you can configure it to read the document.
            factory.setIgnoringComments(true);                  //do not make nodes of 'comments'.
            factory.setIgnoringElementContentWhitespace(true);  //ignore white spaces that aren't part of a string.
            factory.setValidating(false);                        //use the DTD to validate the document.
//create a document builder by calling the .newDocumentBuilder() method.            
            DocumentBuilder builder = factory.newDocumentBuilder();
//create the DOM by calling the DocumentBuilder's parse() method. It takes an inputSource as an argument,
// which takes a filename as an argument.  You can create the input source in the parse method:
            return builder.parse(new InputSource(name));    //name = movies.xml
        } catch (IOException | ParserConfigurationException | SAXException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    private static Movie getMovie(Element e) {
// get the year attribute
        String yearString = e.getAttribute("year");
        int year = Integer.parseInt(yearString);
// get the Title element
        Element tElement = (Element) e.getFirstChild();
        String title = getTextValue(tElement).trim();
// get the Price element
        Element pElement = (Element) tElement.getNextSibling();
        String pString = getTextValue(pElement).trim();
        double price = Double.parseDouble(pString);
        return new Movie(title, year, price);
    }

    private static String getTextValue(Node n) {
        return n.getFirstChild().getNodeValue();
    }

    private static class Movie {

        public String title;
        public int year;
        public double price;

        public Movie(String title, int year, double price) {
            this.title = title;
            this.year = year;
            this.price = price;
        }
    }
}
