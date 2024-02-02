import java.util.Scanner;

public class Bai8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        int s = 0;
        System.out.print("So phan tu cua mang la: ");
        n = sc.nextInt();
        int A[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Phan tu thu " + i + " cua mang la: ");
            A[i] = sc.nextInt();

            s += A[i];

        }
        System.out.print("Trung binh cong cac so trong mang la: " + s / n);
    }

}