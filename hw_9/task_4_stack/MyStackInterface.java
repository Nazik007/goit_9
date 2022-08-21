package go_it_hw.hw_9.task_4_stack;

/**
 * @author Nazarii Soviak
 */
public interface MyStackInterface<T> {
    void push(T value);

    T remove(int index);

    void clear();

    int size();

    T peek();

    T pop();
}
