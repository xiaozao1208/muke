package object;

public class Person {
    //这个文件是计算机内  画的一张图纸
    //描述计算机里的人类成什么样子

    //属性--静态描述特点包含三个必要的组成部分：修饰符 数据类型 属性名字；
    // 权限修饰符 [特征修饰符] 数据类型  属性名字 [=值]；  []可以不写
    public String name;//全局变量
    public int age;
    public boolean sex;


    //方法-描述可以做什么事情（动作
	//1.无参数,无返回值
    public void eating(){
        System.out.println("人类可以吃饭！");
    };

	//2.无参数有返回值
    public String  tellName(){
		System.out.println("请问你叫什么名字呀?");
		String name="Laura";
        return  name;
    };
	
	//3.有参数 无返回值
    public  void  eatingEve(int num, String something){
        System.out.println("今天吃了"+num+"碗"+something);
    }
	
	//4.有参数 有返回值-买饮料
	public String buyDrink(int money){
		if(money >5){
			return "买一瓶:咖啡";
		}else{
			return "买一瓶:矿泉水";
		}
	}
}
