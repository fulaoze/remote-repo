package org.example;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class a {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int[]a=new int[n];

        int[]b=new int[n];
        int[]c=new int[n];
        for (int i = 0; i < n; i++) {
            a[i]=scanner.nextInt();
        }
        for (int i = 0; i < n; i++) {
            b[i]=scanner.nextInt();
        }
        for (int i = 0; i < n; i++) {
            c[i]=scanner.nextInt();
        }
        Map<Integer,Integer>fre=new HashMap<>();
        for(int num:c){
            fre.put(num,fre.getOrDefault(num,0)+1);
        }
        int count=0;
        for (int i = 0; i < n; i++) {
            int sum=a[i]+b[i];
            if(fre.containsKey(sum)&&fre.get(sum)>0){
                count++;
                fre.put(sum,fre.get(sum)-1);
            }

        }
        System.out.println(count);

    }
}
