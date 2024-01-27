import java.util.Scanner;

public class slide30 {
    public static void main(String[] args) {
        int sodu, tong = 0, n;
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap vao 1 so nguyen duong bat ki :");
        n = sc.nextInt();
        while (n > 0) {
            sodu = n % 10;
            n = n / 10;
            tong += sodu;
        }
        System.out.println("tong cac chu so = " + tong);
    }
}