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

    public void remove(String key) {
        MyMapNode current = this.head;
        MyMapNode previous = null;

        while (current != null) {
            if (current.key.equals(key)) {
                if (previous == null) {
                    this.head = current.next;
                } else {
                    previous.next = current.next;
                }
                current.next = null;
                return;
            }
            previous = current;
            current = current.next;
        }
    }
}