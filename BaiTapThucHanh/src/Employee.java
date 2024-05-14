import java.util.Scanner;

import Hinhhoc.person;

public class Employee extends person {
    float luong;
    int tglam;

    public void nhaptglam() {
        Scanner sc = new Scanner(System.in);
        System.out.println(" nhap thoi gian lam ");
        tglam = sc.nextInt();
    }

    public void tinhluong() {
        luong = tglam * 20;
    }

    public void inluong() {
        System.out.println("luong = " + luong);
    }

    public static void main(String[] args) {
        Employee em = new Employee();
        em.nhapID();
        em.nhapHoTen();
        em.nhapChucVu();
        em.nhapDiaChi();
        em.nhaptglam();
        em.tinhluong();
        em.inluong();
        em.inthongtin();
    }
}