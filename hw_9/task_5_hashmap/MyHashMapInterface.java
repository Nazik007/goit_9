package go_it_hw.hw_9.task_5_hashmap;

/**
 * @author Nazarii Soviak
 */
public interface MyHashMapInterface<K, V> {

    void put(K key, V value);

    void remove(K key);

    void clear();

    int size();

    V get(K key);
}
