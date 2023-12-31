package HashMap;

public class HashMap {

    private static final int CAPACITY = 20;
    private LinkedList[] buckets;

    public HashMap() {
        this.buckets = new LinkedList[CAPACITY];

        for (int i = 0; i < CAPACITY; i++) {
            this.buckets[i] = new LinkedList();
        }
    }

    public HashMap(String sentence) {
        this();

        String[] words = sentence.split(" ");

        for (int i = 0; i < words.length; i++) {
            this.add(words[i]);
        }
    }

    public void add(String data) {
        data = data.toLowerCase();

        int index = generateHashCode(data);
        addInList(buckets[index], data);

    }

    public int get(String key) {
        key = key.toLowerCase();

        int index = generateHashCode(key);
        return getFromList(buckets[index], key);
    }

    public void remove(String key) {
        key = key.toLowerCase();

        int index = generateHashCode(key);
        buckets[index].remove(key);
    }

    private int generateHashCode(String data) {
        return Math.abs(data.hashCode()) % CAPACITY;
    }

    private void addInList(LinkedList list, String data) {
        MyMapNode current = list.head;
        while (current != null) {
            if (current.key.equals(data)) {
                current.value++;
                return;
            }
            current = current.next;
        }

        list.add(data);
    }

    public int getFromList(LinkedList list, String data) {
        MyMapNode current = list.head;
        while (current != null) {
            if (current.key.equals(data)) {
                return current.value;
            }
            current = current.next;
        }
        return 0;
    }

}