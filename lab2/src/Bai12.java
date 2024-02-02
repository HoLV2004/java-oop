import java.util.Scanner;

public class Bai12 {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        int m, n;
        System.out.println("nhap so dong : ");
        m = Sc.nextInt();
        System.out.println("nhap vao so cot : ");
        n = Sc.nextInt();
        int A[][] = new int[m][n];
        System.out.println("nhap phan tu cua ma tran :");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println("A[" + i + "][" + j + "]");
                A[i][j] = Sc.nextInt();
            }
        }
        int max = A[0][0];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (max < A[i][j]) {
                    max = A[i][j];
                }
            }
        }
        System.out.println("phan tu lon nhat la : " + max);
    }
}