package array;

public class ArrayTest2 {
    public static void main(String[] args) {

        //2.给定一个数组a{1,2,3,4,5,6} 将这个数组中的元素头尾对应互换位置

        int[] a = {1,2,3,4,5,6};
        // a[0] ---a[5]
        // a[1] ---a[4]
        // a[2] ---a[3]
        for(int i=0;i<a.length/2;i++){//控制交换的次数，数组长度的一半
            int temp=a[i];
            a[i]=a[(a.length-1)-i];
            a[(a.length-1)-i]=temp;
        }

        for(int v :a){
            System.out.println(v);
        }

        //3.给定一个数组a{1,2,3,4,5,6}，计算数组所有元素的平均值；
        int[] array= {1,2,3,4,5,6};
        double sum=0;
        for(int i=0;i<array.length;i++){
            sum += array[i];
        }
        double avgArray= sum/array.length;
        System.out.println(avgArray);
    }

}
