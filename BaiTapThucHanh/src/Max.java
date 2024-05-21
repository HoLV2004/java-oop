import java.util.ArrayList;
import java.util.Scanner;

public class Max {
    public static void main(String[] args) {
        ArrayList<Integer> arrayListMAx = new ArrayList<Integer>();
        Scanner sc = new Scanner(System.in);
        int number;
        System.out.print("Nhap so phan tu cua ArrayList: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Nhap phan tu thu " + i + ": ");
            number = sc.nextInt();
            arrayListMAx.add(number);
        }
        int Max = arrayListMAx.get(0);
        for (int i = 1; i < arrayListMAx.size(); i++) {
            if (arrayListMAx.get(i) > arrayListMAx.get(0))
                Max = arrayListMAx.get(i);
        }
        System.out.print("Phan tu lon nhat: " + Max);
    }
}