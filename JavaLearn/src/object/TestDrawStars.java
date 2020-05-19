package object;

public class TestDrawStars {
    public static void main(String[] args) {
        /**
         * 1.设计一个方法 用来画星星(控制台输出) 输出4行,每行4颗
         * 2.设计一个方法 用来画星星(控制台输出) 输出4行,直角三角形,第一行一颗,第二行 2颗
         * 3.设计一个方法 用来画星星(控制台输出) 画一个直角三角形,不确定是几行
         * 4.设计一个方法 用来画星星 直角三角形,反向的,几行不确定
         * 5.设计一个方法 用来画星星 几行不确定,直角三角形,方向也不确定;
         */
        DrawStars dr = new DrawStars();
        //画正方形
        //dr.drawingZFX();

        //画直角三角形
       // dr.drawingZJ();


        //直角三角形,不确定是几行
        //dr.drawingNum(3);

        //画反向的直角三角形
        //dr.drawingZJF(5);

        //画直角三角形,输入正向和反向,  false是反向的三角形;
        dr.drawingT(5,false);
    }

}
