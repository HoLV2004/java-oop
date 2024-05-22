import java.util.LinkedList;
import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();
        int n, pt;
        Scanner sc = new Scanner(System.in);
        System.out.println("Vui long nhap vao so phan tu trong danh sach: ");
        n = sc.nextInt();
        if (n < 0) {
            System.out.println("Nhap lai!");
            n = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap phan tu thu " + i);
            pt = sc.nextInt();
            ll.add(pt);
        }
        double sum = 0, dem = 0;
        for (int i = 0; i < n; i++) {
            if (ll.get(i) % 2 == 0) {
                sum += ll.get(i);
                dem++;
            }
        }
        System.out.println("Trung binh cong cua cac so chan: " + sum / dem);
    }
}