import java.util.Scanner;

public class Bai9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String chuoi;
        System.out.println("Chuoi la: ");
        chuoi = sc.nextLine();
        int demChuHoa = 0;
        int demChuThuong = 0;
        int demSo = 0;

        for (int i = 0; i < chuoi.length(); i++) {
            char kyTu = chuoi.charAt(i);

            if (Character.isUpperCase(kyTu)) {
                demChuHoa++;
            } else if (Character.isLowerCase(kyTu)) {
                demChuThuong++;
            } else if (Character.isDigit(kyTu)) {
                demSo++;
            }
        }

        System.out.println("So chu viet hoa: " + demChuHoa);
        System.out.println("So chu viet thuong: " + demChuThuong);
        System.out.println("So chu so: " + demSo);
    }

}