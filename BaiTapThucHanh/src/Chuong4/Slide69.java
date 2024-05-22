package Chuong4;

import java.util.HashSet;
import java.util.Scanner;

public class Slide69 {
    public static void main(String[] args) {
        int number;
        HashSet<Integer> hashSetInterger = new HashSet<Integer>();
        Scanner sc = new Scanner(System.in);
        hashSetInterger.add(1);
        hashSetInterger.add(5);
        hashSetInterger.add(2);
        hashSetInterger.add(8);
        hashSetInterger.add(7);
        hashSetInterger.add(9);
        hashSetInterger.add(2);
        hashSetInterger.add(4);
        hashSetInterger.add(6);
        System.out.println("Cac phan tu trong HashSetInterger");
        System.out.println(hashSetInterger);
        System.out.println("Nhap phan tu can xoa: ");
        number = sc.nextInt();
        if (hashSetInterger.contains(number)) {
            hashSetInterger.remove(number);
            System.out.println("Xoa thanh cong");
            System.out.println("Cac phan tu tring HashSetInterger sau khi xoa: ");
            System.out.println(hashSetInterger);
        } else
            System.out.print("Phan tu " + number + " khong ton tai");

    }
}
