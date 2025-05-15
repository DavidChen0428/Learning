package Concept;

public class StaticField {
    public static int a=10;

    public static void method1(){
        System.out.println("Static method");
    }

    public void method2(){
        System.out.println("Instance method");
    }
    public static void main(String[] args) {
        System.out.println(StaticField.a);
        StaticField.a=20;
        StaticField sf=new StaticField();
        System.out.println(sf.a);
        sf.a=30;
        System.out.println(StaticField.a);

        sf.method1();
        sf.method2();
        StaticField.method1();
        //StaticField.method2();
    }
}
