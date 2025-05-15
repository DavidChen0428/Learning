package Subject;

public class MyRecordMain {
    public static void main(String[] args) {
        MyRecord record=new MyRecord(3, 4);
        System.out.println("x:"+record.x()+", y:"+record.y());
        System.out.println(record.toString());
    }
}
