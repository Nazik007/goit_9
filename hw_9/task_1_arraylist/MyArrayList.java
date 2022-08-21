package go_it_hw.hw_9.task_1_arraylist;

import java.util.Arrays;

/**
 * @author Nazarii Soviak
 */

public class MyArrayList <E> {
    private E [] elements;
    private int size = 0;
    private int index = 0;

    public MyArrayList () {
        elements = (E[]) new Object[10];
    }

    public void add (E element) {
        if (size == elements.length) {
            elements = Arrays.copyOf(elements, elements.length * 2);
        }
        elements[size++] = element;
    }

    public E remove(int index) {
        checkForIndexExistence(index);

        E removedValue = (E) elements[index];

        System.arraycopy(elements, index + 1, elements, index, elements.length - 1 - index);
        --this.index;

        return removedValue;
    }

    public void clear () {
        for (int i = 0; i < size; i++) {
            elements[i] = null;
        }
        size = 0;
    }

    public int size () {
        return size;
    }

    @SuppressWarnings("unchecked") // add this annotation to fix warning "Unchecked cast"
    public E get(int index) {
        checkForIndexExistence(index);

        return (E) elements[index];
    }

    private void checkForIndexExistence(int index) throws IndexOutOfBoundsException {
        if (elements[index] == null) {
            throw new IndexOutOfBoundsException(
                    "There is no value with index " + index + " in the arrayList"
            );
        }
    }

    @Override
    public String toString() {
       StringBuilder sb = new StringBuilder();
       if (elements == null) {
           return "[]";
       } else {
           for (int i = 0; i < size; i++) {
               sb.append(elements[i].toString());
               if (i != size - 1) {
                   sb.append(", ");
               }
           }
       }
       return "[" + sb.toString() + "]";
    }
}
