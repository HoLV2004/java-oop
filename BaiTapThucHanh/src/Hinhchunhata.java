import java.util.Scanner;

public class Hinhchunhata extends hinhhocb {
    float chieudai, chieurong;

    public Hinhchunhata() {
        ten = " hinh chu nhat ";
    }

    public void nhapchieudaichieurong() {
        System.out.println("chieu dai : ");
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        chieudai = sc.nextFloat();
        System.out.println("chieu rong : ");
        chieurong = sc.nextFloat();
    }

    public void tinhcvdt() {
        chuvi = (chieudai + chieurong) * 2;
        dientich = chieudai * chieurong;
    }

    public static void main(String[] args) {
        Hinhchunhata hcn = new Hinhchunhata();
        hcn.xuatten();
        hcn.nhapchieudaichieurong();
        hcn.tinhcvdt();
        hcn.inchuvi();
        hcn.indientich();
    }
}