package array;

import java.util.Scanner;

//*10.用户的登录认证（用数组当做小数据库，存值，用户验证；）
public class ArrayTest10 {
    public static void main(String[] args) {

        //1需要一个存储真实账户密码的地方（小数组-充当数据库）
       String[] users ={"zhangsan","大山","小一"};
       int[] passwords={123,123456,8888};
        //2.需要验证的用户名和密码；
        Scanner input= new Scanner(System.in);
        System.out.println("请输入用户名：");
        String user=input.nextLine();
        System.out.println("请输入密码：");
        int  password=input.nextInt();

        //3.在数组中比对 3.1 账户密码都对，登录成功； 3.2用户名不存在；3.3 密码错误，登录失败
        Boolean b =false;
        for(int i=0;i<3;i++){
            if(users[i].equals(user)){
                if(passwords[i] ==(password)){
                    System.out.println("登录成功！！");
                    b=true;
                }
                break;

            }
        }
        if(b==false){
            System.out.println("用户名或密码错误");
        }

    }
}
