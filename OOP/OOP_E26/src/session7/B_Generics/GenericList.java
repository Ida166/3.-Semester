package session7.B_Generics;

/**
 * A list of up to 100 elements, kept in an array of Object. GenericList.add
 * puts an element after the last one, and GenericList.get gives back the
 * element at a position, counting from 0.
 *
 * It is StackWithoutGenerics again, with add and get instead of push and pop.
 * It holds Objects, so it takes an object of any class, and get gives back an
 * Object. The name says what it becomes in exercise B.
 */
public class GenericList<T> {
    private T[] array;
    private int count = 0;

    public GenericList() {
        array = (T[]) new Object[100];
    }

    public void add(T o) {
        array[count++] = o;
    }

    public T get(int i) {
        return array[i];
    }
}
