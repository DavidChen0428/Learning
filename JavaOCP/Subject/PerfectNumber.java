package Subject;

import java.util.Scanner;

public class PerfectNumber {
    /*
     *  解題 :
     *  題目 :
     *      找尋範圍內的完美數(Perfect NUmber)
     *      完美數是除了自己本身以外，其他因數的總和等於該數本身
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("找尋範圍內的完美數...");
        System.out.print("請輸入查找最小值: ");
        int min = sc.nextInt();
        System.out.print("請輸入查找最大值: ");
        int max = sc.nextInt();
        System.out.printf("%d與%d之間的完美數為: ", min, max);
        printPerfectNumber(min, max);
        sc.close();
    }

    public static void printPerfectNumber(int min, int max) {
        for (int i = min; i <= max; i++) {
            int sum = 0;
            for (int j = 1; j < i; j++) {
                if (i % j == 0) {
                    sum = sum + j;
                }
            }
            if (sum == i) {
                System.out.print(i + " ");
            }
        }
    }
}
