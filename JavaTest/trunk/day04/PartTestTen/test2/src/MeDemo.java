public class MeDemo extends PeopleDemo {
    @Override
    public void method2() {
        super.method2();
        System.out.println("我是子类方法2");
    }

    public static void main(String[] args) {
        PeopleDemo peopleDemo=new MeDemo();
        peopleDemo.method2();
    }
}
