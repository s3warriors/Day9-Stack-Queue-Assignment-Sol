import java.util.LinkedList;

class Stack<T> {
    private LinkedList<T> list = new LinkedList<>();

    // UC1: Push elements to stack
    public void push(T data) {
        list.addFirst(data);
    }

    public void printStack() {
        System.out.println(list);
    }
}
