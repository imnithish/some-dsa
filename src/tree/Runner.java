package tree;

public class Runner {
    public static void main(String[] args) {
        Node n = new Node(1);
        n.insert(4);
        n.insert(3);
        n.insert(5);
        n.insert(8);

        n.printInOrder();
    }
}
