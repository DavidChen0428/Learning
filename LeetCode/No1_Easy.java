package LeetCode;

public class No1_Easy{
    // 題型 : 給定一數字陣列和一個目標數，求陣列內兩個數字和為目標數。
    // 有的話提取陣列index放入新陣列內
    public static int[] twoSum(int[] nums, int target) {
        int[] answer=new int[2];
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    answer[0]=i;
                    answer[1]=j;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] nums={2,7,11,15};
        int target=9;
        int[] ans=twoSum(nums,target);
        for(int x:ans){
            System.out.println(x);
        }
    }
}