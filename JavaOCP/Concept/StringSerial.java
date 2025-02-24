package Concept;
public class StringSerial {
    /*
     *  String :
     *      Immutable
     *      適合不頻繁修改的字串
     *  
     *  StringBuilder :
     *      Mutable
     *      不適合在多執行緒環境中使用
     *      適合用於單一執行緒中需要頻繁修改字串的情況
     * 
     *  StringBuffer :
     *      Mutable
     *      與 StringBuilder 類似，但加了同步機制
     *      適合在多執行緒環境中使用
     *      適合用於多執行緒中需要頻繁修改字串的情況
     */

     public static void main(String[] args) {
        String str1="Hello";
        String str2="World";
        str1+=str2;
        System.out.println(str1);

        StringBuilder sb1=new StringBuilder("Hello");
        sb1.append("World");
        System.out.println(sb1.toString());

        StringBuffer sb2=new StringBuffer("Hello");
        sb2.append("World");
        System.out.println(sb2.toString());
     }
}
