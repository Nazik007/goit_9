package go_it_hw.hw_9.task_2_linkedlist;

/**
 * @author Nazarii Soviak
 */

public class MyLinkedListDemo {
    public static void main(String[] args) {
        MyLinkedList<String> myLinkedList = new MyLinkedList<>();
        System.out.println("My LinkedList size = " + myLinkedList.size());
        for (int i = 0; i < 20; i++) {
            myLinkedList.add("Element " + i);
        }

        System.out.println(myLinkedList);
        System.out.println(myLinkedList.size());
        System.out.println(myLinkedList.get(10));
        myLinkedList.clear();
        System.out.println(myLinkedList.size());
    }
}
