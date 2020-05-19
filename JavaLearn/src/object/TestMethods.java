package object;

import java.util.Scanner;

public class TestMethods {

    public static void main(String[] args) {

        //1.创建一个Methods对象和 提供两个数组
        Methods  m = new Methods();
//        //两个数组交换元素 ——输入是两个数组，输出是两个数组
//        int[] a =new int[]{1, 3, 5,7};
//        int[] b =new int[]{2, 4, 6};
//
//        //2.调用方法
//        m.changeArray(a,b);
//
//        //3.数据结果查看
//        for(int v:a){
//            System.out.print(v+"\t");
//        }
//        System.out.println();
//        for(int v:b){
//            System.out.print(v+"\t");
//        }


        //2一个数组，头尾元素交换位置
//        int[] x=new int[]{1,3,5,7,8,9,9,10};
//        m.changeArrayFAL(x);
//        for(int v :x){
//            System.out.print(v+"\t");
//        }


        //求一个数组的平均值
//        int[] x1=new int[]{10,100,200,50,10};
//        int result= m.avgArray(x1);
//        System.out.println(result);

        //下数组中的最大值和最小值；
//        int[] x2={1,3,5,7,8,9,9,10,100,100};
//        int[] result=m.MaxArray(x2);
//        int max=result[0];
//        int min=result[1];
//        System.out.println("最大值是："+max+",最小值是："+min);
//

        //合并两个数组：入参两个数组，返回值是合并后的数组
//        //1、新建两个数组；
//        int[] a1={1,2,56,7,8};
//        int[] b1={3,5,6,7,8,100};
//        //2.调用方法
//        int[] c= m.together(a1,b1);
//        //3.输出查看合并后的数组
//        for(int v :c){
//            System.out.print(v+"\t");
//        }

        //设计方法 用例寻找给定的元素是否在数组内存在（Scanner输入）
        //给定条件是：一个数组和一个输入的参数；返回值：是boolean 存在或者不存在
//        int[] x5=new int[]{1,10,20,5,9,8,4,5,3,188};
//        Scanner input= new Scanner(System.in);
//        System.out.println("请输入一个Int数值: ");
//        int num=input.nextInt();
//        boolean f =m.exist(num,x5);
//        System.out.println(f);

//        //拆分数组---方法从新想一个
//        int[] x3={1,3,5,17,8,9,9,10,10,1};
//        int[][] value= m.part(x3);
//        int[] a=value[0];
//        int[] b=value[1];
//        for(int v:a){
//            System.out.print(v+"\t");
//        }
//        System.out.println();
//        for(int v:b){
//            System.out.print(v+"\t");
//        }

        //***7、给定一个数组a{1,2,3,0,0,4,5,0,6,0,7},去掉数组中的0元素
//        int[] x4={1,2,13,0,10,4,5,10,5,10,5};
//        int[] result= m.Zero(x4,5);
//        int[] result2=m.Zero2(x4,5);
//        for(int v:result){
//            System.out.print(v+"\t");
//        }
//        System.out.println();
//        for(int v:result2){
//            System.out.print(v+"\t");
//        }
//

        //8、创建一个数组 存储a-b之间的素数
//        int[] x1= m.findSu(100,2);
//        int[] x2=m.findSu(-1,10);
//        int[] x3=m.findSu(2,100);
//        for(int v:x3){
//            System.out.print(v+"\t");
//        }

        //*** 9. 冒泡排序，排序
        //f为true的时候是升序； f为false的时候是降序；
//        int[] x={6,3,1,3,10,99};
//        m.MaoSort(x,true);
//        for(int v:x){
//            System.out.print(v+"\t");
//        }
//        System.out.println();
//
//        m.MaoSort(x,false);
//        for(int v:x){
//            System.out.print(v+"\t");
//        }

        //10、设计一个方法 用来实现用户登录认证，二位数组当做小数据库
        //方法内的返回值return和输出的区别 ： return返回值可以拿走使用； 输出：控制台可以输出，可以看到，无法拿去使用；
        Scanner input=new Scanner(System.in);
        System.out.println("请输入用户名：");
        String userName=input.nextLine();
        System.out.println("请输入密码：");
        String password=input.nextLine();

        String result=m.loading(userName,password);
        System.out.println(result);
    }
}
