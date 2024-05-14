import java.util.Scanner;

public class HinhHoc {
    public String TenHinh;
    float r;

    void nhapTenhinh() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ten hinh= ");
        TenHinh = sc.nextLine();
    }

    void Hienthi() {
        System.out.println("Ten hinh " + TenHinh);
    }

    void Hienthi(String name) {
        System.out.println("hinh tron ");
    }
}