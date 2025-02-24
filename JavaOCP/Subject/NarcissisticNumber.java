package Subject;

import java.util.Scanner;

public class NarcissisticNumber {
    /*
     *  解題 :
     *  題目 :
     *      Armstrong Number 阿姆斯壯數
     *      Narcissistic Number 自冪數(水仙花數)
     *          該數字的各個位數的n次方(n為數字的位數)和等於該數字本身。
     * 
     *      顯示範圍內的自冪數。
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Armstrong Number");
        System.out.println("輸入一數字，找出其範圍內的Armstrong Number。");
        System.out.print("請輸入一數: ");
        int max = sc.nextInt();
        System.out.print(max + "以內的Armstrong Number為: ");
        for (int i = 1; i <= max; i++) {
            if (isNarcissisticNumber(i)) {
                System.out.print(i + " ");
            }
        }
        sc.close();
    }

    public static boolean isNarcissisticNumber(int number) {
        String numberStr = "" + number;
        int sum = 0;
        for (int i = 0; i < numberStr.length(); i++) {
            int digit = numberStr.charAt(i) - '0';
            sum += Math.pow(digit, numberStr.length());
        }
        return sum == number;
    }
}