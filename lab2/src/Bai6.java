import java.util.Scanner;

public class Bai6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao so nguyen duong: ");
        int n = scanner.nextInt();
        if (n < 0) {
            System.out.println("so nhap vao phai la so duong : ");
            return;
        }
        long giaithua = 1;
        int i = 1;
        do {
            giaithua *= i;
            i++;
        } while (i <= n);
        System.out.println("giai thua cua so: " + n + "là :" + giaithua);

    }
}