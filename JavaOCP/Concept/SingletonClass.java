package Concept;
// 單例類別(Singleton Class)
// 確保一個類在應用程式的運行過程中只被實例化一次。
// 避免重複創建和管理多個實例所帶來的資源浪費和複雜性。

public class SingletonClass {
    public static void main(String[] args) {
        Singleton singleton=Singleton.getInstance();
        singleton.someMethod();
    }
}

class Singleton{
    // 靜態變量保存唯一實例
    private static Singleton instance;
    
    // 私有構造函數，防止外部創建實例
    private Singleton(){}

    // 提供公共靜態方法獲得唯一實例
    // 使用了雙重檢查鎖機制（double-checked locking）來確保線程安全性。
    public static Singleton getInstance(){
        if(instance==null){ // 第一次檢查
            synchronized (Singleton.class){ // 同步塊 -> 使用了同步機制，確保在同一時間只有一個線程可以進入該塊，從而避免多個線程同時創建多個實例。
                if(instance==null){ // 第二次檢查
                    instance=new Singleton(); // 創建實例
                }
            }
        }
        return instance;
    }

    // 單例類別的其他方法
    public void someMethod(){
        // 執行某些操作
    }
}