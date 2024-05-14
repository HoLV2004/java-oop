package Hinhhoc;

import java.util.Scanner;

public class Hinhtron {
    public float r, cv, dt;
    final float PI = 3.14f;

    void nhapbankinh() {
        System.out.println("r = ");
        Scanner Sc = new Scanner(System.in);
        r = Sc.nextFloat();

    }

    void tinhchuvi() {
        cv = 2 * PI * r;
    }

    void tinhdientich() {
        dt = PI * r * r;
    }

    void inthongtin() {
        System.out.println("chu vi = " + cv);
        System.out.println("dien tich = " + dt);
    }

    public static void main(String[] args) {
        Hinhtron ht = new Hinhtron();
        ht.nhapbankinh();
        ht.tinhchuvi();
        ht.tinhdientich();
        ht.inthongtin();
    }
}