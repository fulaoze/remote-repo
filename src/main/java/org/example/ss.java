package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class ss {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int len=in.nextInt();
//        int[]tem=new int[len];
//        for (int i = 0; i < len; i++) {
//            tem[i]=in.nextInt();
//        }
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < len; i++) {
            list.add(in.nextInt());
        }
        int i=0;
        while (i<list.size()-1){
            if(isss(list.get(i))&&isss(list.get(i+1))){
                int j=i+2;
                for (; j < list.size()-1; j++) {
                    if(isss(list.get(j))){
                        continue;
                    }
                    else break;
                }
                boolean c=false;
                for (int k = i; k <j ; k++) {
                    if(isss(list.get(k)+ list.get(k+1))){
                        list.set(i,list.get(k)+ list.get(k+1));
                        list.remove(i+1);
                        c=true;
                        break;
                    }
                }
                if(c){
                    continue;
                }
                list.set(i,list.get(i)+ list.get(i+1));
                list.remove(i+1);
            }
            else {
                i++;
            }
        }
//        list=adda(list);
        System.out.println(list.size());
    }
    private static boolean isss(int num){
        if(num<=1)return false;
        if(num<=3)return true;
        if(num%2==0||num%3==0){
            return false;
        }
        for (int i = 5; i*i <=num ; i+=6) {
            if(num%i==0||num%(i+2)==0){
                return false;
            }
        }
        return true;
    }
    public static boolean isss1(int a){
        int n=2;
        if(a==1)return false;
        for (; n < a; n++) {
            if(a%n==0)break;
        }
        if(n==a){
            return true;
        }
        else return false;
    }
}
