package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class sss {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int[]array=new int[n];
        for (int i = 0; i < n; i++) {
            array[i]=scanner.nextInt();
        }
        List<Integer>primes=new ArrayList<>();
        List<Integer>noprimes=new ArrayList<>();
        for (int num:array) {
            if(isprime(num)){
                primes.add(num);
            }
            else {
                noprimes.add(num);
            }
        }
        List<Integer>me=new ArrayList<>(primes);
        int i=0;
        while (i<me.size()-1){
            int curr=me.get(i);
            int next=me.get(i+1);
            if(isprime(curr)&&isprime(next)){
                int meval=curr+next;
                me.set(i,meval);
                me.remove(i+1);
            }
            else {
                i++;
            }
        }
        int res=me.size()+noprimes.size();
        System.out.println(res);
    }
    private static boolean isprime(int num){
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
}
