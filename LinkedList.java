public class LinkedList {
    public MyMapNode head;

    LinkedList() {
        this.head = null;
    }

    public void add(String data) {
        MyMapNode nodeToBeAdded = new MyMapNode(data);

        if (this.head == null) {
            this.head = nodeToBeAdded;
        } else {
            MyMapNode current = this.head;
            while (current.next != null) {
                current = current.next;
            }

            current.next = nodeToBeAdded;
        }
    }

}