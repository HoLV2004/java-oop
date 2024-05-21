import java.util.Scanner;

public class person1 {
  public String personID;
  public String FullName;

  public void nhapthongtin() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Nhap Id = ");
    personID = sc.nextLine();
    System.out.println("Nhap ten: ");
    FullName = sc.nextLine();
  }

  public void inthongtin() {
    System.out.println("ID: " + personID);
    System.out.println("Ten: " + FullName);
  }
}
