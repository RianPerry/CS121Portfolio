import java.io.File;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class StudentDemoXML {
    public static void main(String[] args) {
        try {
            File input = new File("students.xml");

            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();

            Document doc = builder.parse(input);

            System.out.println("Root element: " + doc.getDocumentElement().getNodeName());

            NodeList studentList = doc.getElementsByTagName("student");
            for (int i = 0; i < studentList.getLength(); i++) {
                Node node = studentList.item(i);
                if (node.getNodeType() == Node.ELEMENT_NODE) {
                    Element element = (Element) node;
                    System.out.println("ID: " + element.getAttribute("id"));
                    System.out.println("First Name: " + element.getElementsByTagName("firstName")
                            .item(0).getTextContent());
                    System.out.println("Last Name: " + element.getElementsByTagName("lastName")
                            .item(0).getTextContent());
                    System.out.println("Year: " + element.getElementsByTagName("year")
                            .item(0).getTextContent());
                    System.out.println();
                }
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
