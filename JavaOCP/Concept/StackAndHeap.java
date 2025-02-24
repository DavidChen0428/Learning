package Concept;
public class StackAndHeap {
    //  Stack(堆疊)
    //      基於 Last in First Out 原則運作的記憶體區域
    //      儲存 LocalVariable、callFuncOrder、FuncReturn
    //      JVM 管理記憶體清理
    //      特色 : 速度快、Stack大小較小且不變
    //  Heap(堆)
    //      動態分配記憶體
    //      儲存物件、陣列、物件內的成員(field)
    //      使用 Garbage Collector 管理記憶體清理
    //      特色 : 速度相對慢、Heap大小較大且可變

    // static 變數存在"方法區中"
    private static int staticValue=10;

    // 物件變數存在Heap中
    private int instanceVariable=20;

    public void cal1(){
        // localVariable 存在 Stack
        int x=1;
    }

    // 方法的程式碼存在方法區
    public void cal2(){
        // 陣列存在 Stack
        int[] array=new int[10];
    }

    public static void main(String[] args) {
        // 物件存在 Stack 中
        StackAndHeap example=new StackAndHeap();

    }
}
