public class DeMorganLaws {
    // 迪摩根定律
    // 用於簡化邏輯表達式的規則，特別是當涉及否定時。這些定律在數理邏輯和布爾代數中非常重要。
    /*
     * not A and not B -> not (A or B)
     * not A and B -> not(A or not B)
     * A and not B -> not(not A or B)
     * A or B -> not(not A and not B)
     * not A or not B -> not(A and B)
     * not A or B -> not (A and not B)
     * A or not B -> not (not A and B)
     * A or B -> not (not A and not B)
     * 
     */

     /*
      * Ex.
      *     int x=25;
      *     if(!(x>=10 && x<=20)){
      *         System.out.println("x 不在範圍 [10,20] 內");
      *     }
      * 
      *     ->
      *
      *     int x=25;
      *     if(x<10 || x>20){
      *         System.out.println("x 不在範圍 [10,20] 內");
      *     }
      *
      */

}
