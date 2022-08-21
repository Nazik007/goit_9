package go_it_hw.hw_9.task_4_stack;

/**
 * @author Nazarii Soviak
 */

public class MyStackDemo {
    public static void main(String[] args) {
        MyStack<String> myStack = new MyStack<>();
        System.out.println(myStack);

        for (int i = 0; i <= 20; i++) {
            myStack.push("Value " + i);
        }

        System.out.println("myStack = " + myStack);
        System.out.println("myStack.size() = " + myStack.size());

        System.out.println("myStack.pop() = " + myStack.pop());
        System.out.println("myStack.size() = " + myStack.size());
        System.out.println("myStack.pop() = " + myStack.pop());
        System.out.println("myStack.size() = " + myStack.size());
        System.out.println("myStack.pop() = " + myStack.pop());
        System.out.println("myStack.size() = " + myStack.size());
        System.out.println("myStack.pop() = " + myStack.pop());
        System.out.println("myStack.size() = " + myStack.size());

        System.out.println("myStack.remove(0) = " + myStack.remove(0));
        System.out.println("myStack.size() = " + myStack.size());
        System.out.println("myStack.remove(5) = " + myStack.remove(5));
        System.out.println("myStack.size() = " + myStack.size());


        System.out.println("Clear");
        myStack.clear();
        System.out.println("myStack.size() = " + myStack.size());
    }
}
