package give.me.five.solution.s2;

import java.util.Scanner;

public class CirculationTest_V2 {

    //实现一个方法，入参n是一个int型，实现1 + 2 + 3 + ... + n之和。考虑n小于0和等于0的情况
    // 注：方法命名的首字母不要大写，遵循驼峰命名方式
    public static int accumulate(int a) throws Exception {
        if(a  < 0) {
            throw new RuntimeException("a cant't be less than zero, a = " + a);
        }
        if (a == 0) {
            return 0;
        }
        int sum = 0;
        for (int i = 1; i <= a; i++) {
            sum = sum + i;
        }
        return sum;
    }

    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        System.out.print("请输入一个操作数:");
        int firstNum = sc.nextInt();
        int sum = CirculationTest_V2.accumulate(firstNum);
        System.out.println("求和值为：" + sum);
    }
}
