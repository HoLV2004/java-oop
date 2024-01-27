import java.util.Scanner;

public class slide47 {
    public static void main(String[] args) {
        int so, tong = 0;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("nhap vao so nguyen bat ki :");
            so = sc.nextInt();
            tong += so;
        } while (tong < 100);
        System.out.println("tong cac so nguyen vua nhap :" + tong);
    }
}