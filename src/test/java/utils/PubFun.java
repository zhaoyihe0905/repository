package utils;

import java.io.File;
import java.io.FileOutputStream;

/**
 * 常用方法
 */
public class PubFun {
    public static void writeText(String string){
        File file = new File("C:\\Users\\A\\Desktop\\demo.txt");
        FileOutputStream out;
        try{
            out = new FileOutputStream(file);
            out.write(string.getBytes());
            out.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
