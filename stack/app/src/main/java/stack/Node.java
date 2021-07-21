package stack;

public class Node {
    public Node next;
    private int data;

    public Node(int data){
        this.data = data;
    }

    public int getData() {
        return data;
    }
}
