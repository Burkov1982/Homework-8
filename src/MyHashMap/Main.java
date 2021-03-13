package MyHashMap;

public class Main {
    public static void main(String[] args) {
        MyHashMap<Integer, String> myHashMap = new MyHashMap<Integer, String>();
        myHashMap.put(1, "first");
        myHashMap.put(2, "second");
        myHashMap.put(3, "third");
        System.out.println("Size of MyHashMap - " + myHashMap.size());
        System.out.println("Get element from MyHashMap by key - " + myHashMap.get(2));
        myHashMap.remove(2);
        System.out.println("Get element from MyHashMap after removing - " + myHashMap.get(2));
        System.out.println("Size of MyHashMap after removing - " + myHashMap.size());
        myHashMap.clear();
        System.out.println("Size of MyHashMap after clearing - " + myHashMap.size());
    }
}
