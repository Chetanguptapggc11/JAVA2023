// Animal Interface
interface Animal {
    void bark();
}

// Dog Class implementing Animal Interface
class Dog implements Animal {
    
    public void bark() {
        System.out.println("Dog is barking");
    }
}

// Main Class
public class Main {
    public static void main(String[] args) {
        // Create an instance of Dog
        Dog dog = new Dog();
        
        // Call the bark method
        dog.bark();
    }
}

