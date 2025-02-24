package Subject;

import java.util.Scanner;

public class LeapYear {
    /*
     *  解題 :
     *  題目 :
     *      判斷閏年
     *      四年一閏
     *      百年不閏
     *      四年一閏
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("判斷是否為閏年，請輸入西元年: ");
        int year = sc.nextInt();
        String isThisYearLeap = (isLeap(year)) ? "是" : "不是";
        System.out.printf("西元 %d年%s閏年", year, isThisYearLeap);
        sc.close();
    }

    public static boolean isLeap(int year) {
        if (year % 4 != 0) {
            return false;
        } else if (year % 100 != 0) {
            return true;
        } else {
            return year % 400 == 0;
        }
    }
}
