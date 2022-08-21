package go_it_hw.hw_9.task_5_hashmap;

/**
 * @author Nazarii Soviak
 */

public class MyHashMapDemo {
    public static void main(String[] args) {
        MyHashMap<String, String> myHashMap = new MyHashMap<>();
        System.out.println("myHashMap.size() = " + myHashMap.size());

        myHashMap.put(null, "Test");
        for (int i = 0; i < 20; i++) {
            myHashMap.put("Key " + i, "Value " + i);
        }
        myHashMap.put(null, "Test 222");
        System.out.println("myHashMap.size() = " + myHashMap.size());

        System.out.println("myHashMap.get(null) = " + myHashMap.get(null));
        System.out.println("myHashMap.get(\"Key 18\") = " + myHashMap.get("Key 18"));

        System.out.println("Clear the HashMap");
        myHashMap.clear();
        System.out.println("myHashMap.size() = " + myHashMap.size());

        System.out.println("- - - - - - - - - - - - - ");
        MyHashMap<Integer, Integer> myHashMap1 = new MyHashMap<>();
        myHashMap1.put(23,45);
        myHashMap1.put(500,450);
        System.out.println("HashMap with Integers = " + myHashMap1.size());

    }
}
