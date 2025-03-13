package Concept;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/*
 *  TreeMap和HashMap的差異 :
 *  TreeMap採自然排序；HashMap沒有排序
 *  皆遵循key/value規則
 */

public class TreeMapAndHashMap {
    public static void main(String[] args) {
        // HashMap 範例
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("apple", 10);
        hashMap.put("banana", 15);
        hashMap.put("cherry", 5);
        System.out.println("HashMap: " + hashMap);

        // TreeMap 範例
        Map<String, Integer> treeMap = new TreeMap<>();
        treeMap.put("apple", 10);
        treeMap.put("banana", 15);
        treeMap.put("cherry", 5);
        System.out.println("TreeMap: " + treeMap);

        // 兩者皆有的功能 :
        System.out.println(treeMap.containsKey("apple"));// 檢查是否有這個key值
        System.out.println(treeMap.containsValue(5));// 檢查是否有這個value值
        System.out.println(hashMap.size());// 容量大小
        System.out.println(hashMap.get("apple"));// 取得Map的資料
        System.out.println(hashMap.remove("banana"));// 刪除Map的資料

        for(Integer value: treeMap.values()){
            System.out.printf("%d ",value);
        }// 印出值(value)
        System.out.println();
        for(String str:treeMap.keySet()){
            System.out.printf("%s ",str);
        }// 印出key

        treeMap.clear();// 清除treeMap內的所有資料
    }
}
