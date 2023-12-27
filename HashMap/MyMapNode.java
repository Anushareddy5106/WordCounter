package HashMap;

public class MyMapNode {
    public String key;
    public int value;
    public MyMapNode next;

    MyMapNode(String key) {
        this.key = key;
        this.value = 1;
        this.next = null;
    }
}