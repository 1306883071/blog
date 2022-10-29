package Work;

import java.util.Scanner;

public class TwoZero {

    public static void main(String[] args) {
        float sum;
        final int SUM_NUM=4;
        Student temp = new Student();
        Student s[] = new Student[SUM_NUM];
        for (int i=0;i<s.length;i++){
            s[i] = new Student();
        }
        Scanner scanner = new Scanner(System.in);
        for (int i=0;i<s.length;i++){
            System.out.println("请输入第"+(i+1)+"个同学的姓名：");
            s[i].name=scanner.next();
            sum =0;
            System.out.println("请输入第"+(i+1)+"的同学的4门成绩");
            s[i].java= scanner.nextFloat();
            sum +=s[i].java;
            s[i].english= scanner.nextFloat();
            sum +=s[i].english;
            s[i].html= scanner.nextFloat();
            sum +=s[i].html;
            s[i].ideo= scanner.nextFloat();
            sum +=s[i].ideo;
            s[i].average = sum/4;
        }
        for (int i=1;i<s.length;i++){
            for (int j=0;j<s.length-i;j++){
                if (s[j].average<s[j+1].average){
                    temp =s[j];s[j]=s[j+1];s[j+1]=temp;
                }
            }
        }
        for (int i=0;i<s.length;i++){
            s[i].rank =i+1;
        }
        System.out.println("姓名\tjava\t英语\t网页设计\t思想政治\t平均分\t名次");
        for (int i=0;i<s.length;i++){
            s[i].show();
        }
    }
}
class Student{
    String name;
    float java,english,html,ideo,average,rank;
    public void show(){
        System.out.print(name + "\t"+java+"\t"+english+"\t"+html+"\t");
        System.out.print(ideo+"\t"+average+"\t"+rank);
        System.out.println();
    }
}
