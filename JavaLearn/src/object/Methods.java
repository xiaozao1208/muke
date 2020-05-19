package object;

public class Methods {

    //**两个数组交换元素 ——输入是两个数组，输出是两个数组
    //  方法总结： 1.方法设计的时候 打印数组元素不是必要的，不需要放在方法体中；
    //           2.方法调用结束后，方法中的方法和参数失效，方法中的引用指向也失效，此时需要返回值保存方法执行结果；
    //            3.如果changeArray方法没有返回值的话，打印输出的数组元素没有交换成功；

    public  int[][]  changeArray(int[] a, int[] b){
        int[] c = a;
            a=b;
            b=c;

        int[][] result={a,b};
        return result;
    }

    //一个数组，头尾元素交换位置； 输入一个数组，输出是一个数组
    //方法总结：1.此方法是元素进行交换，不需要返回值；
    //        2.这里是i是从零开始，i<x.length/2 --没有等于号；
    public void  changeArrayFAL(int[] x){
        //交换的次数是小于等于x.length/2；
        //这里是i是从零开始，i<x.length/2 --没有等于号；
        for(int i=0;i<x.length/2;i++){
            int y= x[i];
            x[i] = x[x.length-1-i];
            x[x.length-1-i]=y;
        }

    }


    //求数组的平均数，输入时一个数组，输出是一个平均值；
    public int avgArray(int[] x){
        int sum= 0;
        for(int i=0;i<x.length;i++){
            sum += x[i];
        }
        int result= sum/x.length;

        return result;
    }

    //下数组中的最大值和最小值；
    //还有个思路：入参是一个数组和最大值或者最小值，返回值是：最大值或最小值，或者最大和最小值一起数组返回
    public int[]  MaxArray(int[] x){
        int max=x[0];
        int min=x[0];
        for(int i=1;i<x.length;i++){
            if(max < x[i]){
                max=x[i];
            }

            if(min > x[i]){
                min=x[i];
            }
        }

       int[] result={max,min};
       return result;
    }

    //设计方法 用例寻找给定的元素是否在数组内存在（Scanner输入）
    //给定条件是：一个数组和一个输入的参数；返回值：是boolean 存在或者不存在
    //方法设置了返回值类型，就必须给返回值；//有可能没有不行。
    public boolean  exist( int x,int[] y){
        boolean f=false;
        for(int i=0;i<y.length;i++){
           if(y[i]==x){
               f=true;
               break;
           }
        }
        return  f;
    }


    //合并两个数组
    public int[]  together(int[] a,int[] b){
        int[] c= new int[a.length+b.length];
        for(int i=0;i<a.length+b.length;i++){
            if(i<a.length){
                c[i]=a[i];
            }
            if(i>=a.length){
                c[i]=b[i-a.length];
            }

        }
        return c;
    }



    //**给定一个数组a{1,2,3,9,4,5},按照数组中的最大值位置，将数组拆分成两个{1,2,3}，和{4,5}

    /**
     *1.找最大值的时候 最大值和最大值位置可以一起找出来；不需要分两步来执行；
     * 2.拆分数组，将大数组拆分放入小数组的时候，建议使用小循环；使用大循环有下标为负数的异常;
     * 3.填充元素进入b的时候，for(int i=0;i<b.length;i++){b[i]=x[index+i+1];}  i-->index+i+1 去掉中间最大值的元素
     *
     */
    public  int[][]  part(int[] x) {
            //1.先找到最大值的位置和位置
            int max = x[0];
            int index=0;
            for (int i = 1; i < x.length; i++) {
                if (x[i] >max) {
                    max = x[i];
                    index=  i;
                }
            }

            //2.新建两个小数组
            int[] a = new int[index];
            int[] b = new int[x.length - index - 1];

            //3.将数据放入新的小数组中
           for(int i=0;i<a.length;i++){
               a[i]=x[i];
           }
           for(int i=0;i<b.length;i++){
               b[i]=x[index+i+1];
           }

           int[][] result ={a,b};
           return result;
    }

    //*7.给定一个数组a{1,2,3,0,0,4,5,0,6,0,7},去掉数组中的0元素；(创建一个新的数值，短的，0去掉)
    // 输入一个数组，返回值一个数组；
   public  int[] Zero(int[] x,int element){
        //1.先创建一个长的数组，然后创建一个短的数组截取掉0的部分
        int[] newL=new int[x.length];
        int count=0;//记录非删除元素的个数

       //2.将不是0的元素放入新建的数组中，同时统计出数组的长度；
        for(int i=0;i<x.length;i++){
            if(x[i] !=element){
                newL[count]=x[i];
                count ++;
            }
        }

        //3.新建一个短的数组，将newL中的元素放进去，后面为0的不要；
        int[] newS=new int[count]; //实际短数组的长度-结果数组
        for(int i=0;i<newS.length;i++){
            newS[i]=newL[i];
        }

        newL=null;//释放newL数组的空间；
        return newS;
    }

    public  int[] Zero2(int[] x,int num){

      //先统计出数组的长度
        int count=0;//记录非删除元素的个数
        for(int i=0;i<x.length;i++){
            if(x[i] !=num){
                count ++;
            }
        }

        //index控制新索引的变化
        int index=0;
        int[] newS=new int[count]; //实际短数组的长度-结果数组
        for(int i=0;i<x.length;i++){
            if(x[i] !=num){
                newS[index]=x[i];
                index ++;
            }
        }

        return newS;
    }



    //*** 8、创建一个数组 存储2-100之间的素数
    public  int[]  findSu(int a,int b){
            //先判断 a和b满足 b>a
            if(a>b){
                System.out.println("a值大于b值，输入的值不正确");
                return null;
            }
            if(a<2){
                System.out.println("输入正确的数据范围，大于等于2的正整数");
                return null;
            }

            //先统计出100以内质数的个数//利用循环将质数找出来，并且放入数组中
            int[] newL = new int[((b-a)/2)];
            int count=0;

            for(int i=a;i<=b;i++){
                boolean f=false;
                for(int j=2;j<=i/2;j++){
                    if(i%j ==0){
                       f=true; //这个数不是质数
                        break;
                    }
                    //break;//放在外面不对！！
                }

                if(!f){
                    newL[count]=i; //这个数是质数
                    count ++; //统计出质数的个数
                }
            }

            int[] newS= new int[count];
            for(int j=0;j<newS.length;j++){
                newS[j]=newL[j];
            }

            return newS;


    }

    //9、设计一个方法，用来给数组元素排序（冒泡排序算法）
    // 输入数组，升序还是降序；输出：无；交换元素位置； 可以不用输出；
    public void  MaoSort(int[] x,boolean f) {
        //f为true的时候是升序； f为false的时候是降序；
        for (int j=1;j<x.length;j++) {//控制循环的次数
            for (int i = x.length - 1; i >= j; i--) {//此循环是一轮的比较，如果最后面的比前面的数字小，则进行交换，否则不交换；
                //分析：什么情况下进行元素的互换!!
                if((f==true && x[i] < x[i-1]) || (f==false && x[i] > x[i-1])){
                    int temp = x[i];
                    x[i] = x[i - 1];
                    x[i - 1] = temp;
                }

            }
        }

    }

    //10、设计一个方法 用来实现用户登录认证，二位数组当做小数据库
    //dataBox当做一个属性，私有的属性；
    private String[][] dataBox = {{"lijuan","123456"},{"小七","111111"},{"zhangsan","666"}};
    public  String   loading(String userName,String password){
        String result="用户名或者密码错误！！";
        for(int i=0;i<dataBox.length;i++){
            if(dataBox[i][0].equals(userName)){
                if(dataBox[i][1].equals(password)){
                   result="登录成功！！";
                }
                break;//优化性能的，此处可以加break;
            }
        }
        return result;
    }

}
