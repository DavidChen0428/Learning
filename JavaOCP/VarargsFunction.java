public class VarargsFunction {
    // Varargs Fuunction -> 可變參數，傳遞不定數量的同型參數給方法。 
    
    public void cal(String...num){
        System.out.println(num[num.length-1]+" ");
    }
    
    // public void cal(String... num1,int num2){
    //     System.out.println(num1[num1.length-1]+" ");
    // }

    // 可以再加不同型態的參數，但需讓不定參數放置在最後
    public void cal(int num1,String...num2){
        System.out.print(num1+": ");
        for(String str:num2){
            System.out.print(str+" ");
        }
    }
    
    public static void main(String[] args) {
        new VarargsFunction().cal(5,"Bob","Louis","Frank","Jane","Tina");
    }
}
