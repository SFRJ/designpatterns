package replace_implicit_tree_with_composite.bad;

/*
* Replace Implicit Tree with Composite
*
* You implicitly form a tree structure, using a primitive representation, such as a String
* Replace your primitive tree representation with Composite
*
* Communication:
* The best tree-construction code communicates the structure of a
* tree without overwhelming readers with unnecessary tree-construction details. Primitive
* tree-construction code exposes too many details.
* Trees composed using Composite communicate better by hiding tedious and repetitive tree-
* construction tasks.
*
* Duplication:
* Code that manually builds a tree often repeats the same set of steps:
* format a node, add the node to the tree and balance the node with a corresponding node
* or some such thing. Composite-constructed trees minimize duplication by encapsulating
* repetitive instructions, like formatting nodes and tree-construction mechanics.
*
*
* It’s easier to make mistakes building trees manually than it is to build trees using Composite.
* Manually-constructed trees must ensure that child nodes are added correctly – for example, a
* tag in an XML tree must have a corresponding end tag.
* By knowing how to construct themselves, Composite-constructed trees are simpler.
*/


public class XMLTree {
    private String orders;


    public XMLTree() {
        orders  = "<orders>";
        orders += "<order number='123'>";
        orders += "<item number='x1786'>";
        orders += "carDoor";
        orders += "</item>";
        orders += "</order>";
        orders += "</orders>";
    }
}
