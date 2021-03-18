package give.me.five.solution.s1;

// Test命名需要放在类命名的最后面
public class ArithmeticTest {

    // public protected 默认 private
    // 像这样的工具类方法用static修饰；
    //加法
    public static float add(float a,float b){
        return a+b;
    }
    //减法
    public static float sub(float a,float b){
        return a-b;
    }
    //乘法
    public static float mul(float a, float b){
        return a * b;
    }
    //乘法
    public static float div(float a, float b) throws Exception{
        try{
            return a / b;
        }catch(Exception e){
            // 打印异常时，将当前的上下文参数也一并打印出来，方便问题定位；
            System.out.println("除法运算异常，被除数：" + a + ", 除数：" + b  + ", msg:" + e);
            throw e;
        }
    }
}
