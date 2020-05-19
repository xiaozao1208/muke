package object;

public class TestDemo {

    public int changeNum(int x) {
        System.out.println("方法执行前的值"+x);
        x=10;//修改传递进来的参数；
        System.out.println("方法执行后的值"+x);
        return x; //返回值，将X临时的变量空间内的值（值，引用）返回来

    }

    public void changeArray(int[] x) {
        System.out.println("方法执行前的值"+x[0]);//1
        x[0]=10;//修改传递进来的参数；
        System.out.println("方法执行后的值"+x[0]);//10
        //return x[0]; --不需要这个返回值；
        // 返回值，将X临时的变量空间内的值（值，引用）返回来;

    }

    //每一个类中不是必须包含主方法的
    //主方法不属于任何一个类---主方法属于虚拟机
    public static void  main(String[] args){
        TestDemo t=new TestDemo();
        int[] a=new int[]{1,2,3};
        t.changeArray(a);
        //方法 存在堆内存中农，方法执行在临时的栈内存中
        //调用方法是将a的值传递给了x  int[] x=a,此时传过来的是一个引用地址；
        System.out.println("方法执行结束，main方法中的a的值："+a[0]);//10

        /**
         * 形参和实参
         * 形参可以理解为方法执行的临时 变量 空间 x
         * 实参可以理解为方法调用时传递进去的参数 a
         * 方法调用时会将实参的内容传递给形参
         *  如果内容是基本类型 传递的是值  形参改变  实参不变
         *  如果内容是引用类型，传递的是引用，形参改变，实参跟踪改变；
         */



//        //创建一个对象--前提 有一个类的模型
//        // 0.加载类模板的过程
//       TestDemo t=new TestDemo();//堆内存中开辟空间
//        int a=1;
//        a = t.changeNum(a);
//        //调用方法  让方法执行一遍
//        //1.方法存在哪里？ 堆内存的对象空间内
//        //2.方法在哪里执行？ 栈内存中开辟一块临时的方法执行空间
//        System.out.println("方法执行结束后，main输出的a值："+a);
//
//        //形参 x 与 实参 a
//        //想要让a的值，跟着方法内部的形参改变；
    }


}
