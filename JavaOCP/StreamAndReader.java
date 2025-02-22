import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class StreamAndReader {
    /*
     * Stream 和 Reader 的差別 :
     *      #Stream
     *          處理 byte 級別的輸入和輸出。
     *          InputStream
     *              FileInputStream
     *              BufferedInputStream
     *          OutputStream
     *              FileOutputStream
     *              BufferedOutputStream
     *      #Reader
     *          處理 character 級別的輸入和輸出。
     *          Redaer
     *              FileReader
     *              BufferedReader
     *          Writer
     *              FileWriter
     *              BufferedWriter
     */

     public static void main(String[] args) {
        // 使用 FileInputStream 和 FileOutputStream 來讀取檔案內容還有把檔案內容寫入新檔案裡
        try(FileInputStream in=new FileInputStream("input.txt");
            FileOutputStream out=new FileOutputStream("output.txt")){
                int byteData;
                while((byteData=in.read())!=-1){
                    out.write(byteData);
                }
        }catch(IOException e){
            e.printStackTrace();
        }

        // 使用 FileReader 和 FileWriter 來讀取檔案內容還有把檔案內容寫入新檔案裡
        try(FileReader reader=new FileReader("input.txt");
            FileWriter writer=new FileWriter("output.txt")){
                int charData;
                while((charData=reader.read())!=-1){
                    writer.write(charData);
                }
        }catch(IOException e){
            e.printStackTrace();
        }
     }
}
