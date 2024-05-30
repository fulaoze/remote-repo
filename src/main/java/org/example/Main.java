package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader a = new BufferedReader(new InputStreamReader(System.in));
         String[] s = a.readLine().split(" ");
        int n =Integer.parseInt(s[0]);
        int x =Integer.parseInt(s[1]);
        int []m=new int[n];
        String[] data = a.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            m[i]=Integer.parseInt(data[i]);
        }
        final ArrayList<Integer> list = new ArrayList<>();
//        int n = Integer.parseInt(a.readLine());

        for (String datum : data) {
            list.add(Integer.parseInt(datum));
//            int ax =
        }
        System.out.println();


        Scanner in =new Scanner(System.in);
        while (in.hasNext()){
            int b=in.nextInt();
            int c= in.nextInt();
            double d=b;
            ArrayList<Integer> arrayList = new ArrayList<>();
            for (int i = b; i <= c; i++) {

                double tem = Math.sqrt(b);
                d+=tem;
            }
            System.out.println(d);
        }
    }

}