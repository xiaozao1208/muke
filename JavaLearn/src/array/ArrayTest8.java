package array;

//8.创建一个数组 存储2-100之间的素数；
public class ArrayTest8 {
    public static void main(String[] args) {
        /**
         * 思路1：找出100以内的质数；
         * 先用两个循环统计出有多少个质数，也就是确定数组的长度；
         * 其次是用循环将质数赋值给新的数组；
         * 有优缺点：循环次数多，性能差，
         */

        //1.统计出质数的个数；
        int count=0;//统计素数的个数
        for(int i=2;i<=100;i++){
            boolean b =false;//记录状态的开关，如果改变，说明不是质数；如果不变，说明这个数是质数；
            for(int j=2;j<=i/2;j++){
                if(i%j ==0){
                    //System.out.println(i+"不是素数");
                    b=true;
                    break;
                }

            }
            if(b==false){
                //System.out.println(i+"是素数");
                count++ ;
            }
        }
        System.out.println(count);

        //1.2 创建一个长度的数组
        int index=0;
        int[] newArray = new int[count];
        //1.3把质数给方进入
        for(int i=2;i<=100;i++){
            boolean b =false;
            for(int j=2;j<=i/2;j++){
                if(i%j ==0){
                   // System.out.println(i+"不是素数");
                    b=true;
                    break;
                }

            }
            if(b==false){
               //System.out.println(i+"是素数");
               newArray[index] =i ;
               index++;
            }
        }

        //1.4 打印输出数据，不是必须的；
        for(int v :newArray){
            System.out.println(v);
        }
        System.out.println("--------------分隔符————————————————————————————");
        /**
         * 思路二：
         * 先创建一个长度大一些的数组；
         * 利用循环将质数放进新的数组，同时统计出数组的长度；
         * 将数组截取，多余的长度内容（通过新建数组的方式解决）
         * 优缺点：循环次数减少，性能提升；
         */

        //2.1 创建一个长度50的数组
        int[]  arrayLong = new int[50];

        //2.2 利用循环将素数找出来，并且统计出质数的个数
        int index2=0;
        for(int num=2;num<=100;num++){
            boolean b2=false;
            for(int i=2;i<=num/2;i++){
                if(num%i ==0){
                    b2=true;
                    break;
                }
            }
            if(b2 == false){
                arrayLong[index2] = num;
                index2 ++;
            }

        }
        System.out.println(index2);
        //2.3 创建一个短点的新的数组；利用上一步确定的长度；
        int[] arrayShort=new int[index2];
        for(int i=0;i<index2;i++){
            arrayShort[i]=arrayLong[i];
        }
        //2.4 释放长的数组，设置为null ,则为空指针，最终会被垃圾回收。
        arrayLong=null;
        for(int v :arrayShort){
            System.out.println(v);
        }

    }
}
