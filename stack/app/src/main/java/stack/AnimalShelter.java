package stack;

public class AnimalShelter {
    public Queue<Cat> catQ;
    public Queue<Dog> dogQ;

    public AnimalShelter() {
        this.catQ = new Queue<>();
        this.dogQ = new Queue<>();
    }

    public void enqueue(Animal animal) {

        if (animal instanceof Cat) {
            catQ.enqueue((Cat) animal);
        } else if (animal instanceof Dog) {
            dogQ.enqueue((Dog) animal);
        } else {
            System.out.println("Cats OR Dogs Only :)");
        }
    }

    public Animal dequeue(String pref) {
        if (pref.equals("Cat") && !catQ.isEmpty()) {
            return catQ.dequeue();
        } else if (pref.equals("Dog") && !dogQ.isEmpty()) {
            return dogQ.dequeue();
        } else {
            return null;
        }
    }

    @Override
    public String toString() {
        return "AnimalShelter{" +
                "catQ=" + catQ +
                ", dogQ=" + dogQ +
                '}';
    }
}