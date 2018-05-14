import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.Scanner;

    /**
     * 题目：实现键盘输入文件内容，并保存
     */
public class AddTest {
        public static void main(String[] args) throws Exception{
            Scanner scan=new Scanner(System.in);
            System.out.println("请输入文件名称：");
            String fileName=scan.next(); //输入文件名称
            String path=fileName+".txt";
            File f=new File(path);
            System.out.println("请输入内容：");
            OutputStream out=new FileOutputStream(f);
            String str=scan.next();  //输入内容
            byte b[]=str.getBytes();
            out.write(b);
            out.close(); //关闭字节流
        }
}
