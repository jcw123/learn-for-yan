package give.me.five.solution.s10;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import sun.rmi.runtime.Log;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class SetLearn {
    /*Set的基本操作：
boolean add(Object o)      :向集合中加入一个对象的引用
void clear()               :删除集合中所有的对象，即不再持有这些对象的引用
boolean isEmpty()          :判断集合是否为空
boolean contains(Object o) : 判断集合中是否持有特定对象的引用
Iterartor iterator()       : 返回一个Iterator对象，可以用来遍历集合中的元素
boolean remove(Object o)   :从集合中删除一个对象的引用
int size()                 :返回集合中元素的数目
Object[] toArray()         :返回一个数组，该数组中包括集合中的所有元素*/


    public static void main(String[] args) {
        Set<Integer> hashSet = new HashSet<Integer>();
        hashSet.add(3);//向集合中加入一个对象的引用
        hashSet.add(2);
        hashSet.add(5);
        hashSet.add(1);
        //模拟添加一个重复数据
        hashSet.add(2);
        System.out.println("set hashSet.add :" + hashSet + " size : " + hashSet.size());
        //清除数据
        if (hashSet.contains(1)) {
            hashSet.clear();
            System.out.println("set hashSet.clear :" + hashSet + " size : " + hashSet.size());
        }
        if (hashSet.isEmpty()) {
            hashSet.add(11);
            hashSet.add(23);
            Iterator value=hashSet.iterator();
            while (value.hasNext()) {
                System.out.println("set hashSet.Iterator："+value.next());
            }
            hashSet.remove(23);
            System.out.println("set hashSet.remove："+hashSet);
        }
    }
}
