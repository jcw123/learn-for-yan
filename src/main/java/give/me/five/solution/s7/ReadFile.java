package give.me.five.solution.s7;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ReadFile {
    public void print(String path) {
        File file = new File(path);
        StringBuilder result = new StringBuilder();
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(file), "UTF-8"));//构造一个BufferedReader类来读取文件
            String s = null;
            int L=1;
            while((s = br.readLine())!=null){//使用readLine方法，一次读一行
                result.append( System.lineSeparator() + s);
                System.out.println("文件第"+L+"行内容为:"+s);
                L++;
            }
            br.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("请输入要读取文件的地址");//D:\liziyan13\Desktop\新建文本文档.txt
        String instr = input.nextLine();
        ReadFile file=new ReadFile();
        file.print(instr);
    }

}

