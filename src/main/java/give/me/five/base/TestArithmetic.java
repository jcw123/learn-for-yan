package give.me.five.base;

public class TestArithmetic {
    //加法
    public float add(float a,float b){
        return a+b;
    }
    //减法
    public float sub(float a,float b){
        return a-b;
    }
    //乘法
    public float mul(float a, float b){
        return a * b;
    }
    //乘法
    public float div(float a, float b){
        try{
            return a / b;
        }catch(Exception e){
            System.out.println(e);
        }
        return a/b;
    }
}
