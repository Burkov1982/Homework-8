package MyQueue;

public class Main {
    public static void main(String[] args) {
        MyQueue<String> myQueue = new MyQueue<String>();
        myQueue.add("first");
        myQueue.add("second");
        myQueue.add("third");
        System.out.println("Size of MyQueue - " + myQueue.size());
        System.out.println("Peek - " + myQueue.peek());
        System.out.println("Poll - " + myQueue.poll());
        System.out.println("Size of MyQueue after polling - " + myQueue.size());
        myQueue.remove(1);
        System.out.println("Size of MyQueue after removing - " + myQueue.size());
        myQueue.clear();
        System.out.println("Size of MyQueue after clearing - " + myQueue.size());
    }
}