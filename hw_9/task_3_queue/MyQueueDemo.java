package go_it_hw.hw_9.task_3_queue;

/**
 * @author Nazarii Soviak
 */

public class MyQueueDemo {
    public static void main(String[] args) {
        MyQueue<String> myQueue = new MyQueue<>();
        System.out.println(myQueue.size());

        for (int i = 0; i <= 10; i++) {
            myQueue.add("Element " + i);
        }

        System.out.println("My Queue = " + myQueue);
        System.out.println("My Queue size = " + myQueue.size());

    }
}
