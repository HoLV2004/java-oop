import java.util.Scanner;

public class giaiPTbac2 {
    public static void main(String[] args) {
        double a, b, c, x1, x2, delta;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập hệ số a: ");
        a = sc.nextDouble();
        System.out.print("nhập hệ số b : ");
        b = sc.nextDouble();
        System.out.print("Nhập hệ số c: ");
        c = sc.nextDouble();
        if (a == 0) {
            System.out.println("khong phai phuong trinh bac 2.");
        } else {
            delta = b * b - 4 * a * c;
            if (delta < 0) {
                System.out.println("phuong trinh vo nghiem");
            } else {
                if (delta == 0) {
                    System.out.println("phuong trinh co nghiem kep");
                    x1 = x2 = -b / 2 * a;
                    System.out.println("x1 = x2 =" + x1);

                }
            }
            if (delta > 0) {
                System.out.println("phuong trinh co 2 nghiem phan biet");
                x1 = (-b + Math.sqrt(delta)) / 2 * a;
                x2 = (-b - Math.sqrt(delta)) / 2 * a;
                System.out.println("X1=" + x1);
                System.out.println("x2=" + x2);
            }
        }

    }
}