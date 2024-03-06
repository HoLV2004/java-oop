import java.util.Scanner;

public class QuanLyHocSinh {
    String hoTen;
    String gioiTinh;
    String MSV;

    void nhapHoten() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ho Ten : ");
        hoTen = sc.nextLine();
    }

    void nhapGioitinh() {
        Scanner sc = new Scanner(System.in);
        System.out.print("gioi tinh : ");
        gioiTinh = sc.nextLine();
    }

    void nhapMSV() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ma sinh vien : ");
        MSV = sc.nextLine();
    }

    void inthongtin() {
        System.out.println("Ho ten : " + hoTen);
        System.out.println("Gioi tinh: " + gioiTinh);
        System.out.println("Ma sinh vien: " + MSV);
    }

}
