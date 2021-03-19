package give.me.five.solution.s2;

import java.util.Scanner;

public class CirculationTest {
    //实现一个方法，入参n是一个int型，实现1 + 2 + 3 + ... + n之和。考虑n小于0和等于0的情况
    public static void Circulation(int a) throws Exception {
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
        CirculationTest.Circulation(firstNum);
    }
}
