package constructors;

public class Person {

    public String name;
    public  int age;
    public  String sex;
    {
        System.out.println("我是一个普通的程序块11");
    }

    {
        System.out.println("我是一个普通的程序块22");
    }
    //默认的构造方法 ，不写其他构造方法的时候默认是有的；
    //如果写了其他的构造方法，这个默认的工构造方法需要加上，才能调用；
    public  Person(){
        System.out.println("调用的是无参数构造方法");
    }

    public  Person(String name){
        this.name=name;
    }

    public Person(String name,int age,String sex){
        this();//调用无参数构造方法，必须放在方法的第一行；
        this.name=name;//如果属性与变量重名，this
        this.age=age;
        this.sex=sex;
        System.out.println("调用的是有参数构造方法");

    }

    {
        System.out.println("我是一个普通的程序块33");
    }
}
