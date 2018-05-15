import java.net.InetAddress;
import java.net.UnknownHostException;

public class Test1 {
    /**
     * 题目：获取指定主机名、主机地址、和本机地址
     *
     * @param args
     */
    public static void main(String args[]) {
        InetAddress ip = null;
        try {
            ip = InetAddress.getByName("localhost");// 修改为指定的主机名称
            System.out.println("主机名：" + ip.getHostName());
            System.out.println("主机IP地址：" + ip.getHostAddress());
            System.out.println("本机IP地址："
                    + InetAddress.getLocalHost().getHostAddress());
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }

    }
}
