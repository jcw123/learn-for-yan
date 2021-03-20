package give.me.five.solution.s3;

public class MultiplicationTables {
    /*99乘法表
1 x 1 = 1
1 x 2 = 2 2 x 2 = 4
1 x 3 = 3 2 x 3 = 6 3 x 3 = 9
...
1 x 9 = 9 2 x 9 = 18 ...            9 x 9 = 81
*/

    public static void main(String[] args) {
        for (int i=1;i<=9;i++){
            for (int j=1;j<=i;j++){
                System.out.print(j+"*"+i+"="+j*i+" ");
            }
            System.out.println();
        }

    }
}
