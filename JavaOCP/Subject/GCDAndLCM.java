package Subject;

import java.util.Scanner;

public class GCDAndLCM {
    /*
     *  Greatest Common Divisor, GCD 最大公因數
     *      使用歐幾里得算法(Euclidean Algorithm)
     *          如果a>b,則a和b的GCD等於b和a%b的GCD
     *          當其中一個數字為0,則另一個數字為兩樹的GCD
     *  Least Common Multiple, LCM 最小公倍數
     *      可以使用最大公因數GCD來求出最小公倍數
     *          LCM(a,b)*GCD(a,b)=|a*b|
     * 
     *  解題 :
     *  題目 :
     *      求兩數的最大公因數和最小公倍數。
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("求兩數的最大公因數和最小公倍數");
        System.out.print("a =");
        int a = sc.nextInt();
        System.out.print("b =");
        int b = sc.nextInt();
        System.out.printf("[%d,%d]的最大公因數為%d,最小公倍數為%d",a,b,getGCD(a, b),getLCM(a, b));
        sc.close();

    }

    public static int getGCD(int a,int b){
        // // Method 1:暴力搜尋法
        // int min=Math.min(a,b);
        // for(int i=min;i>=2;i--){
        //     if(a%i==0 && b%i==0){
        //         return i;
        //     }
        // }
        // return 1;// 沒找到最大公因數，則返回1

        // Method 2:歐幾里得算法
        while(b!=0){
            int temp=b;
            b=a%b;
            a=temp;
        }
        return a;
    }

    public static int getLCM(int a,int b){
        // // Method 1:暴力搜尋法
        // int max=Math.max(a, b);
        // for(int i=max;i<a*b;i+=max){// 逐步加max會比較快
        //     if(i%a==0 && i%b==0){
        //         return i;
        //     }
        // }
        // return a*b;

        // Method 2:套公式
        return Math.abs(a*b)/getGCD(a, b);
    }
}
