package LeetCode;

import java.util.HashSet;
import java.util.Set;

public class No26_Easy {
    // 題目 Remove duplicates from sorted array
    // 條件 
    // 1.傳入一陣列，去除重覆數字
    // 2.回傳陣列內資料個數
    // 3.驗證時，要將原陣列改變為新的陣列(無重覆數)
    public static int removeDuplicates(int[] nums) {
        // // 資料型態轉換 int -> Integer
        // Integer[] integerArray=new Integer[nums.length];
        // for(int i=0;i<nums.length;i++){
        //     integerArray[i]=nums[i];
        // }

        // // 使用HashSet的特性 : 資料不重覆，將陣列轉成List再轉成HashSet
        // Set<Integer> set=new HashSet<>(Arrays.asList(integerArray));
        
        // // 再將Set轉回陣列(指定型態為Integer)
        // Integer[] answer=set.toArray(new Integer[0]);
        // System.out.println(set);

        // return answer.length;
        
        
        // 傳入空陣列時直接回傳0
        if(nums==null|| nums.length==0){
            return 0;
        }

        Set<Integer> set=new HashSet<>();
        // 設立index要把原陣列改變
        int index=0;

        // 將參數裝入set內(會自動濾掉重覆的資料)
        for(int num:nums){
            if(set.add(num)){
                nums[index++]=num;
            }
        }
        return index;
    }


    public static void main(String[] args) {
        int[] nums1={1,1,2};
        int[] nums2={0,0,1,1,1,2,2,3,3,4};

        System.out.println(removeDuplicates(nums1));// 2
        System.out.println(removeDuplicates(nums2));// 5
    }
}
