package BinarySearchTree;

public class BinarySearchTree<T extends Comparable<T>> {
    BinaryNode<T> root;

    public BinarySearchTree() {
        this.root = null;
    }

    public BinarySearchTree(T root) {
        this.root = new BinaryNode<>(root);
    }

    public void add(T node) {
        if (this.root == null) {
            this.root = new BinaryNode<>(node);
        } else {
            addNode(root, node);
        }
    }

    private BinaryNode<T> addNode(BinaryNode<T> root, T node) {
        if (root == null) {
            return new BinaryNode<T>(node);
        }

        int compareResult = root.compareTo(node);
        if (compareResult > 0) {
            root.left = addNode(root.left, node);
        } else {
            root.right = addNode(root.right, node);
        }

        return root;
    }

    public void inOrderTraversal(BinaryNode<T> node) {
        if (node != null) {
            inOrderTraversal(node.left);
            System.out.print(node.getKey() + " ");
            inOrderTraversal(node.right);
        }
    }

}
