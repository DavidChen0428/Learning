package Subject;

import java.util.Scanner;

public class MersennePrime {
    /*
     *  解題 :
     *  題目 :
     *      Mersenne質數=2的P次方-1,其中p也是質數
     *      找出第n個MersennePrime
     * 
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("找出第n個MersennePrime...");
        System.out.print("n =");
        int n=sc.nextInt();
        System.out.printf("第 %d個Mersenne質數是: %d",n,getMersennePrime(n));
        sc.close();
    }

    private static boolean isPrime(int number){
        if(number<=1) return false;
        for(int i=2;i<=Math.sqrt(number);i++){
            if(number%i==0)return false;
        }
        return true;
    }

    public static long getMersennePrime(int n){
        int count=0;
        int p=2;
        long mersennePrime=0;

        while(count<n){
            if(isPrime(p)){// p是質數
                mersennePrime=power(2,p)-1;
                if(isPrime((int)mersennePrime)){// 確認該數是否為MersenePrime
                    count++;
                }
            }
            p++;// 結束後換下一個p，進行下一輪
        }
        return mersennePrime;
    }

    // 使用一般乘法(因為Math.pow()回傳的是double)
    private static long power(int base,int exponent){
        long result=1;
        for(int i=1;i<=exponent;i++){
            result*=base;
        }
        return result;
    }
}
