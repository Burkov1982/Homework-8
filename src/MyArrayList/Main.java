package MyArrayList;

public class Main {
    public static void main(String[] args) {
        MyArrayList<String> strings = new MyArrayList<String>();
        strings.add("first");
        strings.add("second");
        strings.add("third");
        System.out.println("Get element with index 1 - " + strings.get(1));
        System.out.println("Size of MyArrayList - " + strings.size());
        strings.remove(0);
        System.out.println("Size of MyArrayList after removing an element - " + strings.size());
        strings.clear();
        System.out.println("Size after clearing MyArrayList - " + strings.size());
    }
}
