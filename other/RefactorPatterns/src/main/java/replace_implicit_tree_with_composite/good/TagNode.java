package replace_implicit_tree_with_composite.good;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TagNode {
    private String tagName;
    private List children = new ArrayList();
    private String tagValue = "";
    private String attributes = "";

    public TagNode(String name) {
        tagName = name;
    }

    public void add(TagNode childNode) {
        children.add(childNode);
    }

    public void addAttribute(String name, String value) {
        attributes += (" " + name + "='" + value + "'");
    }
    public void addValue(String value) {
        tagValue = value;
    }

    public String toString() {
        String result = new String();
        result += "<" + tagName + attributes + ">";
        Iterator it = children.iterator();
        while (it.hasNext()) {
            TagNode node = (TagNode)it.next();
            result += node.toString();
        }
        if (!tagValue.equals(""))
            result += tagValue;
        result += "</" + tagName + ">";
        return result;
    }
}
