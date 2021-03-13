package MyQueue;

public class MyQueue<E> {
    private int size;
    private Node<E> first;
    private Node<E> last;

    public MyQueue() {
        size = 0;
        first = new Node<E>(null, null);
        last = new Node<E>(null, null);
    }

    public int size(){
        return size;
    }

    public void clear(){
        first = new Node<E>(null, null);
        size = 0;
    }

    public E peek(){
        return first.getNextElem().getElem();
    }

    public E poll(){
        Node<E> temp = first.getNextElem();
        first.setNextElem(temp.getNextElem());
        size--;
        return temp.getElem();
    }

    public void remove(int index){
        Node<E> target = first.getNextElem();
        Node<E> newNode = first;
        for (int i = 0; i < index; i++) {
            target = target.getNextElem();
        }
        int count = index-1;
        for (int i = 0; i < count; i++) {
            newNode = newNode.getNextElem();
        }
        newNode.setNextElem(target.getNextElem());
        size--;
    }

    public void add(E value){
        Node<E> nextElement = first;
        for (int i = 0; i < size; i++) {
            nextElement = nextElement.getNextElem();
        }
        Node<E> newLastNode = new Node<E>(value, last);
        nextElement.setNextElem(newLastNode);
        size++;
    }

}
