package Teacher;

public class Instructor extends Teacher{
    public Instructor() {
        super();
    }

    public Instructor(String no, String name, String sex, int age, String title) {
        super(no, name, sex, age, title);
    }

    @Override
    public double pay(int courseNum) {
        return 2800+45*courseNum;
    }
}
