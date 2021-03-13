package MyHashMap;

class Node<K, V> {
    private Node<K, V> next;
    private V value;
    private K key;

    public Node(K key, V value, Node<K, V> next) {
        this.value = value;
        this.key = key;
        this.next = next;
    }

    public Node<K, V> getNext() {
        return next;
    }

    public void setNext(Node<K, V> next) {
        this.next = next;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }
}
