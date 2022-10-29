package Teacherq;

public class Teacher implements Comparable<Teacher> {
    private String no;
    private String name;
    private double salary;
    public Teacher(String no, String name, double salary) {
        this.no = no;
        this.name = name;
        this.salary = salary;
    }
    public Teacher() {
    }public String getNo() {
        return no;}
    public void setNo(String no) {
        this.no = no;}
    public String getName() {
        return name;}
    public void setName(String name) {
        this.name = name;}
    public double getSalary() {
        return salary;}
    public void setSalary(double salary) {
        this.salary = salary;}
    public String toString(){
        return "[工号:"+no+",姓名："+name+",工资："+salary+"]";}
    @Override
    public int compareTo(Teacher teacher) {
        return this.getNo().compareTo(teacher.getNo());
    }
}
