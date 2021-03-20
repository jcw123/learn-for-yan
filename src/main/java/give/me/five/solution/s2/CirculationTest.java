package give.me.five.solution.s2;

import java.util.Scanner;

public class CirculationTest {
    //实现一个方法，入参n是一个int型，实现1 + 2 + 3 + ... + n之和。考虑n小于0和等于0的情况
    // remark : 方法的首字母不要大小，遵循驼峰式命名规则【lzy:已修改】
    // remark :没有考虑 a < 0的情况  【我当时是这样想的else里面判断A>0,没命中就抛异常了，结果没想到是这样直接抛异常】
    // remark: 像这样纯粹的方法，并没有和外部的类有复杂的交互，可以不用捕获异常，【哦哦，那可以理解为比较基础的才需要抛异常？】
    // remark : 将累加的结果通过方法的返回值返回，不要直接打印出来【这个是由于当时写try catch的时候有点问题】
    public static void circulation(int a) throws Exception {
        int sum=0;
        try {
            if (a == 0) {
                System.out.println("输入的操作数为0不支持累加");
            } else {
                if (a > 0) {
                    for (int i = 1; i <= a; i++) {
                        sum = sum + i;
                    }
                    System.out.println("从1到"+a+"累加结果为："+sum);
                }
            }
        } catch (Exception e) {
            System.out.println("操作数为" + a + ", msg:" + e.getMessage() + "不支持累加");
            throw e;
        }
    }


    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        System.out.print("请输入一个操作数:");
        int firstNum = sc.nextInt();
        CirculationTest.circulation(firstNum);
    }
}
