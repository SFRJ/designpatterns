package replace_implicit_tree_with_composite.good;

public class DemoUsingTree {
    public static void main(String []args) {
        TagNode orders = new TagNode("orders");
        TagNode order = new TagNode("order");
        order.addAttribute("number", "123");
        orders.add(order);
        TagNode item = new TagNode("item");
        item.addAttribute("number", "x1786");
        item.addValue("carDoor");
        order.add(item);

        System.out.print(orders);
    }
}
