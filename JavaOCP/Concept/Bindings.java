package Concept;
public class Bindings {
    /*
     *  Static Binding : (靜態綁定) Early Binding
     *      在編譯時即被決定是否調用方法
     *      static methods
     *      private methods
     *      final methods
     *      fields
     *  Dynamic Binding : (動態綁定) Late Binding
     *      JVM在執行時決定哪個方法要被調用
     *      polymorphism
     */

    public static void main(String[] args) {
        A objA=new A();
        objA.display();

        C objC=new D();
        objC.display();
    }
}

class A{
    public final void display(){
        System.out.println("Class A display");
    }
}

class B extends A{
    
}

class C{
    public void display(){
        System.out.println("Class C display");
    }
}

class D extends C{
    @Override
    public void display() {
        System.out.println("Class D display");
    }
}
