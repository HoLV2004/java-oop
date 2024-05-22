package Chuong4;

import java.security.KeyStore.Entry;
import java.util.Set;
import java.util.TreeMap;

public class slide107 {
    public static void main(String[] args) {
        TreeMap<Integer, Character> treeMap = new TreeMap<>();

        treeMap.put(3, 'A');
        treeMap.put(5, 'B');
        treeMap.put(4, 'C');
        treeMap.put(2, 'D');

        Set<Entry<Integer, Character>> setTreeMap = treeMap.entrySet();

        System.out.println(" cac entry co trong setTreeMap ");
        System.out.println(setTreeMap);
    }
}