package Subject;

import java.util.Scanner;

public class FindFactor {
    /*
     *  解題 :
     *  題目 :
     *      找出該數的因數
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("找出該數字的因數...");
        System.out.print("請輸入數字: ");
        int number = sc.nextInt();
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                System.out.print(i + " ");
            }
        }
        sc.close();
    }
}
