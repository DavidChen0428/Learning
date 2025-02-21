public class Graphics {
    // 正方形
    public static void square(int length){
        for(int i=1;i<=length;i++){
            for(int j=1;j<=length;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // 左下直角三角形
    public static void rightTriangle1(int length){
        for(int i=1;i<=length;i++){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // 左上直角三角形
    public static void rightTriangle2(int length){
        for(int i=1;i<=length;i++){
            for(int j=1;j<=length-i+1;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    
    // 右上直角三角形
    public static void rightTriangle3(int length){
        for(int i=1;i<=length;i++){
            for(int j=1;j<=length;j++){
                if(j<i){
                    System.out.print("  ");
                }else{
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }

    // 右下直角三角形
    public static void rightTriangle4(int length){
        for(int i=1;i<=length;i++){
            for(int j=length;j>i;j--){
                System.out.print("  ");
            }
            for(int k=1;k<=i;k++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        //square(6);
        //rightTriangle1(4);
        
    }
}
