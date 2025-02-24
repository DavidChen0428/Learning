package Subject;

import java.util.Scanner;

public class StringCollect {
    /*
     *  解題 :
     *  題目 :
     *      輸入一個字串，分析字串內
     *          有多少空白鍵(space)
     *          有多少數字(num)
     *          有多少英文字母(eng)
     *      ASCII Code :
     *          英文(65-90,97-122)
     *          空格(32)
     *          數字(48-57)
     *          其他(else)
     */

    public static void main(String[] args) {
        int eng = 0;
        int space = 0;
        int num = 0;
        int other = 0;
        Scanner sc = new Scanner(System.in);

        System.out.print("請輸入一行字元:");
        String s = sc.nextLine();
        char[] str = s.toCharArray();
        for (int i = 0; i < str.length; i++) {
            if (str[i] == 32) {
                space++;
            } else if ((str[i] >= 65 && str[i] <= 90) || (str[i] >= 97 && str[i] <= 122)) {
                eng++;
            } else if (str[i] >= 48 && str[i] <= 57) {
                num++;
            } else {
                other++;
            }
        }
        System.out.printf("英文: %d\n空格: %d\n數字: %d\n其他: %d\n", eng, space, num, other);
        sc.close();
    }

}
