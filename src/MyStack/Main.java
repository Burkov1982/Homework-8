package MyStack;

public class Main {
    public static void main(String[] args) {
        MyStack<String> myStack = new MyStack<String>();
        myStack.push("first");
        myStack.push("second");
        myStack.push("third");
        System.out.println("Size of MyStack - " + myStack.size());
        System.out.println("Pop - " + myStack.pop());
        System.out.println("Peek - " + myStack.peek());
        myStack.remove(1);
        System.out.println("Size of MyStack after removing - " + myStack.size());
        myStack.clear();
        System.out.println("Size of MyStack after clearing - " + myStack.size());
    }
}