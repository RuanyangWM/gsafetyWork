public class TelNum {
    /*
    判断手机号是否合法
     */
        public static void main(String[] args) { // 主方法
            String regex = "1[35]\\d{9}";
            String text = "131688962419";
            if (text.matches(regex)) {
                System.out.println(text + "是合法的手机号");
            }else {
                System.out.println("该手机号不合法");
            }
        }

}
