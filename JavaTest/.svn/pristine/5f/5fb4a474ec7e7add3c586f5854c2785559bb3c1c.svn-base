/**
 * 题目：定义一个Thread类，覆盖run()方法，隔100毫秒打印一句话
 * <p>
 * 方法一：继承Thread类
 */
//public class Test1 extends Thread{
//    int index=0;
//    String[] str={"这是测试1","这是测试2","这是测试3","这是测试4","这是测试5","这是测试6","这是测试7","这是测试8"};
//    public void run() {
//        while (true) {
//            System.out.println(str[index++%8]);
//            try {
//                Thread.sleep(100);
//            } catch (Exception e) {
//                e.printStackTrace();
//            }
//        }
//    }
//    public static void main(String[] args) {
//        new Test1().start();
//    }
//}

// 方法二：实现Runnable接口
public class Test1 {
    public static void main(String[] args) {
        String[] str = {"这是测试1", "这是测试2", "这是测试3", "这是测试4", "这是测试5", "这是测试6", "这是测试7", "这是测试8"};
        new Thread(new Runnable() {
            int index=100;
            @Override
            public void run() {
                while (index-->0) {
                    System.out.println(str[index % 8]);
                    try {
                        Thread.sleep(100);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        }).start();
    }
}
