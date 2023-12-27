package BinarySearchTree;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Binary Search Tree!");

        BinarySearchTree<Integer> bst = new BinarySearchTree<>();

        bst.add(5);
        bst.add(7);
        bst.add(4);

        bst.inOrderTraversal(bst.root);
    }

}
