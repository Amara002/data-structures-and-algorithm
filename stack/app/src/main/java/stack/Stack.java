package stack;

public class Stack <T>{
    Node<T> top;

    public void push(int value){
        Node<T> newNode = new Node(value);
        if (top == null){
            top = newNode;
        }else{
            Node temp = top;
            top = newNode;
            newNode.next = temp;
        }
        System.out.println("The value " + value + " pushed to the Stack");
    }

    public <T> int pop(){

        int popped=0;

        if(top == null){
            System.out.println("The Stack is empty and the zero value indicates not the actual value");
            return 0;
        }else{
            popped = (int) top.getData();
            top = top.next;
        }
        return popped;
    }

    public int peek(){
        if(top == null){
            System.out.println("The Stack is empty and the zero value indicates not the actual value");
            return 0;
        }else{
            return (int) top.getData();
        }
    }

    public boolean isEmpty(){
        if(top == null){
            return true;
        }else{
            return false;
        }
    }


    @Override
    public String toString() {
        String stackValue = "Stack { ";
        Node trav = top;
        while (trav != null){
            stackValue += trav.getData() + " --> ";
            trav=trav.next;
        }
        stackValue += "Null }";
        return stackValue;
    }
}
