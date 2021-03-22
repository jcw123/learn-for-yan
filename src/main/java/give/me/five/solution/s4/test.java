/*
package give.me.five.solution.s4;
import java.util.*;

public class test {

        public static void main(String[] args) {

            public static int [] convertDistinctArr(int [] sourceArr) {
                int resultArrSize = 0;
                int [] result = new int [resultArrSize];
                for(int i = 0; i< sourceArr.length; i++) {
                    //如果数据不存在
                    if(!checkDataIsExist(result, sourceArr[i])) {
                        ++resultArrSize;
                        result = Arrays.copyOf(result, resultArrSize);
                        result[resultArrSize-1] = sourceArr[i];
                    }
                }
                return result;
            }

            */
/**
             * 检查结果目标数组中是否有该元素
             *//*

            private static boolean checkDataIsExist(int [] target,int source) {
                //如果目标数组刚初始化，直接放回不存在
                if(target.length < 1) {
                    return false;
                }
                boolean flag = false;
                for(int i = 0; i< target.length; i++) {
                    if(target[i] == source) {
                        flag = true;
                        break;
                    }
                }
                return flag;
            }


                */
/*int[] nums = { 1,1 };
                List<Integer> numList = new ArrayList<Integer>();
                for (int i : nums)
                    numList.add(i);
                Set<Integer> numSet = new HashSet<Integer>();
                numSet.addAll(numList);
                System.out.println(numSet);


            *//*
*/
/*int[] array1 = {1,2,3,4,4};
            int[] array2 = {3,1,4,1,5,9,2,6,5,3,5,8,9,3,9};
            int[] array3 = {1,1,1,1};
            showNonDuplicateArray(array1);
            showNonDuplicateArray(array2);
            showNonDuplicateArray(array3);*//*
*/
/*

        }

        public static void showNonDuplicateArray(int[] a) {
            int[] newArr = new int[a.length];

            int index = 0; // 新数组存储元素索引(或者说无重复的个数)

            outer: for (int i = 0; i < a.length; i++) {
                for (int j = i + 1; j < a.length; j++) {
//当数据重复时,跳出外圈循环

                    if (a[i] == a[j]) {
                        continue outer;

                    }

                }

// 后面没有与当前元素重复的值,保存这个数

                newArr[index] = a[i];

                index++;

            }

// 新数组中存储着无重复的值和后面一些0

            int[] result = new int[index];

            for (int i = 0; i < index; i++) { // 遍历有效值个数

                result[i] = newArr[i];

            }

            System.out.println(Arrays.toString(result));
*//*

        }

    }


*/
