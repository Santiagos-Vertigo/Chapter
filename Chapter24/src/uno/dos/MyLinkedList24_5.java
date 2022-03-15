package uno.dos;

import java.util.Iterator;

public class MyLinkedList24_5<E> implements MyList24_1<E> {
    private Node<E> head, tail;
    private int size = 0; // Number of elements on the list

    /** Create an empty list */
    public MyLinkedList24_5(){
    }

    /** Create a list from an array of objects */
    public MyLinkedList24_5(E[] objects){
        for (int i = 0; i < objects.length; i++)
            add(objects[i]);
    }

    /** Return the head element in the list */
    public E getFirst() {
        if (size == 0 ){
            return null;
        }
        else{
            return head.element;
        }
    }

    /** Return the last element in the list */
    public E getLast() {
        if(size  == 0){
            return null;
        }
        else{
            return tail.element;
        }
    }
    /** Add an element to the beginning of the last */
    public void addFirst(E e){
        // Implemented  in Section 24.4.3.1, so omitted here
    }

    /** Add an element to the end of the list */
    public void addLast(E e){
        // Implemented in Section 24.4.3.2, so omitted here
    }
    /** Add an element at the specified index
     * in this list. The index of the head element is 0 */
    public void add(int index, E e){
        // Implemented in Section 24.4.3.3, so omitted here
    }

    @Override
    public E get(int index) {
        return null;
    }

    @Override
    public int indexOf(Object e) {
        return 0;
    }

    @Override
    public int lastIndexOf(E e) {
        return 0;
    }

    @Override
    public E remove(int index) {
        return null;
    }

    @Override
    public E set(int index, E e) {
        return null;
    }

    /** Remove the head of node and
     * return the object that is contained in the removed node*/
    public E removeFirst() {
        // Implemented in Section 24.4.3.4, so omitted here
    }

    /** Remove the last node and
     * return the object that is contained in the removed */
    public E removedLast(){
        // Implemented in Section 24.4.3.5, so omitted here

    }

    @Override /** Remove the element at the specified position in this
     * list. Return the element that was removed */

}
