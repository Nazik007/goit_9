package go_it_hw.hw_9.task_1_arraylist;

/**
 * @author Nazarii Soviak
 */

public class MyArrayListDemo {
    public static void main(String[] args) {
        MyArrayList <String> myArrayList = new MyArrayList<>();

        for (int i = 0; i <= 15; i++) {
            myArrayList.add("Element " + i);
        }

        System.out.println("My ArrayList = " + myArrayList);
        System.out.println("Getting element = " + myArrayList.get(4));
        System.out.println("My ArrayList size = " + myArrayList.size());
        myArrayList.clear();
        System.out.println(myArrayList);
    }
}
