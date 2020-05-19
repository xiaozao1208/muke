package array;

public class ArrayTest1 {
    /**
     * 0.创建一个数组用例存储1-100之间的奇数；
     * 1.给定两个数组a{1,2,3,4} b{5,6,7,8} 将两个数组内得到元素对应位置互换
     * 2.给定一个数组a{1,2,3,4,5,6} 将这个数组中的元素头尾对应互换位置
     * 3.给定一个数组a{1,2,3,4,5,6}，计算数组所有元素的平均值；
     * 4.给定一个数组a{1,3,5,7,9,0,2,4,6,8}，找下数组中的最大值和最小值；（极值问题）
     * 5.给定两个数组a{1,2,3},b{5,4} ,合并两个数组；
     * 6.给定一个数组a{1,2,3,9,4,5},按照数组中的最大值位置，将数组拆分成两个{1,2,3}，和{4,5}
     * 7.给定一个数组a{1,2,3,0,0,4,5,0,6,0,7},去掉数组中的0元素；(创建一个新的数值，短的，0去掉)
     * 8.创建一个数组 存储2-100之间的素数；
     * 9.数组元素的排序（冒泡，快速，选择，希尔...）
     * 10.用户的登录认证（用数组当做小数据库，存值，用户验证；）
     * @param args
     */
    public static void main(String[] args) {

       // 0.创建一个数组用例存储1-100之间的奇数；
        int[] arrayTest1=new  int[50];
        for(int i=0;i<arrayTest1.length;i++){
            arrayTest1[i]=2*i+1;
        }

        //1.给定两个数组a{1,2,3,4} b{5,6,7,8} 将两个数组内得到元素对应位置互换
        //1.1创建2个数组
        int[] a= new int[]{1,2,3,4};
        int[] b= new int[]{5,6,7,8,9,0};

        //方法1：交换数组中对应的元素（循环次数很多次，受长度的限制）
        //1.2 元素对应位置的互换 --每一次交互两个数字，换四次
//        for(int i=0;i<a.length;i++){ //为了控制次数
//            int x=a[i];
//            a[i]=b[i];
//            b[i]=x;
//
//        }

        //思考：如果a,b数组长度不一致，怎么调整？
        //方法二：1.2:a和b的引用地址交换
        int[] temp = a;
        a=b;
        b=temp;

        //1.3 分别输出两个数组元素看一看
        for(int a1:a){
            System.out.println(a1);
        }
        System.out.println("----------------------------");
        for(int b1:b){
            System.out.println(b1);
        }

    }
}