package go_it_hw.hw_9.task_3_queue;

/**
 * @author Nazarii Soviak
 */

public interface MyQueueInterface<T> {
    void add(T value);

    T remove(int index);

    void clear();

    int size();

    T peek();

    T poll();
}
