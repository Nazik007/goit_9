package go_it_hw.hw_9.task_2_linkedlist;

/**
 * @author Nazarii Soviak
 */

public interface MyLinkedListInterface<T> {
    void add(T value);

    T get(int index);

    T remove(int index);

    void clear();

    int size();
}
