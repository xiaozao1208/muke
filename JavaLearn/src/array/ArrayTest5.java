package array;

/**
 * 5.给定两个数组a{1,2,3},b{5,4} ,合并两个数组；
 * 6.给定一个数组a{1,2,3,9,4,5},按照数组中的最大值位置，将数组拆分成两个{1,2,3}，和{4,5}
 *
 */

public class ArrayTest5 {
    public static void main(String[] args) {
        //5.给定两个数组a{1,2,3},b{5,4} ,合并两个数组；
        //1.创建两个数组
        int[] a={1,2,3};
        int[] b={4,5};

        //2.因为数组长度一旦确定，不能再次改变 需要创建一个新的数组
        int x =a.length+b.length;
        int[] c=new int[x];
        //3.思路二：关注新数组，将新数组填满
        for(int i=0;i<c.length;i++){
          if(i<a.length){
              c[i]=a[i];
          }else{
              c[i]=b[i-a.length];
          }
        }

        //3.思路一：先把a放进数组c,再把b方进去；
       for(int i=0;i<a.length;i++){
           c[i]=a[i];
       }
        //放b数组开始的位置是从 c[a.length+i]开始；
       for(int i=0;i<b.length;i++){
           c[a.length+i]=b[i];
       }

        for(int v :c){
            System.out.println(v);
        }


        //6.给定一个数组a{1,2,3,9,4,5},按照数组中的最大值位置，将数组拆分成两个{1,2,3}，和{4,5}
        //思考：{1,1,2,9,3,8,9,4,5,6,6} 有两个最大值的时候怎么拆分？？
        //1.创建一个数组
        int[] array ={1,2,3,9,4,5};
        int max= array[0];
        int index=0; //数组的索引位置

        //2.先找出最大值，找到他的位置 重点***
        for(int i=1;i<array.length;i++){
            if(array[i]>max){
                max=array[i];
                index = i;
            }
        }
        System.out.println("最大值是："+max);
        System.out.println("最大值的位置是："+index);

        //3.拆成两个数组，新建两个小数组的长度
        int[] newa=new int[index];
        int[] newb=new int[array.length-index-1];

        //方法1：4.填充新的数组 6元素，拆成3个和2个；
        for(int i=0;i<array.length;i++){
            if(i<newa.length){ // i<3
                newa[i]=array[i];
            }
            if(i>newa.length){ // i>3
                newb[i-newa.length-1]=array[i];
            }
        }

        //方法二：分别将两个数组填满
        for(int i=0;i<newa.length;i++){
            newa[i]=array[i];
        }
        for(int i=0;i<newb.length;i++){
            newb[i]=array[index+1+i];
        }


        for(int v : newa){
            System.out.println(v);
        }
        System.out.println("----------------------");
        for(int v :newb){
            System.out.println(v);
        }


        //思考：{1,1,2,9,3,8,9,4,5,6,6} 有两个最大值的时候怎么拆分？？
        //拆分成3个数组，用最大值的位置将分成3个数组；
    }
}
