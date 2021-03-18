package give.me.five.base;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("hello, lzy");
        System.out.println("1、java中的基本数据类型类型有哪8种:int,long,char,float,double,boolean\nbyte,short这两个忘记了\n");
        System.out.println("2、实现一个类，提供四个方法，分别实现int类型的加、减、乘、除运算。");
        TestArithmetic m = new TestArithmetic();
        Scanner sc=new Scanner(System.in);
        System.out.print("请输入第一个操作数:");
        float firstNum = sc.nextInt();
        System.out.print("请输入第二个操作数:");
        float secondNum = sc.nextInt();
        System.out.println("a+b="+m.add(firstNum,secondNum)+"\na-b="+m.sub(firstNum,secondNum)+"\na*b="+m.mul(firstNum,secondNum)+"\na/b="+m.div(firstNum,secondNum));
    }
}
