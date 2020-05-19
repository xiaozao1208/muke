package array;

import java.util.Scanner;

public class TwoArrayTest {
    public static void main(String[] args){
        //声明——初始化静态
        int[][] array = new int[][]{{1,2},{1,3,4,5},{7,8,9}};

        //访问数组内的元素--index
        int value =array[1][3]; //5   [1][3]--第二个数组的第4个元素；
        System.out.println(value);

        //数组的遍历/轮询 --循环嵌套
        for(int i=0;i <array.length;i++){
             int[] arr = array[i];
             for(int j=0;j<arr.length;j++){
                    int val = arr[j];
                 System.out.print(val+"\t");
             }
            System.out.println();
        }

        //增强版的for循环
        for(int[] arr : array){
             for(int val:arr){
                 System.out.print(val+"\t");
             }
            System.out.println();
        }

        int[][] arrayTest = new int[3][2];
                 arrayTest[0][0] =10;
                 arrayTest[0][1] =20;

                 arrayTest[1] = arrayTest[0];
                 arrayTest[0] = new int[4];
                 arrayTest[0][0]=100;
                System.out.println(arrayTest[1][0]); //10

        //模拟班级同学换位置，4列同学，每列有10个
        //创建一个二维数组，用例表示班级里的每一位同学
        int[][]  a = {{1,2,3},{4,5,6},{7,8,9},{10,11,12}};

        //设计每一周交换的次数，周数输入确定
        Scanner input= new Scanner(System.in);
        System.out.println("请输入周数：");
        int week = input.nextInt();
        //四个元素进行交换
        for(int i=1;i<=week;i++){
            int[] x=a[0];
            a[0]=a[1];
            a[1]=a[2];
            a[2]=a[3];
            a[3]=x;
        }

        for(int[] x :a){
            for(int v :x){
                System.out.print(v+"\t");
            }
            System.out.println();
        }

    }
}
