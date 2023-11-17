class Animal {
    public void makeSound() {
        // Code for making sound
    }
}

class Cat extends Animal {
    
    public void makeSound() {
        // Code for making cat sound (barking)
    }
}

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.makeSound(); // Output: Sound of the animal

        Cat cat = new Cat();
        cat.makeSound(); // Output: Sound of the cat (barking)
    }
}
