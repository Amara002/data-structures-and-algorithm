package stack;

public class Node<T> {
    public Node next;
    private T data;

    public Node(T data){
        this.data = data;
    }

    public T getData() {
        return (T) data;
    }
}
