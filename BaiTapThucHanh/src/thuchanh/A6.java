package thuchanh;

/**
 * printable
 */
public interface printable {

    void print();
}

/**
 * A6 implements printable
 * 
 * public void print
 */
public class A6 implements printable {
    public void print() {
        System.out.println("Hi");
    }

    public static void main(String[] args) {
        A6 obj = new A6();
        obj.print();
    }

}