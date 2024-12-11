import java.util.LinkedList;

class Queue<T> {
    private LinkedList<T> list = new LinkedList<>();

    // UC3: Enqueue elements to queue
    public void enqueue(T data) {
        list.addLast(data);
    }

    // UC4: Dequeue elements from queue
    public T dequeue() {
        return list.isEmpty() ? null : list.removeFirst();
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public void printQueue() {
        System.out.println(list);
    }
}
