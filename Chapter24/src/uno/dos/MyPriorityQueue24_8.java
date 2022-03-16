package uno.dos;

public class MyPriorityQueue24_8<E> {
    private Heap<E> heap = new Heap();

    public  MyPriorityQueue24_8()  {
        heap.add((E) new Heap());
    }

    public MyPriorityQueue24_8(Comparable<E> c) {
        heap = new Heap<E>(c);
    }
    public void enqueue(E newObject){
        heap.add(newObject);
    }
    public E dequeue(){
        return heap.remove();
    }
    public int getSize(){
        return heap.getSize();
    }
}
