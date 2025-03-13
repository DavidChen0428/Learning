package Concept;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/*
 *  ArrayList跟Array的差異 :
 *  Array容量固定，要改變容量就得再新增一個Array
 *  ArrayList容量無限擴充
 */

public class ArrayListExample {
    public static void main(String[] args) {
        List<String> arrays=new ArrayList<>();
        arrays.add("David");// 新增ArrayList的內容
        arrays.add("Kevin");
        arrays.add("John");
        arrays.add("Eric");
        arrays.add("Eric");
        arrays.add("Kenny");

        System.out.println(arrays.size());// 取得ArrayList的大小
        System.out.println(arrays); // 輸出List內容
        
        System.out.println(arrays.get(0));// 取出ArrayList內容，陣列不受影響
        
        arrays.set(3, "Gina");// 修改ArrayList的內容
        System.out.println(arrays); 

        Collections.sort(arrays);// 對ArrayList做排序(正排序)
        System.out.println(arrays);

        Comparator<String> comparator=new Comparator<>(){// 使用Comparator對排序方法作改變
            @Override
            public int compare(String str1,String str2){
                return str2.compareTo(str1);
            }
        };
        Collections.sort(arrays,comparator);
        // Collections.sort(arrays,(str1,str2)-> str2.compareTp(str1)); // 使用Lambda語法
        // arrays.sort(Comparator.reverseOrder()); // 使用Comparator內建的方法
        System.out.println(arrays);
        
        arrays.remove(4);// 刪除ArrayList的內容
        System.out.println(arrays); 
        
        arrays.clear();// 完全清除ArrayList的內容
        System.out.println(arrays); 
    }
}
