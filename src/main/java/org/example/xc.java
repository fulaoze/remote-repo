package org.example;

import java.util.Scanner;

public class xc {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String a=in.next();
        char[] charArray = a.toCharArray();
        int len=charArray.length;
        int res=0;
        for (int i = 0; i < len-2; i++) {
            if(charArray[i]=='y'&&charArray[i+1]=='u'){
                res++;
                i++;
            }
        }
        System.out.println(res);
    }
}
