package stack;

public class PseudoQueue {
    public Stack<Integer> stack1;
    public Stack<Integer> stack2;

    public PseudoQueue() {
        this.stack1 = new Stack<>();
        this.stack2 = new Stack<>();

    }

    public void enqueue(int value){

        while (stack1.top!=null){
            stack2.push(stack1.pop());
        }
        stack1.push(value);
        while (stack2.top != null){
            stack1.push(stack2.pop());

        }
    }


    public int dequeue(){

        if (stack1.top == null){
            System.out.println("The Stack is empty and the zero value indicates not the actual value");
            return 0;
        }
        int popped = stack1.peek();
        stack1.pop();
        return popped;
    }

    @Override
    public String toString() {

        return stack1.toString();

    }
}