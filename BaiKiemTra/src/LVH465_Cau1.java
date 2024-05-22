import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class LVH465_Cau1 {
    public String hoten;
    public String tuoi;
    public String gioitinh;

    public void nhapthongtin() {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap ho va ten :");
        tuoi = sc.nextLine();
        System.out.println("nhap gioi tinh :");
        gioitinh = sc.nextLine();

    }

    public void xuatthongtin() {
        System.out.println("ho ten :" + hoten);
        System.out.println("tuoi :" + tuoi);
        System.out.println("gioitinh :" + gioitinh);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList LVH465_Cau1 = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap so muon them vao LinkedList :");
        int n = sc.nextInt();

    }

}
