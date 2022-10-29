package Employ;
public class Test {
    public static void main(String[] args) {
        Employee employee1= new Employee();
        Employee employee2= new Employee();
        System.out.print("工资多的：");
        if (employee1.workMoney(22,6)>employee2.workMoney(22)){
            System.out.println(employee1.workMoney(22,6));
        }else {
            System.out.println(employee2.workMoney(22));
        }
    }
}
