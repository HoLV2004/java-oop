package Chuong4;

import java.util.ArrayList;

import javax.swing.text.html.HTMLDocument.Iterator;

public class Slide19 {
    public static void main(String[] args) {
        ArrayList<Float> arrListfFloat = new ArrayList<>();

        arrListfFloat.add(0.7f);
        arrListfFloat.add(7.21f);
        arrListfFloat.add(2.1f);
        arrListfFloat.add(3.6f);

        Iterator<Float> iterator = arrListfFloat.iterator();

        System.out.println("cac phan tu co trong arrlistfloat: ");
        while (iterator.hasNext()) {
            System.out.println(iterator.next() + "\t");
        }
    }
}