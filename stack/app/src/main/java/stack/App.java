/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package stack;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }
    private static final AnimalShelter AnimalShelter = new AnimalShelter();
    public static void main(String[] args) {
        System.out.println(new App().getGreeting());
        Stack<Integer> stack = new Stack<>();

        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println(stack);

        stack.pop();
        System.out.println(stack);
        System.out.println(stack.isEmpty());
        System.out.println(stack.peek());


        Queue<Integer> queue = new Queue<>();

        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);

        System.out.println(queue);
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
//        queue.peek();

        System.out.println(queue);
        System.out.println(queue.isEmpty());
//        System.out.println(queue.peek());
//        queue.dequeue();


//        -------------------------
        PseudoQueue stack1 = new PseudoQueue();

        stack1.enqueue(20);
        stack1.enqueue(15);
        stack1.enqueue(10);

        System.out.println(stack1);


        stack1.enqueue(5);
        System.out.println(stack1);

        System.out.println(stack1.dequeue());
        System.out.println(stack1);

        System.out.println(stack1.dequeue());
        System.out.println(stack1);

        stack1.enqueue(7);
        System.out.println(stack1);
        //    -------------
        AnimalShelter.enqueue(new Cat("oneCat"));
        AnimalShelter.enqueue(new Cat("twoCat"));
        AnimalShelter.enqueue(new Cat("threeCat"));
        AnimalShelter.enqueue(new Dog("oneDog"));
        AnimalShelter.enqueue(new Dog("twoDog"));
        AnimalShelter.enqueue(new Dog("threeDog"));
        System.out.println(AnimalShelter);
        AnimalShelter.dequeue("Dog");
        System.out.println(AnimalShelter);
        AnimalShelter.dequeue("Cat");
        AnimalShelter.dequeue("Cat");
        System.out.println(AnimalShelter);
        AnimalShelter.enqueue(new Cat("oneCat"));
        System.out.println(AnimalShelter);
    }


    }


