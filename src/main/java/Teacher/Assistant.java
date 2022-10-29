package Teacher;

public class Assistant extends Teacher{
    public Assistant() {
    }

    public Assistant(String no, String name, String sex, int age, String title) {
        super(no, name, sex, age, title);
    }

    @Override
    public double pay(int courseNum) {
        return 2000+35*courseNum;
    }
}
