package MethodIntro;
import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        // Arrays.binarySearch();
        // 於陣列中進行二元搜尋。有找到 -> 返回位置；沒有找到 -> 返回負數來指示應插入的位置
        String[] a={"b","r","g","y","o"};
        Arrays.sort(a); // {"b","g","o","r","y"}
        int i1=Arrays.binarySearch(a, "o");
        int i2=Arrays.binarySearch(a, "v");
        System.out.println(i1+""+i2);// 2-5
    }
}
