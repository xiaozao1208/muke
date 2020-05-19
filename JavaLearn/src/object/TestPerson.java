package object;

public class TestPerson {
    public static void main(String[] args) {
        //1.创建一个对象，人类的对象
        Person p1= new Person();
        Person p2= new Person();
//        p1.name="李世民";
//        p1.age=18;
//        p1.sex=true;
//
//        p2.name="虞姬";
//        p2.age=16;
//        p2.sex=false;
//
//        System.out.println(p1.name+"，性别是："+p1.sex+",年纪是："+p1.age);
//        System.out.println(p2.name+"，性别是："+p2.sex+",年纪是："+p2.age);

        //2.通过对象，调用方法，让方法按照描述的过程执行一遍；
        //1.无参数,无返回值
        p1.eating();
        p2.eating();

        //2.无参数有返回值
        p1.tellName();

        //3.有参数 无返回值
        p1.eatingEve(2,"面条");

        //4.有参数 有返回值-买饮料
        String drinkName1= p1.buyDrink(5);
        String drinkName = p1.buyDrink(10);
        System.out.println(drinkName1);
        System.out.println(drinkName);
    }


}
