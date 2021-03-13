package MyHashMap;

public class MyHashMap<K, V> {
    private Node<K, V> first;
    private Node<K, V> last;
    private int size = 0;
    public MyHashMap(){
        first = new Node<K, V>(null, null, last);
        last = new Node<K, V>(null, null, null);

    }

    public int size(){
        return size;
    }

    public void clear(){
        first = new Node<K, V>(null, null, last);
        size = 0;
    }

    public void put(K key, V value){
        Node<K, V> temp = first;
        if (size==0){
            Node<K, V> putNode = new Node<K, V>(key, value, last);
            first.setNext(putNode);
            size++;
        }
        else{
            boolean validation = false;
            for (int i = 0; i < size; i++) {
                if (temp.getKey() != key){
                    temp = temp.getNext();
                    validation = true;
                }
                else{
                    validation = false;
                    break;
                }
            }
            if (validation == true) {
                Node<K, V> putNode = new Node<K, V>(key, value, last);
                temp.setNext(putNode);
                size++;
            }
        }
    }

    public V get(K key){
        Node<K, V> temp = first.getNext();
        V result = first.getValue();
        for (int i = 1; i < size; i++) {
            if (temp.getKey() == key){
                result = temp.getValue();
            }
            else {
                temp = temp.getNext();
            }
        }

        return result;
    }

    public void remove(K key){
        Node<K, V> temp = first;
        Node<K, V> tempNode = null;
        Node<K, V> tempNode1 = first;
        int index = 0;
        for (int i = 0; i < size(); i++) {
            temp = temp.getNext();
            if (temp.getKey().equals(key)){
                index = i;
                tempNode = temp;
            }
        }
        for (int j = 0; j < index; j++) {
            tempNode1 = tempNode1.getNext();
        }
        tempNode1.setNext(tempNode.getNext());
        size--;
    }

}
