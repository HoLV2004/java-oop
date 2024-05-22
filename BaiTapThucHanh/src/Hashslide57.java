import java.util.HashSet;
import java.util.Scanner;

public class Hashslide57 {
    public static void main(String[] args) {
        String name;
        HashSet<String> hashSetStrings = new HashSet<>();
        Scanner sc = new Scanner(System.in);
        hashSetStrings.add("messi");
        hashSetStrings.add("ronaldo");
        hashSetStrings.add("foden");
        hashSetStrings.add("bruno");
        hashSetStrings.add("sala");
        hashSetStrings.add("ohaha");

        System.out.println("cac phan tu trong hashsetstring :");
        System.out.println(hashSetStrings);
        System.out.println("nhap phan tu can xoa :");
        name = sc.nextLine();
        if (hashSetStrings.contains(name)) {
            hashSetStrings.remove(name);
            System.out.println("xoa thanh cong :");
            System.out.println("cac phan tu con lai :");
            System.out.println(hashSetStrings);
        } else {
            System.out.println("xoa thanh cong:");
        }
    }
}