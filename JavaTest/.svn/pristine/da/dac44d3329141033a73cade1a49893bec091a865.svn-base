    /**
     * 题目：设计四个线程对象，两个线程执行减操作，两个线程执行加操作。
     */
public class AddTest extends Thread{
    int count;
    static Object obj = new Object();
        int index=10;
    @Override
    public void run() {
        while (index-->0) {
            synchronized(obj){//加同步锁，实现线程同步
                if(Thread.currentThread().getName().equals("a") || Thread.currentThread().getName().equals("b")){//线程a,b实现加操作
                    count++;
                    System.out.println(Thread.currentThread().getName() + "_" + count);
                }else{//其他线程实现减操作
                    count--;
                    System.out.println(Thread.currentThread().getName() + "_" + count);
                }
            }
            try {
                Thread.sleep(100);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }
    public static void main(String[] args) throws InterruptedException {
        AddTest t = new AddTest();
        new Thread(t, "a").start();//启动线程
        new Thread(t, "b").start();
        new Thread(t, "c").start();
        new Thread(t, "d").start();
       // Thread.sleep(100);//线程休眠
        System.out.println(t.count);
    }
}
