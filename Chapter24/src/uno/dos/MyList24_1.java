package uno.dos;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.List;

public interface MyList24_1<E> extends Collection<E>{
    /** Add a new element at the specified index in this list */
     void add(int index, E e);

    /** Return the element from this list at the specified index */
     E get(int index);

    /** Return the index of the first matching element in this list.
     * Return -1 if no match. */
     int indexOf(Object e);

    /** Return the index of the last matching element of thios list.
     * Return -1 if no match */
    int lastIndexOf(E e);

    /**
     * Remove the element at the specified position in this list
     * Shift any subsequent elements to the left.
     * Return the element that was removed from the list.
     */
    default E remove(int index) {
        return null;
    }

    /** Replace the element at the specified position in this list
     * with the specified element and return the new set. */
    public E set(int index, E e);

    @Override /** Add new element at the end of the list */
    default boolean add(E e){
        add(size(), e);
        return true;
    }
    @Override/** Remove the first occurrence of the element e
     * from this list. Shift any subsequent elemnt to the left.
     * Return true if the element is removed. */
    default boolean remove(Object e){
        if (indexOf(e) >= 0){
            remove(indexOf(e));
            return true;
        }
        else
            return false;
    }

    @Override
     default boolean containsAll(Collection<?> c){
        //Left as an Exercise
        return true;
    }
    @Override
     default boolean addAll(Collection<? extends E> c) {
        //Left as an Exercise
        return true;
    }
    @Override
     default boolean removeAll(Collection<?> c) {
        //Left as an Exercise
        return true;
    }
    @Override
     default boolean retainAll(Collection<?> c) {
        //Left as an Exercise
        return true;
    }
    @Override
     default Object[] toArray() {
        //Left as an Exercise
        return null;
    }
    @Override
     default <T> T[] toArray(T[] array) {
        //Left as an Exercise
        return null;
    }

}
