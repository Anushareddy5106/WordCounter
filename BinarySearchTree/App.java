package BinarySearchTree;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Binary Search Tree!");

        // UC1
        BinarySearchTree<Integer> bst = new BinarySearchTree<>();

        bst.add(5);
        bst.add(7);
        bst.add(4);

        bst.inOrderTraversal(bst.root);
        System.out.println("");

        // UC2
        System.out.println("Num of nodes: " + bst.size());

        // UC3
        bst.add(20);
        bst.add(70);
        bst.add(65);

        bst.inOrderTraversal(bst.root);
        System.out.println("");

        System.out.println("Searching for 20: " + bst.search(20));
        System.out.println("Searching for 30: " + bst.search(30));
    }

}
