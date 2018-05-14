public class InnerDemo {

}
class OuterClass{
    public OutInterface doMethod( final String str){
        return  new OutInterface() {
            private int i=0;
            public int getValue(){

                return i;
            }
            public void  getFuncation(){
                System.out.println("funcation");
            }
        };
    }
}
interface OutInterface{

}
