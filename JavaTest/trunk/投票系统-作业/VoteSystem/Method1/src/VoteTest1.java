import java.util.*;

/**
 * 功能描述：有一个班采用民主投票方法推选班长，班长候选人共4位，每个人姓名及代号分别为张三 1，李四 2，王五 3，刘六 4。
 * 程序操作员将每张选票上所填的代号（1、2、3、或4）循环输入电脑，输入数字0结束输入，然后将所有候选人的得票情况显示出来，并显示最终当选者的信息。
 */
public class VoteTest1 {
    public static void main(String[] args) throws MyException {
        List<Person> list = new ArrayList<>();
        Scanner input_person = new Scanner(System.in);
        System.out.println("请输入投票的候选人姓名/代号,输入stop结束,格式如:张三，2");
        String info = null;

        //输入候选人信息
        while (input_person.hasNext()) {
            info = input_person.nextLine();
            if (info.equals("stop")) break;
            String ss[] = info.split("，");
            list.add(new Person(ss[0], ss[1]));
        }
        for (int i = 0; i < list.size(); i++) {
            Person person = ((Person) list.get(i));
            System.out.println("姓名：" + person.getName() + "，编号：" + person.getNoID());
        }

        //输入投票代号并统计票数
        Scanner input = new Scanner(System.in);
        int choice;
        System.out.println("请输入投票的选人代号（输入0结束）");
        while (true) {//while循环控制投票统计，出现输入0结束投票
            choice = input.nextInt();
            System.out.println("请继续投票");
            if (choice == 0) {
                break;
            } else if (choice > 10) {//投票代号非1,2,3,4时抛出异常
                throw new MyException("此票无效，请输入正确的候选人代号！并继续等待输入");
            } else {
                for (int i = 0; i < list.size(); i++) {   //判断输入代号位置，加票数
                    Person person = ((Person) list.get(i));
                    if (person.getNoID().equals("" + choice)) {
                        int number = person.getNumber();
                        person.setNumber(number + 1);
                    }
                }

            }
        }
        Comparator<Person> comparator = new Comparator<Person>() {

            @Override
            public int compare(Person stu1, Person stu2) {
                if (stu1.getNumber() > stu2.getNumber()) {
                    return 1;
                } else if (stu1.getNumber() == stu2.getNumber()) {
                    return 0;
                } else {
                    return -1;
                }
            }
        };//将List集合中Person按票数关键字排序

        Collections.sort(list, comparator);

        printVoteInfo(list);
    }

    //实现结果打印
    private static void printVoteInfo(List<Person> list) {
        List<Person> list_person = new ArrayList<>();
        Person p = ((Person) list.get(list.size() - 1));//获取最大的人
       // list_person.add(p);
        for (int i = 0; i < list.size(); i++) {
            Person person = ((Person) list.get(i));
            if (person.getNumber() == p.getNumber()) {
                list_person.add(person);
            }
            System.out.println("姓名：" + person.getName() + "，编号：" + person.getNoID() + ",票数：" + person.getNumber());
        }
        System.out.println("投票结束！");


        System.out.println("投票的最终结果是：");
        if (list_person.size() == 1) {
            System.out.println(list_person.get(0).getName() + "同学，最后以" + list_person.get(0).getNumber() + "票当选班长");
        } else {
            for (int i = 0; i < list_person.size(); i++) {
                System.out.print(list_person.get(i).getName()+"," );
            }
            System.out.println( "同学，票数相同为：" +list_person.get(0).getNumber() + ",重新投票");
        }
    }

}
