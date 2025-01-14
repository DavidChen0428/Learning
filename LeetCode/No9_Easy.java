package LeetCode;

public class No9_Easy {
    // 題目條件 : Palindrome Number
    // 前後看都一樣的數字，給定一個數字，判別是否為palindrome number
    public static boolean isPalindrome(int x) {
        String temp=String.valueOf(x);
        String rev=new StringBuilder(temp).reverse().toString();
        if(temp.equals(rev)){
            return true;
        }else{
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(121));
        System.out.println(isPalindrome(-121));
        System.out.println(isPalindrome(10));
    }
}
