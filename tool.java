package cn.edu.lntu.homeyuyue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class tool {
    //注册
    public static void Registration(ArrayList<People> list1){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入您的电话号码");
        String dh = sc.nextLine();
        if(list1.size()>0) {
            if(pd(list1,dh)){
                System.out.println("您的电话号码已经被使用");
            }else{
                System.out.println("请输入您的密码");
                String mm = sc.nextLine();
                People people = new People(dh,mm);
                list1.add(people);
            }


        }else{
            System.out.println("请输入您的密码");
            String mm = sc.nextLine();
            People people = new People(dh,mm);
            list1.add(people);
        }

    }
    //登录
    public static boolean Login(ArrayList<People> list1){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入您的电话号码");
        String dh = sc.nextLine();
        System.out.println("请输入您的密码");
        String mm = sc.nextLine();
        for(int i = 0;i<list1.size();i++) {
            if(dh.equals(list1.get(i).getDh())){
                if(mm.equals(list1.get(0).getMm())){
                    return true;
                }
            }
        }
        return false;
    }
    //查询
    public static void Displayhome(ArrayList<home> list){
        System.out.println("房间号"+"  "+"面积（m^2）"+"  "+"楼层");
        for(int i =0;i<list.size();i++){
            System.out.println(list.get(i).getName()+"    "+list.get(i).getArea()+"        "+list.get(i).getNof());
        }
    }
    //预约
    public static void Bookhome(ArrayList<home> list){
        System.out.println("请输入您要预约的房号");
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        for(int i = 0;i<list.size();i++){
            if(list.get(i).getName().equals(name)){
                list.remove(i);
                System.out.println("已经成功帮您预约"+name+"号房间");
                break;
            }
        }
    }
    //随机预约
    public static void Randomhome(ArrayList<home> list){
        if(list.size()>0) {
            Random r = new Random();
            int e = r.nextInt(list.size());
            System.out.println("已经成功帮您预约" + list.get(e).getName() + "号房间");
            list.remove(e);
        }else{
            System.out.println("已经没有房屋供您挑选。");
        }
    }
    public static boolean pd(ArrayList<People> list1,String dh){
        if(list1.size()>0) {
            for (int i = 0; i < list1.size(); i++) {
                if (list1.get(i).getDh().equals(dh)) {
                    return true;

                }
            }
        }
        return false;
    }
}
