package Subject;
import java.util.Scanner;

public class RabbitBirth {
    // 解題 :
    // 題目 : 
    /*      有一對兔子，從出生後第三個月起每個月都會生一對兔子，
     *      小兔子長到第三個月後每個月又生一對兔子，
     *      假如兔子都不死，問每個月兔子對數為多少?
     */

     // Solution : 些列出每個月的兔子數，找出規律性
     // 1,1,2,3,5,8,13,21,34,...
     // 規律 : a[n]=a[n-1]+a[n-2]

     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("please enter months pass: ");
        int months=sc.nextInt();
        System.out.printf("%d months later, the rabbit pairs is %d pairs.",months,getRabbitPairsByMonth(months));
        sc.close();
     }

     public static int getRabbitPairsByMonth(int months){
        if(months==1 || months==2){
            return 1;
        }else{
           return getRabbitPairsByMonth(months-1)+getRabbitPairsByMonth(months-2); 
        }
     }
}   
