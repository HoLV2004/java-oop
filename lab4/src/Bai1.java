import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        int n, so, max, xoa;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao so phan tu cua list: ");
        n = sc.nextInt();
        if (n < 0) {
            System.out.println("Vui long nhap lai!");
            n = sc.nextInt();
        }
        System.out.println("Nhap cac phan tu cua list: ");
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap phan tu thu " + i);
            so = sc.nextInt();
            al.add(so);
        }
        max = al.get(0);
        for (int i = 1; i < al.size(); i++) {
            if (al.get(i).compareTo(max) > 0) {
                max = al.get(i);
            }
        }
        System.out.println("Phan tu lon nhat trong list la: " + max);
        System.out.println("Ban muon xoa gia tri nao? ");
        xoa = sc.nextInt();
        if (al.contains(xoa)) {
            al.removeIf(t -> t.equals(xoa));
            System.out.println("List sau khi xoa gia tri " + xoa);
            System.out.println(al);
        } else {
            System.out.println("Gia tri ban muon xoa khong ton tai");
        }
        al.sort(Comparator.naturalOrder());
        System.out.println("List sau khi sap xep tang dan: ");
        System.out.println(al);
        System.out.println("List sau khi sap xep giam dan: ");
        al.sort(Comparator.reverseOrder());
        System.out.println(al);
    }
}