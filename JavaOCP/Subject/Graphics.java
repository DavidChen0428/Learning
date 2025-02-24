package Subject;
public class Graphics {
    // 正方形
    public static void getSquare(int length){
        for(int i=1;i<=length;i++){
            for(int j=1;j<=length;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // 矩形
    public static void getRectangle(int width,int length){
        for(int i=1;i<=width;i++){
            for(int j=1;j<=length;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // 左下直角三角形
    public static void getRightTriangle1(int length){
        for(int i=1;i<=length;i++){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // 左上直角三角形
    public static void getRightTriangle2(int length){
        for(int i=1;i<=length;i++){
            for(int j=1;j<=length-i+1;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    
    // 右上直角三角形
    public static void getRightTriangle3(int length){
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
    public static void getRightTriangle4(int length){
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

    // 等腰三角形
    public static void getIsoscelesTriangle1(int height){
        for(int i=0;i<height;i++){
            for(int j=height-i;j>1;j--){
                System.out.print(" ");
            }
            for(int j=0;j<=2*i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // 倒等腰三角形
    public static void getIsoscelesTriangle2(int height){
        for(int i=height-1;i>=0;i--){
            for(int j=height-i;j>1;j--){
                System.out.print(" ");
            }
            for(int j=0;j<=2*i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // 菱形 : 兩個等腰三角形
    public static void getDiamond(int halfHeight){
        for(int i=0;i<halfHeight;i++){
            for(int j=halfHeight-i;j>1;j--){
                System.out.print(" ");
            }
            for(int j=0;j<=i*2;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=halfHeight-2;i>=0;i--){
            for(int j=halfHeight-i;j>1;j--){
                System.out.print(" ");
            }
            for(int j=0;j<=2*i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // 梯形
    public static void getTrapezoid(int height, int topWidth, int bottomWidth){
        for(int i=0;i<height;i++){
            int currentWidth=topWidth+(bottomWidth-topWidth)*i/(height-1);
            int space=(bottomWidth-currentWidth)/2;
            for(int j=0;j<space;j++){
                System.out.print(" ");
            }
            for(int k=0;k<currentWidth;k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        //getSquare(6);
        //getRightTriangle1(4);
        //getRectangle(4, 5);
        //getTrapezoid(5, 3, 9);
        //getIsoscelesTriangle2(5);
        getDiamond(5);
    }
}
