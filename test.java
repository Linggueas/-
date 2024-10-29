package cn.edu.lntu.homeyuyue;

import aa.Students;

import java.util.ArrayList;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {

        ArrayList<home> list = new ArrayList<>();
        ArrayList<People> list1 = new ArrayList<>();
        //设置初始房屋
        home h1 = new home("201",50,2);
        home h2 = new home("202",60,2);
        home h3 = new home("203",70,2);
        home h4 = new home("204",80,2);
        home h5 = new home("205",90,2);
        home h6 = new home("206",100,2);
        home h7 = new home("207",110,2);
        list.add(h1);
        list.add(h2);
        list.add(h3);
        list.add(h4);
        list.add(h5);
        list.add(h6);
        list.add(h7);
        loop:
        while(true){
            System.out.println("1.用户注册");
            System.out.println("2.用户登录");
            Scanner sc = new Scanner(System.in);
            int st = sc.nextInt();
            if(st == 1){
                tool.Registration(list1);
            }else if(st == 2){
                if(tool.Login(list1)){
                    break loop;
                }else{
                    System.out.println("您的账号或者密码错误");
                }
            }
        }

        while(true){
            System.out.println("---------豪庭雅居小区房屋预售选号系统---------");
            System.out.println("1.显示可选");
            System.out.println("2.预定房屋");
            System.out.println("3.随机预定房屋");
            System.out.println("4.退出");
            Scanner sc = new Scanner(System.in);
            System.out.println("请选择");
            String str = sc.next();
            switch(str){
                case "1"-> tool.Displayhome(list);//查询
                case "2"-> tool.Bookhome(list);//预定房屋
                case "3"-> tool.Randomhome(list);//随机预定房屋
                case "4"-> System.exit(0);//退出
                default -> System.out.println("sb没有这个选项");
            }
        }
    }


}
