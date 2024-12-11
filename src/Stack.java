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


    // UC2: Peek top element
    public T peek() {
        return list.isEmpty() ? null : list.getFirst();
    }

    // UC2: Pop elements from stack
    public T pop() {
        return list.isEmpty() ? null : list.removeFirst();
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

}
