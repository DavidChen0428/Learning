public class StringFormatFunc {
    // String.format()
    // 格式化輸出
    // 格式化日期、數字、百分比
    static String str1=String.format("Hellow World!");
    static String str2=String.format("Hellow %s","World");
    static String str3=String.format("the number is %d.",123);
    static String str4=String.format("Hellow %s ,%d","World",1234);
    public static String handleDoubleString(int number,Double doubleValue){
        return String.format("%."+number+"f", doubleValue);
    }
    
    //左右對齊
    static String formattedString1=String.format("|%10s|","Hello").replace(' ','0');
    static String formattedString2=String.format("|%-10s|","Hello");

    public static void main(String[] args) {
        System.out.println(handleDoubleString(3,3.14159));// 3.142
        System.out.println(formattedString1);// |00000Hello|
        System.out.println(formattedString2);// |Hello     |
    }
}
