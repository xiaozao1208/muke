package array;

public class ArrayTest4 {
    public static void main(String[] args) {
      //*4.给定一个数组a{1,3,5,7,9,0,2,4,6,8}，找下数组中的最大值和最小值；（极值问题）
      int[] array={1,3,5,7,9,0,2,4,6,8,10};
      int max=array[0];
      int min=array[0];
      //找数组的最大值
      for(int i=1;i<array.length;i++){
          if(array[i]>max){
             max=array[i];
          }

          if(array[i]<min){
              min=array[i];
          }
      }
      System.out.println("数组中的最大值是："+max);
      System.out.println("数组中的最小值是："+min);

    }
}
