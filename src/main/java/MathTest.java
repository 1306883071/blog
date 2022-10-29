public class MathTest {
    public static void main(String[] args) {
        double result = Math.sin(Math.PI/4)+Math.log10(25)+Math.pow(11,2.3)+Math.sqrt(13.78);
        System.out.println("第一个数学式子："+result);
        double result1 = Math.random();
        double result2 = Math.random();
        double result3 = Math.random();
        System.out.println("最大随机数："+Math.max(result1,Math.max(result2,result3)));
    }
}
