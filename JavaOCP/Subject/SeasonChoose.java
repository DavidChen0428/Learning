package Subject;

import java.util.Scanner;

public class SeasonChoose {
    // 解題 :
    // 題目 : 設計一個輸入月份跳出季節的
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("請輸入月份: ");
        int month = sc.nextInt();
        getSeason(month);
        sc.close();
    }

    public static void getSeason(int month) {
        String[] season = { "春", "夏", "秋", "冬" };
        switch (month) {
            case 12:
            case 1:
            case 2:
                printDetails(month, season[3]);
                break;
            case 3:
            case 4:
            case 5:
                printDetails(month, season[0]);
                break;
            case 6:
            case 7:
            case 8:
                printDetails(month, season[1]);
                break;
            case 9:
            case 10:
            case 11:
                printDetails(month, season[2]);
                break;
            default:
                System.out.print("月份輸入錯誤: " + month);
        }
    }

    private static void printDetails(int month, String season) {
        System.out.print("月份: " + month + ",季節: " + season);
    }
}
