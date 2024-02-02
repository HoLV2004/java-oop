import java.util.Arrays;
import java.util.Scanner;

public class Bai11 {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        int n;
        do {
            System.out.println("nhap n : ");
            n = Sc.nextInt();
        } while (n < 0);
        int A[] = new int[n];
        System.out.println("nhap cac phan tu cua n ");
        for (int i = 0; i < n; i++) {
            System.out.println("phan tu thu " + i + " la ");
            A[i] = Sc.nextInt();
        }
        System.out.println("mang ban dau la ");
        for (int i = 0; i < n; ++i)
            System.out.println(":" + A[i]);
        System.out.println();
        Arrays.sort(A);
        System.out.println("in ra mang tang dan ");
        for (int i = 0; i < n; ++i)
            System.out.println(":" + A[i]);

    }
}