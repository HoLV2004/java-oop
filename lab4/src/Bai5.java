import java.util.HashMap;
import java.util.Scanner;

public class Bai5 {
    public static void main(String[] args) {
        HashMap<Integer, Sinhvien> dssv = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Co bao nhieu sinh vien : ");
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 1; i <= n; i++) {
            System.out.println("Nhap ma sinh vien " + i + ": ");
            int masv = sc.nextInt();
            sc.nextLine();
            System.out.println("Nhap ho va ten sinh vien " + i + ": ");
            String hoten = sc.nextLine();
            System.out.println("Nhap lop cua sinh vien " + i + ": ");
            String lop = sc.nextLine();
            Sinhvien sv = new Sinhvien(masv, hoten, lop);
            dssv.put(masv, sv);
        }
        System.out.println("Nhap ten lop can tim: ");
        String timlop = sc.nextLine();
        for (Sinhvien sv : dssv.values()) {
            if (sv.lop.equalsIgnoreCase(timlop)) {
                System.out.println("Sinh vien hoc lop " + timlop + ": " + sv.hoten);
            }
        }
        System.out.println("Nhap ma sinh vien can tim: ");
        int timMasv = sc.nextInt();
        if (dssv.containsKey(timMasv)) {
            Sinhvien found = dssv.get(timMasv);
            System.out.println("Ho va ten sinh vien: " + found.hoten);
            System.out.println("Lop: " + found.lop);
        } else {
            System.out.println("Khong tim thay sinh vien co ma sinh vien " + timMasv);
        }
    }
}