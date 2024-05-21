package Animal;

public class Dog implements Animal1 {
    public void run() {
        System.out.println("Cho chay nhanh");
    }

    public void eat() {
        System.out.println("Cho an nhieu");
    }

    public static void main(String[] args) {
        Dog cho = new Dog();
        cho.run();
        cho.eat();
    }
}