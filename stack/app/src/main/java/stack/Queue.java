package stack;

public class Queue <T>{
    Node front;
    Node rear;

    public Queue(){
        this.front = this.rear = null;
    }

    public void enqueue(int value){
        Node newNode = new Node(value);

        if(this.rear == null){
            this.front = this.rear = newNode;
        }

        this.rear.next = newNode;
        this.rear = newNode;
    }

    public int dequeue() {

        if(this.front == null){
            System.out.println("The Queue is empty and the zero value indicates not the actual value");
            return 0;
        }else{
            Node temp = this.front;
            this.front = this.front.next;
            return temp.getData();
        }
    }

    public int peek(){
        if(front == null){
            System.out.println("The Queue is empty and the zero value indicates not the actual value");
            return 0;
        }else{
            return front.getData();
        }
    }

    public boolean isEmpty(){
        if(front == null){
            return true;
        }else{
            return false;
        }
    }

    @Override
    public String toString() {
        String queueValue = "Queue { ";
        Node trav = front;
        while (trav != null){
            queueValue += trav.getData() + " --> ";
            trav = trav.next;
        }
        queueValue += "Null }";
        return queueValue;
    }
}
