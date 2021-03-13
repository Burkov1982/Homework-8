package MyStack;

public class MyStack<E> {
    private Node<E> first;
    private Node<E> last;
    private int size;

    public MyStack() {
        first = new Node<E> (null, null, last);
        last = new Node<E>(null, first, null);
        size = 0;
    }

    public  void remove(int index){
        Node<E> temp = first;
        for (int i = 0; i < index; i++) {
            temp = temp.getNextElem();
        }
        temp.getNextElem().setPrevElem(temp.getPrevElem());
        temp.getPrevElem().setNextElem(temp.getNextElem());
        size--;
    }

    public void push(E value){
        Node<E> newFirst = new Node<E>(value, first, first.getNextElem());
        first = new Node<E>(null, null, newFirst);
        Node<E> temp = last;
        for (int i = size; i > 0; i--) {
            temp = temp.getPrevElem();
        }
        temp.setPrevElem(newFirst);
        size++;
    }

    public void clear(){
        first = new Node<E>(null, null,last);
        last = new Node<E>(null, first, null);
        size=0;
    }

    public int size(){
        return size;
    }

    public E peek(){
        return first.getNextElem().getElem();
    }

    public E pop(){
        Node<E> target = first.getNextElem();
        first.setNextElem(target.getNextElem());
        size--;
        return target.getElem();
    }

}

