package array;

/**
 * *9.数组元素的排序（冒泡，快速，选择，希尔...）
 */
public class ArrayTest9 {
    public static void main(String[] args) {
        /**
         * 冒泡排序
         */
        int[]  array ={1,10,2,9,30,7,0,10};
        for(int i=1;i<array.length;i++){ //控制循环的次数
            for(int j=array.length-1;j>=i;j--){//相邻值进行比较 比较的次数是越来越少；此处的j>=i,可以减少比较的次数；
                if(array[j] < array[j-1]){
                    int x = array[j];
                    array[j] = array[j-1];
                    array[j-1]= x;
                }

            }
        }

        for(int v:array){
            System.out.println(v);
        }
    }
}
