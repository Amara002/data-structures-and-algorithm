package linked.list;

public class LinkedList {
 Node head;

    public LinkedList(Node head) {
        this.head = head;
    }
    public void insert(Node newNode){
        newNode.next = head;
        head = newNode;
    }

    public void show(){
        Node firstNode = head;
        while(firstNode != null){
            System.out.println(firstNode.getData());
            firstNode = firstNode.next;
        }
    }
    public boolean include(Node head,int val){
    Node firstNode = head;
    while( firstNode != null){
        if(firstNode.getData() == val){
            return true;
        }
        firstNode = firstNode.next;
    }
    return false;
    }

    @Override
    public String toString() {
        String res = " ";
        Node newNod = head;
        while (newNod != null){
            res+="{";
            res += newNod.getData();
            res+="}";
            res+="->";
            newNod = newNod.next;
        }
        return "LinkedList" +
                "linkedList=" + res + "Null"
                ;
    }
}
