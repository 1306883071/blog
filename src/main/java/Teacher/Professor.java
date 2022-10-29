package Teacher;

public class Professor extends Teacher{
    public Professor(String no, String name, String sex, int age, String title) {
        super(no, name, sex, age, title);
    }

    public Professor() {
        super();
    }

    @Override
    public double pay(int courseNum) {
        return 4000+45*courseNum;
    }
}
