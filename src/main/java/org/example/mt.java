package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class mt {
    public static void main(String[] args) throws IOException {
        Scanner in =new Scanner(new InputStreamReader(System.in));
        int s=in.nextInt();
        int t=in.nextInt();
        int []res=new int[s];
        for(int i=0;i<s;i++){
            res[i]=in.nextInt();
        }
        Arrays.sort(res);
        int a=0;
        for (int i = 0; i < s; i++) {
            int b=Math.abs(res[i]);
            a=a+b;
            if(a>t){
                System.out.println(i);
                break;
            }
        }
        System.out.println(s);


    }
}
