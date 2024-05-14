package Hinhhoc;

import java.util.Scanner;

public class person {
    public String ID, HoTen, DiaChi, chucvu;

    public person() {
        ID = "2708";
        HoTen = "nguyenhuuduc";
        chucvu = "nhanvien";
        DiaChi = "vinhphuc";
    }

    Scanner sc = new Scanner(System.in);

    public void nhapID() {
        System.out.println("ID =");
        ID = sc.nextLine();
    }

    public void nhapHoTen() {
        System.out.println("HO va Ten:");
        HoTen = sc.nextLine();
    }

    public void nhapChucVu() {
        System.out.println("Chuc Vu :");
        chucvu = sc.nextLine();
    }

    public void nhapDiaChi() {
        System.out.println("Dia Chi :");
        DiaChi = sc.nextLine();
    }

    public void inthongtin() {
        System.out.println("ID =" + ID);
        System.out.println("Ho Ten :" + HoTen);
        System.out.println("Chuc Vu =" + chucvu);
        System.out.println("Dia Chi : " + DiaChi);
    }

    public static void main(String[] args) {
        person PE = new person();
        PE.nhapID();
        PE.nhapHoTen();
        PE.nhapChucVu();
        PE.nhapDiaChi();
        PE.inthongtin();
    }
}