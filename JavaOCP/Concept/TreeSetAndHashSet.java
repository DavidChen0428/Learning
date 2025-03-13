package Concept;

import java.util.Comparator;
import java.util.HashSet;
import java.util.TreeSet;

/*
 *  TreeSet和HashSet的比較 :
 *  TreeSet有排序(Comparator改變排序)
 *  HashSet沒有排序
 * 
 * 
 */

public class TreeSetAndHashSet {
    public static void main(String[] args) {
        HashSet<String> carsh=new HashSet<>();
        carsh.add("Volvo");// 新增Set資料
        carsh.add("BMW");
        carsh.add("Ford");
        carsh.add("Mazda");
        System.out.println(carsh.size());// 顯示目前Set內的容量大小
        System.out.println(carsh);// 輸出Set的資料內容
        
        System.out.println(carsh.contains("Benz"));// 判斷Set內有無此內容

        carsh.remove("Volvo");// 刪除Set的資料內容
        System.out.println(carsh);
        
        carsh.clear();// 完全清除Set的資料
        System.out.println(carsh.isEmpty());// 判斷Set內容是否為空
        System.out.println(carsh);

        TreeSet<String> carst=new TreeSet<>(Comparator.reverseOrder());
        carst.add("Volvo");// 新增Set資料
        carst.add("BMW");
        carst.add("Ford");
        carst.add("Mazda");

        System.out.println(carst.first());// 返回最大的元素
        System.out.println(carst.last());// 返回最小的元素
        System.out.println(carst.lower("Ford"));// 返回小於指定元素的最大元素
        System.out.println(carst.floor("Ford"));// 返回小於等於指定元素的最大元素
        System.out.println(carst.ceiling("Ford"));// 返回大於等於指定元素的最小元素
        System.out.println(carst.higher("Ford"));// 返回大於指定元素的最小元素
        
        System.out.println(carst.pollFirst());// 返回並移除集合中的第一個元素
        System.out.println(carst.pollLast());// 返回並移除集合中的最後一個元素
    }
}
