package tree;

public class Node<T> {
    public   int key;
    public  Node <T> left, right;

    public Node(int item)
    {
        key = item;
        left = right = null;
    }

    @Override
    public String toString() {
        return "Node{" +
                "key=" + key +
                ", left=" + left +
                ", right=" + right +
                '}';
    }
}
