import java.util.Scanner;

public class Employeefulltime extends Employee {

  float thuong, luongcung;

  public void nhapluong() {
    Scanner sc = new Scanner(System.in);
    System.out.println(" nhap thuong ");
    thuong = sc.nextFloat();
    System.out.println("nhap luong cung = ");
    luongcung = sc.nextFloat();
  }

  public void tinhluong() {
    luong = tglam * 20 + thuong + luongcung;
  }

  public void inluong() {
    System.out.println("tien luong = " + luong);
  }

  public static void main(String[] args) {
    Employeefulltime em = new Employeefulltime();
    em.nhapID();
    em.nhapHoTen();
    em.nhapChucVu();
    em.nhapDiaChi();
    em.nhaptglam();
    em.nhapluong();
    em.tinhluong();
    em.inluong();
    em.inthongtin();
  }
}