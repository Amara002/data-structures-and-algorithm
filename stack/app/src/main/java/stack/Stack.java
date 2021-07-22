package stack;

public class Stack <T>{
    Node<T> top;

        public void push(T value){
        Node<T> newNode = new Node(value);
        if (top == null){
            top = newNode;
        }else{
            Node temp = top;
            top = newNode;
            newNode.next = temp;
        }
//        System.out.println("The value " + value + " pushed to the Stack");
    }

    public T pop(){

        T popped=null;

        if(top == null){
            System.out.println("The Stack is empty and the zero value indicates not the actual value");
            return null;
        }else{
            popped = (T) top.getData();
            top = top.next;
        }
        return popped;
    }

    public T peek(){
        if(top == null){
            System.out.println("The Stack is empty and the zero value indicates not the actual value");
            return null;
        }else{
            return (T) top.getData();
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
