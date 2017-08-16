

import org.w3c.dom.Document;
import org.w3c.dom.Element;

import java.io.IOException;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Result;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

/**
 * Created by alisewiseman on 5/9/17.
 */
public class XMLWriter extends MyFileWriter {
  private MyFileWriter writer = new MyFileWriter("XML.xml");
  private DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
  private DocumentBuilder documentBuilder;
  private Document doc;
  private Element rootElement;
  private Document doc1;
  private Element rootElement1;
  private Document doc2;
  private Element rootElement2;
  private Result result;
  private Source source;
  private Transformer transformer;

  public XMLWriter(String fileName) {
    super(fileName);
    try {
      documentBuilder = documentBuilderFactory.newDocumentBuilder();

      doc = documentBuilder.newDocument();
      rootElement = doc.createElement("line");
      doc.appendChild(rootElement);

      doc1 = documentBuilder.newDocument();
      rootElement1 = doc1.createElement("line");
      doc1.appendChild(rootElement1);

      doc2 = documentBuilder.newDocument();
      rootElement2 = doc2.createElement("line");
      doc2.appendChild(rootElement2);

      transformer = TransformerFactory.newInstance().newTransformer();
    }
    catch (TransformerConfigurationException e) {
      e.printStackTrace();
    }
    catch (ParserConfigurationException e) {
      e.printStackTrace();
    }
  }

  public void compositionWriteLine(String line) {
    try {
      rootElement.appendChild(doc.createTextNode(line));
      result = new StreamResult(writer.getFile());
      source = new DOMSource(doc);
      transformer.transform(source, result);
    }
    catch (TransformerException e) {
      e.printStackTrace();
    }
  }

  public void inheritanceWriteLine(String line) {
    try {
      rootElement1.appendChild(doc1.createTextNode(line));
      result = new StreamResult(getFile());
      source = new DOMSource(doc1);
      transformer.transform(source, result);
    }
    catch (TransformerException e) {
      e.printStackTrace();
    }
  }

  public void staticWriteLine(String line) {
    try {
      rootElement2.appendChild(doc2.createTextNode(line));
      MyFileWriter.staticOpenFile("XML2.xml");
      result = new StreamResult(MyFileWriter.getStaticFile());
      source = new DOMSource(doc2);
      transformer.transform(source, result);
    }
    catch (TransformerException e) {
      e.printStackTrace();
    }
  }
}
