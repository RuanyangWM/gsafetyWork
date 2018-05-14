import java.text.DecimalFormat;

public class RoundArea {
    /*
    求圆形面积
     */
    public static double getRoundArea(double r){//构造方法，求圆形面积
        return Math.PI*Math.pow(r,2);
    }
    public static void getFormat(double format){
        DecimalFormat decimalFormat=new DecimalFormat("#.#####");
        String str= decimalFormat.format(format);
        System.out.println(str);
    }
    static public void SimpleFormat(String pattern, double value) {	//使用实例化对象时设置格式化模式
        DecimalFormat myFormat = new DecimalFormat(pattern);	//实例化DecimalFormat对象
        String output = myFormat.format(value);				//将数字进行格式化
        System.out.println(value + " " + pattern + " " + output);
    }
    public static void main(String[] args) {
        System.out.println("圆形的面积为：");
        getFormat(getRoundArea(4));
      //  SimpleFormat("#.#####",getRoundArea(4));
    }
}
