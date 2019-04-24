package com.company;

import java.sql.SQLOutput;
import java.util.Arrays;

/*
public class Main {

    public static void print99(int m){
        for(int i=1;i<=m;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+"*"+i+"="+i*j+" ");
            }
            System.out.println(" ");
        }
    }
    public static void printx(int m){
        for(int i=0;i<m;i++){
            for(int j=0;j<=i;j++){
                System.out.print(" * ");
            }
            System.out.println(" ");
        }
    }
    public static void main(String[] args) {
         */
/*  int[] arr = {1, 2, 3, 4, 5};

           for (int i = 0; i < 3; i++) {
               System.out.println("hh");
           }
           for (int j : arr) {
               System.out.println("q");

            }
        System.out.println(Arrays.toString(arr));

        }*//*

        //print99(9);
        //printx(4);

        double r=10;
        for(double y=-r;y<=r;y+=2) {//从下往上输出所有点的纵坐标，每一行的距离为2
            double a = Math.asin(y / r); //根据纵行坐标y算出角度a(弧度)，因为y=r*sin(a)，所以sin(a)=y/x;
            double x = r * Math.cos(a); //算出x坐标,不解释
            for (double j = -r; j <= r; j++) {//算出来的x坐标是正的小数，所以只能是半圆，从每一行的左边循环到右边
                System.out.print(Math.abs(j < 0 ? j + x : j - x) < 0.5 ? '*' : ' ');//既然x是小数的话，那么这个第二次循环的值与x之差小于0.5就可以做到左右各有一星号
            }                                                       //也就是做到左半圆和右半圆各输出了一个星号
            System.out.println();

        }
    }

}*/


public class  Main{

//    public int age=0;
//    public Main grow(){
//        age++;
//       // System.out.println(age);
//        return this;
//        }
//    public static int fn(int n){
//        if(n==0){
//            return 1;
//        }
//        else if(n ==1){
//            return 4;
//        }
//        else {
//            return 2*fn(n-1)-fn(n-2);
//        }
//
//
//    }
        public static void main(String[] args){
//            Main RT=new Main();
//        RT.grow().grow().grow();
//        System.out.println(RT.age);
//        System.out.println(new Main().age);
            //System.out.println(fn(3));

            BaseClass bs=new BaseClass();
            System.out.println(bs.book);
            bs.base();
            bs.test();

            SubClass sc=new SubClass();
            System.out.println(sc.book);
            sc.test();
            sc.Sbu();
            System.out.println("--------------------------------");

            BaseClass bb=new SubClass();
            System.out.println(bb.book);
            bb.test();
            bb.base();
            System.out.println("--------------------------------");
            SubClass cc=(SubClass)bb;
            cc.Sbu();
            cc.test();

        }
}
class BaseClass{
   public int book=6;
   public void base(){
       System.out.println("父类");
   }
   public void test(){
       System.out.println("父类");
   }
    }

class SubClass extends BaseClass{
    public String book="疯狂java";
    public void test(){
        System.out.println("子类重写父类");
    }
    public void Sbu(){
        System.out.println("zilei");
    }

    }
