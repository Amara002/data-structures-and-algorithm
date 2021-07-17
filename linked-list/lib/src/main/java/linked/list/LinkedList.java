package linked.list;

public class LinkedList<T> {
    public Node<T> head;
    public int length;

    public LinkedList() {
        this.head = null;
    }

    public void insert(T data) {
        Node<T> newNode = new Node<>(data);
        if (this.head == null) {
            head = newNode;
        } else {
            Node temp = head;
            head = newNode;
            head.next = temp;
        }
        length++;
    }

    public void insertAfter(T data, T newData) {
        Node<T> newNode = new Node<>(newData);
        if (this.head == null) {
            head = newNode;
        } else {
            Node<T> temp = head;
            while (temp.data != data) {
                temp = temp.next;
            }
            newNode.next = temp.next;
            temp.next = newNode;
        }
        length++;
    }

    public void insertBefore(T data, T newData) {
        Node<T> newNode = new Node<>(newData);
        if (this.head == null) {
            head = newNode;
        } else if (data == head.data) {
            newNode.next = head;
            head = newNode;
        } else {
            Node<T> temp = head;
            while (temp.next.data != data) {
                temp = temp.next;
            }
            newNode.next = temp.next;
            temp.next = newNode;
        }
        length++;
    }

    public void append(T data) {
        Node<T> newNode = new Node<>(data);
        if (this.head == null) {
            head = newNode;
        } else {
            Node<T> temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
        length++;
    }

    public boolean includes(T key) {
        Node<T> temp = head;
        while (temp != null) {
            if (temp.data.equals(key)) {
                return true;
            }
            temp = temp.next;
        }
        return false;
    }


    public T findKthNode(int k){
        int maxIdx = length - 1;
        int idxValue = maxIdx - k;

        Node<T> temp = head;
        int n = 0;


        if(k >= length || k < 0){
            return null;
        }
        else if(idxValue == n){
            return temp.data;
        }else {
            while (idxValue != n){
                temp = temp.next;
                n++;

            }
            return temp.data;

        }

    }

//    public LinkedList<T> zipList(LinkedList<T> one, LinkedList<T> two){
//
//    }
    @Override
    public String toString() {
        String result = "{ ";
        Node<T> temp = head;
        while (temp != null) {
            result += temp.data + " -> ";
            temp = temp.next;
        }
        if (temp == null) {
            result += temp + " }";
        }
        return result;
    }
}