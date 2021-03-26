package give.me.five.solution.s4;

import java.util.*;

import static javafx.scene.input.KeyCode.T;

public class DuplicateRemoveTest {
//都有哪几种方法给我讲一下
    // 请补充这个方法的实现， 给定一个整型数组，将其中的重复元素移除，返回一个不包含重复元素的数组
    /*e1：
假设数组为：3,1,2,1;
返回的数组为：3，1，2；


e2：
假设数组为：3，1，3，2，1，0；
返回的数组为：3，1，2，0；

ex：
假设数组为：1，1；
返回的数组为：1；*/
//    public int[] removeDuplicateKey(int[] s) {
//    //plan1:循环判断怎么做？？？
//        int arry[]={s[0]};
//        for (int i=0;i<s.length;i++){
//            for (int j=0;j<=i;j++){
//                if(s[i]==s[j])break;
//                else {
//                    arry[i+1]=s[j];
//                }
//            }
//        }
//        return arry;
//    }

    public  int[] removeDuplicatKey(int[] s){
        Set<Integer> num = new HashSet<Integer>();
        for(Integer n :s) {
            num.add(n);
        }
        int[] result = new int[num.size()];
        int i = 0;
        for (Integer integer : num) {
            result[i++] = integer;
        }
        return result;

    }

//    public int[] removeDuplicatKey(int[] s){
//        List<Integer> list = new ArrayList<Integer>();
//        list.add(s[0]);
//        for(int i=1;i<s.length;i++){
//            if(list.toString().indexOf(s[i]) == -1){
//                list.add(s[i]);
//            }
//        }
//        return (int[])list.toArray(new T[list.size()]);
//    }
    public static void main(String[] args) {
        int []a={3,2,1,3,4};
        DuplicateRemoveTest d=new DuplicateRemoveTest();
        d.removeDuplicatKey(a);
//        for(Integer n : d.removeDuplicatKey(a)) {
//            System.out.println(d.removeDuplicatKey(a));
//        }

        }

}
