import java.util.Scanner;

public class Bai10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String chuoi;
        System.out.print("Chuoi la: ");
        chuoi = sc.nextLine();
        char c = chuoi.charAt(0);
        int s = 1;
        for (int i = 1; i < chuoi.length(); i++)
            if (c == chuoi.charAt(i))
                s++;
        System.out.println("So phan xuat hien la: " + s);
    }
}