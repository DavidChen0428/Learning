package Subject;

public class RabbitNumber {
    /*
     *  解題 :
     *  題目 :
     *      老王養一群兔子
     *      三隻三隻數會剩一隻
     *      五之五隻數會剩三隻
     *      七隻七隻數會剩兩隻
     *      試問最少養幾隻
     */
    public static void main(String[] args) {
        for(int i=1;i<=100;i++){
            if(i%3==1&&i%5==3&&i%7==2){
                System.out.println(i+"隻");
                break;
            }
        }   
    }
}
