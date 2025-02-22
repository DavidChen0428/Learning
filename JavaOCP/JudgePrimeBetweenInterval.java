import java.util.Scanner;

public class JudgePrimeBetweenInterval {
    // 解題 : 
    // 題目 :
    //      判斷在數字區間內有多少個質數?並且輸出所有質數。
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("找尋數字區間內的質數，並統計。");
        System.out.print("請輸入起始數: ");
        int start=sc.nextInt();
        System.out.print("請輸入終點數: ");
        int end=sc.nextInt();
        printPrimeBetweenIntervals(start, end);
        sc.close();
    }

    private static boolean isPrime(int number){
        for(int i=2;i<number;i++){
            if(number%i==0){
                return false;
            }
        }
        return true;
    }

    public static void printPrimeBetweenIntervals(int start,int end){
        int count=0;
        for(int i=start;i<=end;i++){
            if(isPrime(i)){
                count++;
                System.out.printf(" %d ",i);
            }
        }
        System.out.printf("\n[%d,%d]區間內的質數共有%d個",start,end,count);
    }
}
