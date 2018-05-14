import java.util.*;
public class ArrayReplace {
    /*
    数组替换
     */
        public static void main(String[] args) {
            String arr[] = new String[] { "ruanyang", "are", "good", "boy" };
            System.out.println("替换前：");
            for (String str : arr) {
                System.out.print(str+"\t");
            }
            Arrays.fill(arr, 2, 3, "bb");
            System.out.println("\n替换后：");
            for (String str2 : arr) {
                System.out.print(str2+"\t");
            }
        }
}
