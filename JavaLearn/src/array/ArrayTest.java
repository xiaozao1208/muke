package array;

public class ArrayTest{

    public static void main(String[] args) {
        int[] array = new  int[]{10,20,30,40,50};

        int value1=array[0];
        //int value2=array[5];
        //ArrayIndexOutOfBoundsException  下标越界异常；

        System.out.println(value1);
        //System.out.println(value2);

        //创建一个数组，用来存储1-100以内的偶数；
        int[] saveNum =new  int[50];
        for(int i=0;i<= saveNum.length-1;i++){
            saveNum[i] =2*i + 2;
        }

        for(int v:saveNum){
            System.out.println(v);
        }
    }

}
