package Chuong4;

import java.util.ArrayList;

public class Slide18 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayListiInteger = new ArrayList<>();

        arrayListiInteger.add(0);
        arrayListiInteger.add(5);
        arrayListiInteger.add(6);

        System.out.println("cac phan tu co trong arrlistinteger la: ");
        for (int number : arrayListiInteger) {
            System.out.println(number + "\t");
        }
    }
}