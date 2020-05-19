package array;

import java.util.Scanner;

public class ArrayMain {
    public static  void main(String[] args){

        /**
         * String[] args
         * args是一个普通的String数组；
         */
        System.out.println(args.length);
        for(String value: args){
            System.out.println(value);
        }
    }
}
