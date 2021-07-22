package stack;

public class Animal {
    private String animal;

    public Animal(String animal) {
        this.animal = animal;
    }

    public String getAnimalType() {
        return animal;
    }

    @Override
    public String toString() {
        return animal;
    }
}
