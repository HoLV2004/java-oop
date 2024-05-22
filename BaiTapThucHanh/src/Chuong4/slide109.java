package Chuong4;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class slide109 {
    public static void main(String[] args) {
        TreeMap<Integer, Double> treeMap = new TreeMap<>();
        treeMap.put(1, 9d);
        treeMap.put(4, 8d);
        treeMap.put(7, 10.2d);

        System.out.println("cac phan tu co trong treemap ");
        Set<Map.Entry<Integer, Double>> setTreeMap = treeMap.entrySet();
        System.out.println(setTreeMap);

        treeMap.replace(1, 20d);

        treeMap.replace(4, 8d, 8.8d);
        System.out.println("cac phan tu sau khi thay the ");
        setTreeMap = treeMap.entrySet();
        System.out.println(setTreeMap);
    }
}