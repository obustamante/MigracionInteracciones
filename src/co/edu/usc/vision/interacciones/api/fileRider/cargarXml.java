package co.edu.usc.vision.interacciones.api.fileRider;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.jdom2.Content;               // |
import org.jdom2.Document;              // |
import org.jdom2.Element;               // |\ Librerías
import org.jdom2.JDOMException;         // |/ JDOM
import org.jdom2.input.SAXBuilder;      // |
import org.jdom2.util.IteratorIterable; // |

/**
 * Created by vision on 1/09/17.
 */
public class cargarXml {
    private static String xmlSource = "/home/vision/Obustamante/drugbank/full database.xml";
    //private static String xmlSource = "http://feeds.bbci.co.uk/news/technology/rss.xml?edition=int";

    public static void main(String[] args) throws JDOMException, IOException {
        // the SAXBuilder is the easiest way to create the JDOM2 objects.
        SAXBuilder jdomBuilder = new SAXBuilder();

        // jdomDocument is the JDOM2 Object
        Document jdomDocument = jdomBuilder.build(xmlSource);

        // The root element is the root of the document. we print its name
        System.out.println(jdomDocument.getRootElement().getName()); // prints
        // "rss"

        Element rss = jdomDocument.getRootElement();

        // The Element class extends Content class which is NamespaceAware. We
        // see what namespace this element introduces.
        System.out.println(rss.getNamespacesIntroduced());
        /*
         * prints [[Namespace: prefix "atom" is mapped to URI
         * "http://www.w3.org/2005/Atom"], [Namespace: prefix "media" is mapped
         * to URI "http://search.yahoo.com/mrss/"]]
         */

        // the getContent method traverses through the document and gets all the
        // contents. We print the CType (an enumeration identifying the Content
        // Type), value and class of the Content. we print only the
        // first two values, since this is only an example.
        List<Content> rssContents = rss.getContent();
        for (int i = 0; i < 2; i++) {
            Content content = rssContents.get(i);
            System.out.println("CType " + content.getCType());
            System.out.println("Class " + content.getClass());
        }

        Element channel = rss.getChild("channel");

        // the getChildren method can be used to obtain the children of the
        // element
        List<Element> channelChildren = channel.getChildren();
        for (int i = 0; i < 2; i++) {
            Element channelChild = channelChildren.get(i);
            System.out.println(channelChild.getName());// prints 'title' and
            // 'link'
        }

        // to directly obtain the child node of type Text
        System.out.println(channel.getChildText("link")); // print the first
        // link

        // It is also possible to specify the namespace while obtaining the
        // child element. In the statement below we
        // obtain the child with name 'link' but we want that child to be from
        // the atom namespace. We further use the getAttributeValue method to
        // get the value of the attribute of the node
        System.out.println(channel.getChild("link", rss.getNamespace("atom")).getAttributeValue("href"));
        // prints http://feeds.bbci.co.uk/news/technology/rss.xml

        // Instead of getting all the children of a node we may want to get all
        // children with a particular name.
        List<Element> items = channel.getChildren("item");
        for (int i = 0; i < 2; i++) {
            System.out.println(items.get(i).getChildText("title")); // prints
            // the first
            // two
            // titles
        }

        // iterate through all the descendants and get the url of the thumbnails
        // (The thumbnails are declared with namespace media)
        IteratorIterable<Content> descendantsOfChannel = channel.getDescendants();
        for (Content descendant : descendantsOfChannel) {
            if (descendant.getCType().equals(Content.CType.Element)) {
                Element element = (Element) descendant;
                if (element.getNamespace().equals(rss.getNamespace("media"))) {
                    System.out.println(element.getAttributeValue("url")); //
                    // prints all urls of all thumbnails within the
                    // 'media' namespace
                }
            }
        }

    }
}
