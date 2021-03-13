package MyQueue;

class Node<E> {

    private E elem;
    private Node<E> nextElem;

    public Node(E current, Node<E> next) {
        elem = current;
        nextElem = next;
    }

    public E getElem() {
        return this.elem;
    }

    public void setElem(E elem) {
        this.elem = elem;
    }

    public Node<E> getNextElem() {
        return this.nextElem;
    }

    public void setNextElem(Node<E> nextElem) {
        this.nextElem = nextElem;
    }
}
