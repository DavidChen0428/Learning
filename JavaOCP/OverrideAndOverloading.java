public class OverrideAndOverloading{
    //  Override
    //      方法名稱相同
    //      參數數量、順序相同
    //      返回型態必須是與父類相同或其子類型
    //      修飾符比父類更寬鬆
    //      異常處理不能比父類拋出得還要廣泛

    //  Overloading
    //      在同一個類別內，允許同一個方法名稱有多種不同的參數列表。
    //      方法名稱相同
    //      參數數量、類型、順序不同
    //      返回型態可以不同
    //      修飾符可以不同
    //      例外輸出也可以不同
    
}

class A{
    protected int getInt(int i){
        return i;
    }
}

class B extends A{
    @Override
    protected int getInt(int i) {
        return i*2;
    }

    //Overloading
    protected int getInt(int i,int j){
        return i+j;
    }

    protected long getInt(long i){
        return i*2;
    }
    
}