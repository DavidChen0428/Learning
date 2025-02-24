package Concept;
public class BlockBreak {
    public static void main(String[] args) {
        // break 用法 -> 跳出當前迴圈
        // break 區塊時，會跳脫到指定區塊外
        // 如果區塊內有迴圈，且有一般break條件，會是跳至迴圈外但是是區塊內，必須再進入迴圈一次
        String str;
        z: {
            str = "";
            for (int x = 3; x < 8; x++) {
                if (x == 4)
                    break;
                if (x == 6)
                    break z;
                str += x;
            }
        }
        System.out.println(str);// 35


        // String str="";
        // for(int x=3;x<8;x++){
        //     if(x==4) break;
        //     if(x==6) break;
        //     str+=x;
        // }
        // System.out.println(str);// 3
    }
}