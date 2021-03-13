package MyStack;

class Node<E> {
    private E elem;
    private Node<E> nextElem;
    private Node<E> prevElem;

    public Node(E current, Node<E> prev, Node<E> next) {
        elem = current;
        prevElem = prev;
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

    public Node<E> getPrevElem() {
        return this.prevElem;
    }

    public void setPrevElem(Node<E> prevElem) {
        this.prevElem = prevElem;
    }
}
