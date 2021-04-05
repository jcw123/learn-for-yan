package give.me.five.solution.s8;

import java.util.Scanner;

public class JudgeYear {
    public boolean isLeapYear(int year) {
            if((year%4==0&&year%100!=00)||year%400==0){
                System.out.println(year+"是闰年");
                return true;
            }
            else {
                System.out.println(year+"不是闰年");
                return false;
            }
    }

    public static void main(String[] args) {
        Scanner year=new Scanner(System.in);
        System.out.println("请输入要判断的年份");
        JudgeYear result=new JudgeYear();
        System.out.println(result.isLeapYear(year.nextInt()));
    }
}
