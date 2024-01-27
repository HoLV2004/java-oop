import java.util.Scanner;

public class giaiPTbac1 {
    public static void main(String[] args) {
        double a, b, x;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập hệ số A: ");
        a = sc.nextDouble();
        System.out.print("nhập hệ số b : ");
        b = sc.nextDouble();
        if (a == 0) {
            System.out.println("không phải phương trình bậc 1 ");
        } else {
            x = -b / a;
            System.out.println("phương trình có nghiệm x=" + x);

        }
    }
}