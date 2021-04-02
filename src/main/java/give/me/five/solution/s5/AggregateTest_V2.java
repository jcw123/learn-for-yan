package give.me.five.solution.s5;

import java.util.HashMap;
import java.util.Map;

public class AggregateTest_V2 {

    // 实现这个方法，按照readme文件问题描述输出
    public void aggregate(String[] s) {
        if(s == null || s.length == 0) {
            return;
        }
        Map<String, Integer> result = new HashMap<>();
        int count;
        for(String item : s) {
            count = result.getOrDefault(item, 0);
            result.put(item, count + 1);
        }

        for(Map.Entry<String, Integer> entry : result.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
