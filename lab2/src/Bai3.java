import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        int tuoi;
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap ten :");
        String ten = sc.nextLine();
        System.out.println("nhap tuoi :");
        tuoi = sc.nextInt();
        if (tuoi < 16) {
            System.out.println("ban " + ten + " o tuoi vi thanh nien");
        } else if (tuoi >= 16) {
            System.out.println("ban " + ten + " o tuoi truong thanh");
        } else if (tuoi >= 18) {
            System.out.println("ban " + ten + " da gia");
        }
    }
}