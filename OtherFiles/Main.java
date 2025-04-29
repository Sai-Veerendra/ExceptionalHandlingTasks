class Animal {
    public void makeSound() {
        System.out.println("Animals can Bark");
    }
}

class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Cat is barking");
    }
}

public class Main {
    public static void main(String[] args) {
        Cat obj = new Cat();
        obj.makeSound();
    }
}