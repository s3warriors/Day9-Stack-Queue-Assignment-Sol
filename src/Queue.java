import java.util.LinkedList;

class Queue<T> {
    private LinkedList<T> list = new LinkedList<>();

    // UC3: Enqueue elements to queue
    public void enqueue(T data) {
        list.addLast(data);
    }



    public void printQueue() {
        System.out.println(list);
    }
}
