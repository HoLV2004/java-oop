import java.util.ArrayList;

public class ArrListPerson {
    public static void main(String[] args) {
        ArrayList<Person1> arrayListperson = new ArrayList<Person1>();

        for (int i = 0; i < 2; i++) {
            Person1 ps1 = new Person1();
            ps1.nhapthongtin();
            arrayListperson.add(ps1);

        }
        for (int i = 0; i < arrayListperson.size(); i++) {
            Person1 ps1 = new Person1();
            ps1.inthongtin();
            arrayListperson.add(ps1);
        }

    }
}