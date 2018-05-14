public class People {
    int age;
    String name;
    public void eat(){
        System.out.println("每天吃饭");
    }
    public void speak(int m) throws MyException{
        if(m > 1000){
            throw new MyException("参数太大了");
        }
    }
}
