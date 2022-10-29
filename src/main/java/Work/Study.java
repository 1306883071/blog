package Work;
//2.20
class Fruit{
    int number;
    String name,unit;
    double price;
    public void input(int num,String na,double pri,String un) {
        number = num;
        name = na;
        price = pri;
        unit = un;
    }
    public void output(){
        System.out.println("编号："+ number+" 名称："+name+" 价格："+ price +unit);
    }

}
public class Study {
    public static void main(String[] args) {
        Fruit fruit = new Fruit();
        fruit.input(1,"苹果",24,"元/kg");
        fruit.output();
    }
}
