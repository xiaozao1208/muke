package object;

public class DrawStars {
    /**
     * 1.设计一个方法 用来画星星(控制台输出) 输出4行,每行4颗
     * 2.设计一个方法 用来画星星(控制台输出) 输出4行,直角三角形,第一行一颗,第二行 2颗
     * 3.设计一个方法 用来画星星(控制台输出) 画一个直角三角形,不确定是几行
     * 4.设计一个方法 用来画星星 直角三角形,反向的,几行不确定
     * 5.设计一个方法 用来画星星 几行不确定,直角三角形,方向也不确定;
     */
    public  void  drawingZFX(){
        for(int i=1;i<=4;i++){
            for(int j=1;j<=4;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public  void  drawingZJ(){
        for(int i=1;i<=4;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public  void  drawingNum(int num){
        for(int i=1;i<=num;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }


    public  void  drawingZJF(int num){
        for(int i=1;i<=num;i++){
            for(int j=1;j<=num-i;j++){
                System.out.print(" ");
            }

            for(int j=1;j<=i;j++){
                System.out.print("*");
            }

            System.out.println();
        }
    }

    //f 为true时,是正向的三角形; f=false ,是反向的三角形;
    public void  drawingT(int num,boolean f) {
        for (int i = 1; i<=num; i++) {
            if (f==false) { //f==false ,写两个等于号,一个等于号,无法运行.
                for (int j=1;j<=num-i; j++) {
                    System.out.print(" ");
                }
            }

            for (int j=1;j<=i;j++) {
                System.out.print("*");
            }
            System.out.println();

        }

    }
}
