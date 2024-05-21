
package Animal;

public class Cat extends Animal {
    void run() {
        System.out.println("Meo chay nhanh");
    }

    void eat() {
        System.out.println("meo an it");
    }

    public static void main(String[] args) {
        Animal animal = new Cat();
        animal.run();
        animal.eat();
    }
}
