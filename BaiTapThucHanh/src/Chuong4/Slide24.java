package Chuong4;

import java.util.ArrayList;
import java.util.Scanner;

public class Slide24 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayListiIntegers = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int number;
        System.out.println("nhap so phan tu cua arraylist ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("nhap phan tu thu " + i + "=");

            arrayListiIntegers.add(n);
        }
        int Max = arrayListiIntegers.get(0);

        for (int i = 1; i < arrayListiIntegers.size(); i++) {
            if (arrayListiIntegers.get(i).compareTo(Max) > 0) {
                Max = arrayListiIntegers.get(i);
            }
        }
        System.out.println("phan tu lon nhat trong arraylist =" + Max);

    }
}
