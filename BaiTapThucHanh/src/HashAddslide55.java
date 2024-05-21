import java.util.HashSet;
import java.util.Scanner;

public class HashAddslide55 {

    public static void main(String[] args) {
        int number;
        HashSet<Integer> hashSetIntegers = new HashSet<>();
        Scanner sc = new Scanner(System.in);
        hashSetIntegers.add(0);
        hashSetIntegers.add(3);
        hashSetIntegers.add(5);
        hashSetIntegers.add(8);
        hashSetIntegers.add(2);
        hashSetIntegers.add(4);
        System.out.println("cac phan tu trong hashsetIntegers");
        System.out.println(hashSetIntegers);
        System.out.println("nhap phan tu can them");
        number = sc.nextInt();
        if (!hashSetIntegers.contains(number)) {
            hashSetIntegers.add(number);
            System.out.println("them thanh cong ");
            System.out.println("cac phan tu sau khi them");
            System.out.println(hashSetIntegers);
        } else {
            System.out.println("phan tu " + number + "da ton tai");
        }
    }
}