class Person implements Comparable<Person>{
    private String name;
    private String noID;
    private int number;
    public Person(){
        this.number=0;
    }
    public Person(String name,String onID){
        this.name=name;
        this.noID=onID;
        this.number=0;
    }
    public Person(String name,String onID,int number){
        this.name=name;
        this.noID=onID;
        this.number=number;
    }
    @Override
    public int compareTo(Person p) {//java内置的排序对象，可以进行从小到大的排序
        return this.number-p.number;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getNoID() {
        return noID;
    }
    public void setNoID(String noID) {
        this.noID = noID;
    }
    public int getNumber() {
        return number;
    }
    public void setNumber(int number) {
        this.number = number;
    }

}