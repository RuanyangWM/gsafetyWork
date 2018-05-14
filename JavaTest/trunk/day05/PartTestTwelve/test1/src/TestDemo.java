public class TestDemo {
    public static void main(String args[]){
        People stu = new People();
        try {
            stu.speak(2018);
        } catch (MyException e) {
            e.printStackTrace();
        }
    }
}
