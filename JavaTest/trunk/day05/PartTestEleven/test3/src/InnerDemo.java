public class InnerDemo {
    static class a{
        void funcation(){
            System.out.println("f()");
        }
    }
    public static void main(String args[]){
        InnerDemo.a a=new a();
        a.funcation();
    }
}
