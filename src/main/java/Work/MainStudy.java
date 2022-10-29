package Work;

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Random;
import java.util.Scanner;

public class MainStudy {

    public static void main(String[] args) throws IOException {
        /*2.7.1*/
//        float Chinese = 120.9f,Math = 99.9f,English = 99.1f,Comprehensive = 222.8f,sum;
//        sum = Chinese + Math + English +Comprehensive;
//        System.out.println("总成绩：" + sum);
//
//        int a=20, b=30,c=100;
//        int max = a;
//        if (a<b){
//            max = b;
//        }
//        if (max<c){
//            max = c;
//        }
//        System.out.println("最大值：" + max);


//         char ch = (char) System.in.read();
//         if (ch >= 65 && ch <= 90){ch +=32;}
//         else if(ch>=97 && ch<=122){ch -=32;}
//         System.out.println(ch);


        //2.9.1
//        int a=100, b=3,c=44444;
//        int max = a;
//        if(b>max)max=b;
//        else if (c>max) {
//            max=c;
//        }
//        System.out.println("最大值：" + max);

//        int a=2,b=0;
//        if (a>=b){
//            System.out.print(b +" "+a);
//        }
//        else {System.out.print(a +" "+b);}
//
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("请输入0-100的合法成绩！！");
//        float score =scanner.nextFloat();
//        if (score >= 60){
//            System.out.println("成绩合格！");
//        }
//        else {
//            System.out.println("成绩不合格！！");
//        }


        //2.10.
//        int x =-4,y;
//        if (x>=1)y=1;
//        else if (x>-1 && x<1) {
//            y=x;
//        }
//        else y=-1;
//        System.out.println("y=" + y);
//
//        int a=675,b=0;
//        while (a !=0){
//            b = b*10+a%10;
//            a/=10;
//        }
//        System.out.println(b);

//        char ch = (char) System.in.read();
//        if ((ch >= 65 && ch <= 90) ||(ch>=97 && ch<=122)){
//            System.out.println(ch + "类别为:字母！");
//        } else if (ch >= 48 && ch <= 57){
//            System.out.println(ch + "类别为:数字！");
//        } else System.out.println(ch + "类别为:其他符号！");
//


        //2.11
//        Scanner scanner = new Scanner(System.in);
//        int year = scanner.nextInt(),month = scanner.nextInt();
//        int day;
//        if (((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) && month ==2 )
//        { System.out.println("天数："+ 29);
//        return;}
//        else {
//            switch (month){
//                case 1:
//                case 3:
//                case 5:
//                case 7:
//                case 8:
//                case 10:
//                case 12:
//                    day = 31;
//                    break;
//                case 4:
//                case 6:
//                case 9:
//                case 11:
//                    day = 30;
//                    break;
//                default:day = 28;
//            }
//            System.out.println("天数：" + day);

//        Scanner scanner = new Scanner(System.in);
//        char operator = (char) System.in.read();
//        int op1 = scanner.nextInt(),op2 = scanner.nextInt(),result;
//        switch (operator){
//            case '+':
//                result = op1 + op2;
//                break;
//            case '-':
//                result = op1 - op2;
//                break;
//            case '*':
//                result = op1 * op2;
//                break;
//            case '/':
//                result = op1 / op2;
//                break;
//            default:
//                throw new IllegalStateException("Unexpected value: " + operator);
//        }
//        System.out.println("结果：" + result);

//        Scanner scanner = new Scanner(System.in);
//        int year = scanner.nextInt(),month = scanner.nextInt(),day = scanner.nextInt(),days=0;
//        if ((month>=1 && month <=12) && (day >= 1 && day <= 31)){
//            switch (month){
//                case 1: days = 0;break;
//                case 2: days = 31;break;
//                case 3: days = 59;break;
//                case 4: days = 90;break;
//                case 5: days = 120;break;
//                case 6: days = 151;break;
//                case 7: days = 181;break;
//                case 8: days = 212;break;
//                case 9: days = 243;break;
//                case 10: days = 273;break;
//                case 11: days = 304;break;
//                case 12: days = 334;break;
//            }
//            days += day;
//            if ((month>2)&&(year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)){
//                days +=1;
//            }
//            System.out.println(year + "年" + month + "月" + day + "日是本年度的第" + days + "天");
//        }
//        else {
//            System.out.println("输入有错误！！");
//        }


        //2.12
//
//        int sum=0,i=2;
//        while (i<100){
//            sum +=i;
//            i+=2;
//        }
//        System.out.println("1--100之间的偶数之和: " + sum);

//
//        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
//        int sum=0,i=1;
//        while (i<n){
//            if (i% 7 == 0){sum +=i;}
//            i++;
//        }
//        System.out.println("1--" + n + "之间能被7整除数之和：" + sum);


//        double distance = 100,height = distance/2;
//        int i=1;
//        while ( i<10){
//            distance = distance + 2*height;
//            height /= 2;
//            i++;
//        }
//        System.out.println("第十次落地共经历：" + distance + "米，第十次反弹高度为：" + height + "米");

//
//        double height = 0.0005;
//        int i = 0;
//        while (height < 8888.43){
//            height *=2;
//            i++;
//        }
//        System.out.println("对折" + i + "次后达到珠峰高度！");


        //2.13


//        Scanner scanner = new Scanner(System.in);
//        int number = scanner.nextInt(),sum=0,temp;
//        temp =number;
//        for (int i= 0;i<3;i++)
//        {
//            int a= number%10;
//            sum = sum + a*a*a;
//            number /= 10;
//        }
//        if (temp == sum){
//            System.out.println(temp + "是水仙数");
//        }
//        else {
//            System.out.println(temp + "不是水仙数");
//        }


//        int i, j, k;
//        k = 10;
//        System.out.println("2-99的同构数：");
//        for (i = 2; i <= 99; i++) {
//            if (i == k) {
//                k *= 10;
//            }
//            j = i * i;
//            if ((j % k) == i) {
//                System.out.println(i + "     " + j);
//            }
//
//        }

//
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("输入第一项和项数：");
//        int a= scanner.nextInt(),b= scanner.nextInt();
//        double sum = 0, number =a;
//        for (int i =1;i<=b;i++){
//            sum +=number;
//            number = Math.sqrt(number);
//        }
//        System.out.println("前"+b+"项和为："+sum);



//        Scanner scanner = new Scanner(System.in);
//        System.out.println("输入项数：");
//        int n = scanner.nextInt();
//        double sum = 0.0,flag =1;
//        for (int i=1;i<=n;i++){
//            sum = sum +flag/i;
//            flag = -flag;
//        }
//        DecimalFormat decimalFormat = new DecimalFormat("0.00");
//        System.out.println("前"+n+"项和为"+decimalFormat.format(sum));


        //2.14

//        Random random = new Random();
//        Scanner scanner =new Scanner(System.in);
//        int number,rand = random.nextInt(10);
//        do {
//            System.out.println("输入数字：");
//            number = scanner.nextInt();
//            if (number == rand){
//                System.out.println("猜对了！");
//            }else if (number > rand){
//                System.out.println("猜大了！");
//            }else System.out.println("猜小了！");
//
//        }while (number != rand);



        //2.15
//        Scanner scanner = new Scanner(System.in);
//        int a = scanner.nextInt(),b = scanner.nextInt(),c = scanner.nextInt();
//        for (int i =10;i < 100;i++){
//            if (i%3 == a && i%5 == b && i%7 == c){
//                System.out.println(i);
//                break;
//            }else continue;
//        }


//
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("输入数字：");
//        int number = scanner.nextInt();
//        int i;
//        for (i=2;i<=number/2;i++){
//            if (number % 2 == 0){
//                break;
//            }
//        }
//        if (i>number/2){
//            System.out.println(number + "是素数！");
//        }else System.out.println(number + "不是素数！");


//
//        int sum = 0 ;
//        for (int i=1;i<=100;i++){
//            if (i%10==3)continue;
//            sum +=i;
//        }
//        System.out.println(sum);



        //2.16
//        Scanner scanner =new Scanner(System.in);
//        System.out.println("输入边长和字符：");
//        int length = scanner.nextInt();
//        String ch = scanner.next();
//        for (int i=1;i<=length;i++){
//            if (i==1 || i==length){
//                for (int j=1;j<=length;j++){
//                    System.out.print(ch);
//                }
//                System.out.println();
//            }else {
//                System.out.print(ch);
//                for (int j=1;j<=length-2;j++){
//                    System.out.print(" ");
//                }
//                System.out.print(ch);
//                System.out.println();
//            }
//        }


//        for (int i=1;i<=9;i++){
//            for (int j=1;j<=i;j++){
//                System.out.print(i+"*"+j+"="+(i*j)+"\t");
//            }
//            System.out.println();
//        }

//        Scanner scanner = new Scanner(System.in);
//        int a = scanner.nextInt(),b = scanner.nextInt(),temp,product;
//        if (a<b){temp = a;a=b;b=temp;}
//        product=a*b;
//        temp = a%b;
//        while (temp !=0){
//            a=b;
//            b=temp;
//            temp = a%b;
//        }
//        System.out.println("最大公约数是："+b+";最小公倍数是："+product/b);


//        Scanner scanner = new Scanner(System.in);
//        System.out.println("输入数字：");
//        int number =scanner.nextInt();
//        for (int i=1;i<=number;i++){
//            for (int j=1;j<=number-i;j++){
//                System.out.print(" ");
//            }
//            for (int j=1;j<=2*i-1;j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//        for (int i= 1;i<=number-1;i++){
//            for (int j=1;j<=i;j++){
//                System.out.print(" ");
//            }
//            for (int j=1;j<=2*(number-i)-1;j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }



        //2。17

//        Scanner scanner =new Scanner(System.in);
//        double [] a = new double[10];
//        double max,min;
//        System.out.println("请输入十个数量：");
//        for (int i=0;i<a.length;i++){
//            a[i]=scanner.nextDouble();
//        }
//        max= a[0];
//        min =a[0];
//        for (int i=1;i<a.length;i++){
//            if (max<a[i]) max = a[i];
//            if (min>a[i]) min =a[i];
//        }
//        System.out.println("最大值："+ max);
//        System.out.println("最小值："+ min);


//        Scanner scanner =new Scanner(System.in);
//        double [] a = new double[8];
//        double temp;
//        System.out.println("请输入8个数量：");
//        for (int i=0;i<a.length;i++){
//            a[i]=scanner.nextDouble();
//        }
//        System.out.println("排序前数据：");
//        for (int i =0;i<a.length;i++){
//            System.out.print(a[i]+"\t");
//        }
//        System.out.println();
//
//        for (int i=0;i<a.length-1;i++){
//
//            for (int j=0;j<a.length-i-1;j++){
//                if (a[j]>a[j+1]){
//                    temp = a[j];
//                    a[j] = a[j+1];
//                    a[j+1] = temp;
//                }
//            }
//        }
//        System.out.println("排序后数据：");
//        for (int i =0;i<a.length;i++){
//            System.out.print(a[i]+"\t");
//        }



        //2。19
        double[] a = new double[4];
        System.out.println("输入数据：");
        input(a);
        System.out.println("数据输入为：");
        output(a);
        System.out.println("最高分："  + max(a));
        System.out.println("最低分：" +min(a));
        System.out.println("平均分：" +average(a));
    }
    public static double max(double score[]){
        double ma = score[0];
        for (int i=1;i<score.length;i++){
            if (ma<score[i])ma=score[i];
        }
        return ma;
    }
    public static double min(double score[]){
        double mi=score[0];
        for (int i=1;i<score.length;i++){
            if (mi>score[i])mi=score[i];
        }
        return mi;
    }
    public static double average(double score[]){
        double sum=0.0;
        for (int i=0;i<score.length;i++) {
            sum += score[i];
        }
        return sum/score.length;
    }
    public static void input(double score[]){
        Scanner scanner = new Scanner(System.in);
        for (int i =0;i< score.length;i++){
            score[i] = scanner.nextDouble();
        }
    }
    public static void output(double score[]) {
        for (int i = 0; i < score.length; i++)
            System.out.print(score[i] + "\t");
        System.out.println();
    }
}
