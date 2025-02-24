package Subject;

import java.util.Scanner;

public class RopeExam {
    /*
     *  解題 :
     *  題目 :
     *      剪繩子測試，一繩長length,每天剪去1/2,經過多少天會到達指定長度內
     */

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("剪繩子測試");
        System.out.print("請輸入起始繩長: ");
        int ropelength=sc.nextInt();
        System.out.print("請輸入目標繩長: ");
        int target=sc.nextInt();
        System.out.printf("需要 %d天才能到達目標長度。",getDayNeedToCutRope(ropelength, target));
        sc.close();
    }

    public static int getDayNeedToCutRope(int ropelength,int target){
        int day=0;
        int currentlength=ropelength;
        do{
            currentlength/=2;
            day++;
        }while(currentlength>=target);
        return day;
    }
}
