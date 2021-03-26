package give.me.five.solution.s5;

import java.util.*;

public class AggregateTest {

    // 实现这个方法，按照readme文件问题描述输出
    public void aggregate(String[] s) {
        Set<String> S = new HashSet<String>();
        for (String n:s){
            S.add(n);
        }
        Map<String,Integer> map = new HashMap<String,Integer>();
        for (String i:S){
            int count=0;
            for(String a:s){
                if (i==a) {
                    count++;
                }
                map.put(i,count);
            }
            System.out.println(i+"="+map.get(i));

        }

    }

    public static void main(String[] args) {
//        String[] a= {"s1","s3","s3","s2"};
//        String[] a= {"s1","s3","s2","s2","s1","S0"};
        System.out.println("请输入要统计的字符串数组，以空格进行分割");
        Scanner in=new Scanner(System.in);
        List<Integer> list=new ArrayList<>();
        while (in.hasNext()){
            String s=in.nextLine();
            String[] str=s.split(" ");
            String[] a=new String [str.length];
            for (int i=0;i<str.length;i++){
                a[i]=str[i];
            }
            AggregateTest A=new AggregateTest();
            A.aggregate(a);
        }

    }
}
