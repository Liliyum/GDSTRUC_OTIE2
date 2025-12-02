//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Tree tree = new Tree();

        tree.insert(25);
        tree.insert(17);
        tree.insert(29);
        tree.insert(10);
        tree.insert(16);
        tree.insert(-5);
        tree.insert(60);
        tree.insert(55);

        //tree.traverseInOrder();
        //System.out.println(tree.get(25));
        System.out.println("Min: " + tree.getMin());
        System.out.println("Max: " + tree.getMax());

        System.out.println("\nDescending order:");
        tree.traverseInOrderDescending();
    }
}