package thuchanh;

public abstract class Animal {
    abstract void run();

}

class Honda4 extends Animal {
    void run() {
        System.out.println("running safely..");
    }

    public static void main(String args[]) {
        Animal obj = new Honda4();
        obj.run();
    }

}
