package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class mq {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        int s= in.nextInt();
        Map<Character,Integer> c=new HashMap<>();
        String b = String.valueOf(in.nextInt());
        char[]b1=b.toCharArray();
        for (int i = 0; i < s; i++) {
            if(c.containsKey(b1[i])){
                c.put((char) in.nextInt(), c.get(in.nextInt())+1);
            }
            else c.put((char) in.nextInt(), 1);
        }
        for(int i=2;i<s;i=i*2){

        }
        System.out.println(9);

        }

}
