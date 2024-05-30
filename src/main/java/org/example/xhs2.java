package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class xhs2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int x=scanner.nextInt();
        int []fas=new int[n];
        for (int i = 0; i < n; i++) {
            fas[i]=scanner.nextInt();
        }
        int []boosts=new int[n];
        for (int i = 0; i < n; i++) {
            boosts[i]=fas[i]%2==0?fas[i]/2:fas[i]/2-(fas[i]%2==1?1:0);
        }
        Arrays.sort(boosts);
        reverse(boosts);
        int count=0;
        int totalboo=0;
        for(int boost:boosts){
            totalboo+=boost;
            count++;
            if(totalboo>=x){
                if(totalboo>x){
                    count--;
                }
                break;
            }
        }
        if(totalboo<x){
            count=1;
        }
        System.out.println(count);
    }
    private static void reverse(int[] array){
        int left=0;
        int right=array.length-1;
        while (left < right) {

            int tem=array[left];
            array[left]=array[right];
            array[right]=tem;
            left++;
            right--;
        }
    }
}
