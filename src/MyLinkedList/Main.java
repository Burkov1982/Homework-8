package MyLinkedList;


public class Main {
    public static void main(String[] args) {
        MyLinkedList<String> myLinkedList = new MyLinkedList<String>();
        myLinkedList.add("1");
        myLinkedList.add("2");
        myLinkedList.add("3");
        System.out.println("Size of MyLinkedList - " + myLinkedList.size());
        System.out.println("" + myLinkedList.get(2));
        myLinkedList.remove(1);
        System.out.println(myLinkedList.size());
        System.out.println(myLinkedList.get(1));
        myLinkedList.clear();
        System.out.println(myLinkedList.size());
    }

// Clear - done; get - done; add - done; size - done;

}

