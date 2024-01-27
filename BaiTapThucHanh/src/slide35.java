import java.util.Scanner;

public class slide35 {

    public static void main(String[] args) {
        int a, b;
        Scanner Sc = new Scanner(System.in);
        System.out.println("nhap so thu nhat :");
        a = Sc.nextInt();
        System.out.println("nhap so thu hai :");
        b = Sc.nextInt();
        int sobenhat = a;
        if (a > b)
            sobenhat = b;
        System.out.println("so nho hon la : " + sobenhat);
    }
}