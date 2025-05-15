package Subject;

public class EnumTest {
    public static void main(String[] args) {
        oldStudent oldstd=new oldStudent();
        // 兩者都輸出相同的值，我怎麼知道到底輸入的是正確的還是不正確的
        oldstd.assignGrade(oldGrade.A);
        oldstd.assignGrade(oldClass.English);

        newStudent newstd=new newStudent();
        newstd.assignGrade(newGrade.A);
        // newstd.assignGrade(newClass.English);// 編譯時期就會出錯

    }

    public enum myEnum1{
        A, B, C, D, E, F
    }

    public enum myEnum2{
        English, Math, Chinese
    }
}
class oldGrade{
    public static final int A=1;
    public static final int B=2;
    public static final int C=3;
}

class oldClass{
    public static final int English=1;
    public static final int Math=2;
    public static final int Chinese=3;

}

class oldStudent{
    public void assignGrade(int grade){
        System.out.println("The student grade is "+grade);
    }
}

enum newGrade{
    A,B,C
}

enum newClass{
    English,Math,Chinese
}

class newStudent{
    public void assignGrade(newGrade grade){
        System.out.println("The student grade is "+grade);
    }
}

