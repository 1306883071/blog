package Teacher;

public class Teacher {
    public String no,name,sex,title;
    int age;

    public Teacher(String no, String name, String sex,int age,String title) {
        this.no = no;
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.title = title;
    }

    public Teacher() {
    }
    public double pay(int courseNum){
        return 0;
    }
}
