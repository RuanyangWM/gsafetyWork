import javax.swing.*;
import java.awt.*;
import java.awt.Event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.StringTokenizer;

public class VoteTest implements ActionListener {
    private JFrame frame;
    private JPanel p1,p2,p3,p2_1;
    private JLabel label1,label2,label3;
    private JTextField name,votemess;
    private JTextField schoolVote[];
    private JButton com,con,sure,resh,sort;
    private Checkbox[] checkbox;
    private int[] count;
    private int totalVote,schoolNumber,max,dis,giveup;

    public VoteTest(){
        frame=new JFrame("中国大学排行榜选票系统v1.0");

        p1=new JPanel();
        p2=new JPanel();
        p3=new JPanel();

        label1=new JLabel("首先输入候选学校的名字（数量不超过10，名字之间用逗号分隔):");
        label2=new JLabel("用下面的选择框统计选票：",JLabel.CENTER);
        label3=new JLabel("选举结果：");

        name=new JTextField(10);
        votemess=new JTextField(46);
        schoolVote=new JTextField[10];

        com=new JButton("确认");
        con=new JButton("取消");
        sure=new JButton("确定");
        resh=new JButton("刷新");
        sort=new JButton("排序");

        checkbox=new Checkbox[10];
        p2_1=new JPanel();

        count=new int[10];//记录学校的选票数
        totalVote=0;
        schoolNumber=0;
        max=3;
        dis=0;
        giveup=0;

        init();
    }

    public  void init(){
        frame.setLayout(new GridLayout(3,1));
        frame.add(p1);
        frame.add(p2);
        frame.add(p3);

        p1.setLayout(new BorderLayout());
        p1.add(label1,BorderLayout.NORTH);
        p1.add(name,BorderLayout.CENTER);
        JPanel p1_3;
        p1_3=new JPanel();
        p1_3.add(com);p1_3.add(con);p1_3.add(label2);
        p1.add(p1_3,BorderLayout.SOUTH);

        p2.setLayout(new BorderLayout());
        JPanel p2_2;
        p2_2=new JPanel();
        p2_1.setLayout(new GridLayout(2,5));
        for(int i=0;i<=9;i++){
            checkbox[i]=new Checkbox();
            p2_1.add(checkbox[i]);
        }
        p2_2.add(sure);p2_2.add(resh);p2_2.add(sort);
        p2.add(p2_1,BorderLayout.CENTER);
        p2.add(p2_2,BorderLayout.SOUTH);

        p3.setLayout(new BorderLayout());
        JPanel p3_1,p3_2;
        p3_1=new JPanel();
        p3_2=new JPanel();
        p3_1.add(label3);p3_1.add(votemess);
        p3_2.setLayout(new GridLayout(10,1));
        for(int i=0;i<=9;i++){
            schoolVote[i]= new JTextField();
            p3_2.add(schoolVote[i]);
        }
        ScrollPane scroll=new ScrollPane();
        scroll.add(p3_2);
        p3.add(p3_1,BorderLayout.NORTH);p3.add(scroll,BorderLayout.CENTER);

        com.addActionListener(this);con.addActionListener(this);
        sure.addActionListener(this);resh.addActionListener(this);
        sort.addActionListener(this);

    }

    public void show(){
        frame.pack();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    /* (non-Javadoc)
     * @see java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
     */
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        String s[]=new String[10];
        if(e.getSource()==com){
            p2_1.removeAll();
            String s_name=name.getText();
            //提取候选的名字，名字用逗号（英文逗号或汉文逗号）分隔；
            StringTokenizer fenxi=new StringTokenizer(s_name,",，");
            schoolNumber=fenxi.countTokens();//获取候选的个数
            int i=0;
            while(fenxi.hasMoreTokens()){        //用单选框代表候选，并添加到面板p2_1
                s[i]=fenxi.nextToken();
                p2_1.add(checkbox[i]);
                checkbox[i].setLabel(s[i]);
                i++;
            }
            for(int k=0;k<schoolNumber;k++){
                schoolVote[k].setText(null);
            }
        }else if(e.getSource()==con){
            name.setText(null);
            com.setEnabled(true);
            for(int k=0;k<schoolNumber;k++){
                schoolVote[k].setText(null);
            }
        }else if(e.getSource()==sure){
            totalVote=totalVote+1;
            com.setEnabled(false);
            int number=0;
            for(int k=0;k<schoolNumber;k++){
                if(checkbox[k].getState()){
                    number++;
                }
            }
            if(number>max){
                dis++;
                for(int k=0;k<schoolNumber;k++){
                    checkbox[k].setState(false);
                }
            }else if(number==0){
                giveup++;
            }else if(number>0&&number<=max){
                for(int k=0;k<schoolNumber;k++){
                    if(checkbox[k].getState()){
                        count[k]=count[k]+1;
                        checkbox[k].setState(false);
                        schoolVote[k].setText(checkbox[k].getLabel()+"的得票数："+count[k]);
                    }else{
                        schoolVote[k].setText(checkbox[k].getLabel()+"的得票数："+count[k]);
                    }
                }
            }
            votemess.setText("己统计了："+totalVote+"张选票，其中弃权票："+giveup+"作废票："+dis);
        }else if(e.getSource()==sort){
            for(int i=0;i<schoolNumber;i++){
                for(int j=i+1;j<schoolNumber;j++){
                    if(count[j]>count[i]){
                        String str_temp=schoolVote[j].getText();
                        schoolVote[j].setText(schoolVote[j].getText());
                        schoolVote[j].setText(str_temp);
                        int nnn=count[i];count[i]=count[j];count[j]=nnn;
                    }
                }
            }
            sort.setEnabled(false);sure.setEnabled(false);
        }else if(e.getSource()==resh){
            totalVote=0;
            votemess.setText("己统计了："+totalVote+"张选票");
            name.setText(null);
            com.setEnabled(true);sure.setEnabled(true);sort.setEnabled(true);
            for(int i=0;i<=4;i++){
                count[i]=0;
                schoolVote[i].setText(null);
                p2_1.removeAll();
            }
        }
    }

    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        new VoteTest().show();
    }



}