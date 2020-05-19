package array;

public class ArrayTest7 {

    public static void main(String[] args) {
        //*7.给定一个数组a{1,2,3,0,0,4,5,0,6,0,7},去掉数组中的0元素；(创建一个新的数值，短的，0去掉)

        //1.需要一个数组
        int[] oldArray ={1,2,3,0,0,4,5,0,6,0,7};

        //2.统计出非零的个数
        int Num=0; //记录非零的个数
        for(int i=0;i<oldArray.length;i++){
            if(oldArray[i] !=0){
                Num ++;
            }
        }
        System.out.println("非零数字的个数是："+Num);

        //3.创建一个新的数组
        int index=0;
        int[] newArray = new int[Num];
        for(int i=0;i<oldArray.length;i++){
            if(oldArray[i] !=0){
                newArray[index]=oldArray[i];
                index ++;
            }
        }
        for(int v :newArray){
            System.out.println(v);
        }

    }
}
