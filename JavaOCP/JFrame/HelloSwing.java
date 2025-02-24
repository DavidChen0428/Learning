package JFrame;

import javax.swing.JFrame;// 創建視窗的核心原件
import javax.swing.JLabel;// 用來在視窗中顯示文本或是圖像

import java.awt.FlowLayout;// 佈局管理器，排列視窗中的元件

public class HelloSwing {
    public static void main(String[] args) {
        // 創建 JFrame 視窗
        JFrame frame = new JFrame("Hello Swing");// 創建標題為 Hello Swing 的視窗
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// 設置當視窗關閉時，程式也會終止
        frame.setSize(300, 200);// 設置視窗大小(寬300 pixel,高200 pixel)

        // 設置佈局
        frame.setLayout(new FlowLayout());

        // 添加 JLabel
        JLabel label = new JLabel("Hello, Swing!");// 創建一個帶有文本 Hello, Swing 的 JLabel
        frame.add(label);// 將 JLabel 添加到 JFrame 視窗中

        // 顯示視窗
        frame.setVisible(true);// 設置視窗為可見
    }
}
