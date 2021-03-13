package MyLinkedList;

class Node<T> {

    private T elem;
    private Node<T> nextElem;
    private Node<T> prevElem;

    public Node(T current, Node<T> prev, Node<T> next) {
        elem = current;
        prevElem = prev;
        nextElem = next;
    }

    public T getElem() {
        return this.elem;
    }

    public void setElem(T elem) {
        this.elem = elem;
    }

    public Node<T> getNextElem() {
        return this.nextElem;
    }

    public void setNextElem(Node<T> nextElem) {
        this.nextElem = nextElem;
    }

    public Node<T> getPrevElem() {
        return this.prevElem;
    }

    public void setPrevElem(Node<T> prevElem) {
        this.prevElem = prevElem;
    }
}
