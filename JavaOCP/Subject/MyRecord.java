package Subject;
/*
 * Java 16之後的類別 : 
 * Immunitability
 * 自動生成參數get方法
 * 自動生成equals()、hashCode()、toString()
 * 可自定義建構式
 * 
 */

public record MyRecord(int x,int y){
    public MyRecord(int x,int y){
        if(x<=8){
            throw new RuntimeException("x不能小於等於8");
        }
        this.x=x;
        this.y=y;
    }
}
