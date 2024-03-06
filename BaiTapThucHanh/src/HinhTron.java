import java.util.Scanner;

public class HinhTron {

    final float PI = 3.14f;
    float r;
    float chuvi;
    float dientich;

    void nhapBanKinh() {
        System.out.println("Nhap vao ban kinh hinh tron");
        Scanner sc = new Scanner(System.in);
        r = sc.nextFloat();
    }

    void tinhchuvi() {
        chuvi = 2 * PI * r;
    }

    void tinhdientich() {
        dientich = PI * r * r;
    }

    void inchuvi() {
        System.out.println("chu vi hinh tron:" + chuvi);
    }

    void indientich() {
        System.out.println("dien tich hinh tron:" + dientich);
    }
}
