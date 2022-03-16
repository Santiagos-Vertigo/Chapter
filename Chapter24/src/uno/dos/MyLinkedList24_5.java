package uno.dos;


import org.w3c.dom.Node;

public class MyLinkedList24_5<E> implements MyList24_1<E> {
    private Node<E> head, tail;
    private int size = 0; // Number of elements on the list

    /**
     * Create an empty list
     */
    public MyLinkedList24_5() {
    }

    /**
     * Create a list from an array of objects
     */
    public MyLinkedList24_5(E[] objects) {
        for (int i = 0; i < objects.length; i++)
            add(objects[i]);
    }

    /**
     * Return the head element in the list
     */
    public E getFirst() {
        if (size == 0) {
            return null;
        } else {
            return head.element;
        }
    }

    /**
     * Return the last element in the list
     */
    public E getLast() {
        if (size == 0) {
            return null;
        } else {
            return tail.element;
        }
    }

    /**
     * Add an element to the beginning of the last
     */
    public void addFirst(E e) {
        Node<E> newNode = new Node<>(e); // Create a new Node
        newNode.next = head; // link the new node with the head
        head = newNode; // head points to the new node
        size++;

        if (tail == null) // the new node is the only node in the list
            tail = head;
    }

    /**
     * Add an element to the end of the list
     */
    public void addLast(E e) {
        Node<E> newNode = new Node<>(e); // Create a new node for e

        if (tail == null){
            head = tail = newNode; // the only node in the list
        }
        else {
            tail.next = newNode; // Link the new node with the last node
            tail = newNode; // tail now points to the last node
        }
        size++;
    }

    /**
     * Add an element at the specified index
     * in this list. The index of the head element is 0
     */
    public void add(int index, E e) {
        if (index == 0) addFirst(e); // Insert first
        else if (index >= size) addLast(e); // Insert last
        else { // Insert in the middle
            Node<E> current = head;
            for (int i = 1; i < index; i++)
                current = current.next;
            Node<E> temp = current.next;
            current.next = new Node<>(e);
            (current.next).next = temp;
            size++;
        }
    }

    /**
     * Remove the head of node and
     * return the object that is contained in the removed node
     */
    public E removeFirst() {
        // Implemented in Section 24.4.3.4, so omitted here
        if (size == 0) return null; // Nothing to delete
        else{
            Node<E> temp = head; // Keep the first node temporarily
            head = head.next; // Move head to point to next node
            size--; // Reduce size by 1
            if (head == null)  tail = null; // List becomes empty
            return temp.element; // Return the deleted element
        }
    }

    /**
     * Remove the last node and
     * return the object that is contained in the removed
     */
    public E removedLast() {
        // Implemented in Section 24.4.3.5, so omitted here
        if (size == 0 || size == 1){
            return removeFirst();
        }
        else {
            Node<E> current = head;
            for (int i = 0; i < size -2; i++){
                current = current.next;
            }

            E temp = tail.element;
            tail = current;
            tail.next = null;
            size--;
            return temp;
        }
    }

    @Override
    /** Remove the element at the specified position in this
     * list. Return the element that was removed from the list */
    public E remove(int index) {
        // Implemented earlier in Section 24.4.3.6
        if (index < 0 || index >= size) return null; // Out of range
        else if (index == 0) return removeFirst(); // Remove first
        else if (index == size -1) return removeFirst(); // Remove last
        else {
            Node<E> previous = head;

            for (int i = 1; i < index; i++) {
                previous = previous.next;
            }

            Node<E> current = previous.next;
            previous.next = current.next;
            size--;
            return current.element;
        }
    }

    @Override
    /** Override toString() to return elements in the last */
    public String toString() {
        StringBuilder result = new StringBuilder("[");

        Node<E> current = head;
        for (int i = 0; i < size; i++) {
            result.append(current.element);
            if (current != null) {
                result.append(", "); // Separate ltwo element with a coma
            } else {
                result.append("]"); // Insert the closing "]" in the string
            }
        }
        return result.toString();
    }

    @Override
/** Clear the list */
    public void clear() {
        size = 0;
        head = tail = null;
    }

    @Override
/** Return true if this contains the element e */
    public boolean contains(Object e) {
        // Left as an exercise
        return true;
    }

    @Override
    /** Return the element at the specified index */
    public E get(int index) {
        // Left as an exercise
        return null;
    }

    @Override
    /** Return the index of the first matching element in
     * this list. Return -1 if no match */
    public int indexOf(Object e) {
        // Left as an exercise
        return 0;
    }

    @Override
    /** Return the index of the last matching element in
     * this list. Return -1 if no match */
    public int lastIndexOf(E e) {
        // Left as an exercise
        return 0;
    }

    @Override
    /** Replace the element at the specified position
     * in this list with the specified element*/
    public E set(int index, E e) {
        // Left as an exercise
        return null;
    }

    @Override
    /** Override iterator() defined in Iterable */
    public java.util.Iterator<E> iterator() {
        return new LinkedListIterator();
    }

    private class LinkedListIterator implements java.util.Iterator<E> {
        private MyLinkedList24_5.Node<E> current = head; // Current index


        @Override
        public boolean hasNext() {
            return (current != null);
        }

        @Override
        public E next() {
            E e = current.element;
            current = current.next;
            return e;
        }

        @Override
        public void remove(){
            // Left as an exercise
        }
    }

    private static class Node<E> {
        E element;
        Node<E> next;

        public Node(E element) {
            this.element = element;
        }
    }

    @Override /** Return the number of elements in this list */
    public int size(){
        return size;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }
}
