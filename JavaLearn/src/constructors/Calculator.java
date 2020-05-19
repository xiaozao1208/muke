package constructors;

import java.util.Scanner;

/**
 * 模拟计算  加减乘除； 方法，计算，输出结果
 * Scanner方法的注意点：
 * 1.nextLine()方法会以回车符作为截止  将回车符连同之前的所有字符都读出来，将回车符扔掉
 *  把之前的所有字符组合成一个完整的字符串 交换给我们
 *  比如  郑 中 基 回车，实际输出的效果是 "郑中基"
 * 2.nextInt(),nextDouble(),nextFloat()方法会以回车符作为截止  将回车符之前的所有字符都读出来，将回车符留在队列中，
 *  1 2 3 判断读取的是否为数字，不对会报“InputMisMatchException”
 *  最后将“123”——> 123
 * 3.input 如果没有读取内容，会等待输入状态；
 * 如果读到了一个回车符，将回车符之前的所有字符组合成字符串，将回车符扔掉。
 *
 * //方法1：利用nextLine() 读取一个空的回车符
 *         // input.nextLine();
 *
 * //方法2：利用next() 方法读取字符串，next方法读取方式与nextInt()一样，不读取回车符；
 * //方法3：将账户和密码都统一的使用nextLine() 都比较干净
 *
 * 4.避免问题 都是用nextLine(), 遇到如何将String 类型转换为 Int类型的问题？
 *  基本<——包装类——>String
 *  int a = Integer.parseInt(b);
 *
 */
public class Calculator {
    public static void main(String[] args) {
        Calculator com = new Calculator();
        com.calculatorMethod();

    }

    public  void  calculatorMethod(){
        //需求：
        //1.计算器 可以进行加减乘除计算；2.按等于的时候结束；
        //3.可以循环输入，继续输入第一次的结果，共第二次使用；

        Scanner input = new Scanner(System.in);
        System.out.println("请输入第一个参数：");
        int firstNum =Integer.parseInt(input.nextLine());//位置注意1

        while(true){
        System.out.println("请输入运算符号：+ - * / 四个运算符");
        String symbol=input.nextLine();
        if(symbol.equals("=")){
            System.out.println("运行结束");
            break;
        }
        if(!(symbol.equals("+") ||symbol.equals("-") ||symbol.equals("*") ||symbol.equals("/")) ){
            System.out.println("您输入的符号错误，请输入+ - * /四种运算符号");
            continue;
        }
        //阻塞效果，input这个小人在计算机中的消息队列内等着读取；100

        System.out.println("请输入第二个参数：");
        int secondNum=Integer.parseInt(input.nextLine());

        //这里使用swithch case;
        switch(symbol) {
            case"+" : firstNum=this.add(firstNum,secondNum);
            //第一次运行完毕的结果，存起来，当做第二次开始的firstNum
            //this.add 此处使用的是this
                break;

            case"-" : firstNum=this.subtract(firstNum,secondNum);
                break;

            case"*" : firstNum=this.multiply(firstNum,secondNum);
                break;

            case"/" : firstNum=this.divide(firstNum,secondNum);
                break;

        }
            System.out.println(firstNum);
        }



    }

    public int add(int a,int b){
        int c =a+b;
        return c;
    }

    public int subtract(int a,int b){
        int c =a-b;
        return c;
    }

    public int multiply(int a,int b){
        int c =a*b;
        return c;
    }

    public int  divide(int a,int b){
        int  c=a/b;
        return  c;
    }


}
