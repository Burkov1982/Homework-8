package MyLinkedList;

public class MyLinkedList <T>{

    private Node <T> firstNode;
    private Node <T> lastNode;
    private int size = 0;

    public MyLinkedList(){
        firstNode = new Node<T> (null, null, lastNode);
        lastNode = new Node<T> (null, firstNode, null);
    }

    public void add (T element){
       Node<T> previous = lastNode;
       previous.setElem(element);
       lastNode = new Node<T>(null, previous, null);
       previous.setNextElem(lastNode);
       Node<T> nextElement = firstNode;

        for (int i = 0; i < size; i++) {
            nextElement = nextElement.getNextElem();
        }

        Node<T> newLastNode = new Node<T>(element, nextElement, lastNode);
        nextElement.setNextElem(newLastNode);
        size++;
    }

    public void clear(){
        firstNode = new Node<T> (null, null, lastNode);
        lastNode = new Node<T> (null, firstNode, null);
        size=0;
    }

    public void remove(int index){
        Node<T> target = firstNode;

        for (int i = 0; i <= index; i++) {
            target = target.getNextElem();
        }

        target.getPrevElem().setNextElem(target.getNextElem());
        target.getNextElem().setPrevElem(target.getPrevElem());
        size--;
    }

    public T get(int index){
        Node<T> target = firstNode.getNextElem();

        for (int i = 0; i < index; i++) {
            target = target.getNextElem();
        }

        return target.getElem();
    }

    public int size(){
        return size;
    }

}
