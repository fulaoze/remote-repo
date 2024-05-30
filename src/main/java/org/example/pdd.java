package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class pdd {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int a=in.nextInt();

        String x1= in.next();
        char []x=x1.toCharArray();
//        for (int i = 0; i < a; i++) {
//            x[i]= (char) in.nextInt();
//        }
        int mod=x.length%3;
        int len=x.length/3;
        int res=0;
        if (mod == 0) {
            for (int i = 0; i+2 < x.length; i=i+3) {
                res+=Math.abs(x[i]-'P');
                res+=Math.abs(x[i+1]-'D');
                res+=Math.abs(x[i+2]-'D');
            }
        }
        if(mod==1){
            ArrayList<Character> list = new ArrayList<>();
            for (int i = 0; i < x.length; i++) {
                list.add(x[i]);
            }
            int []n=new int[x.length];
            for (int i = 0; i < x.length; i++) {
                ArrayList<Character> tem=new ArrayList<>(list);
                tem.remove(i);
                n[i]=getres(tem);
            }
            Arrays.sort(n);
            res=n[0];
        }
        System.out.print(len);
        System.out.print(' ' );
        System.out.print(res);
    }
    public static int getres(ArrayList<Character> x){
        int res=0;
        for (int i = 0; i+2 < x.size(); i++) {
            res+=Math.abs(x.get(i)-'P');
            res+=Math.abs(x.get(i+1)-'D');
            res+=Math.abs(x.get(i+2)-'D');
        }
        return res;
    }
}
