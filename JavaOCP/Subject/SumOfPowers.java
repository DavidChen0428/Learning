package Subject;

import java.util.Scanner;

public class SumOfPowers {
    /*
     *  解題 :
     *  題目 :
     *      計算次方數的總和
     */

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("計算次方和...");
        System.out.print("請輸入底數: ");
        int base=sc.nextInt();
        System.out.print("請輸入次方數: ");
        int exponent=sc.nextInt();
        printSumOfPowers(base, exponent);
        sc.close();
        
    }

    public static void printSumOfPowers(int base,int exponent){
        for(int i=1;i<base;i++){
            System.out.print(i+"的"+exponent+"次方+");
        }
        System.out.print(base+"的"+exponent+"次方=");
        System.out.print(getSumOfPowers(base, exponent));
    }

    private static double getSumOfPowers(int base,int exponent){
        double sum=0;
        for(int i=1;i<=base;i++){
            sum=sum+Math.pow(i, exponent);
        }
        return sum;
    } 
}
