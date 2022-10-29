package Work;

public class MyTime {
    static String zone="东八区";
    private int hour,minute,second;

    public int getHour() {
        return hour;
    }
    public void setHour(int hour) {
        this.hour = hour;
    }
    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    public MyTime(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public MyTime() {
    }
    public void display(){
        System.out.println("时间信息："+zone+":"+hour+":"+minute+":"+second);
    }

    public static void main(String[] args) {
        MyTime t1 = new MyTime();
        t1.setHour(11);
        t1.setMinute(59);
        t1.setSecond(20);
        t1.display();
        MyTime t2 = new MyTime();
        t2.setHour(8);
        t2.setMinute(10);
        t2.setSecond(8);
        t2.display();
    }

}
