package org.example;

import java.util.Scanner;

// 注意类名必须为 Main, 不要有任何 package xxx 信息
public class ab {
    private static final int Mod=10000007;
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int N=scanner.nextInt();
        int[]array=new int[N];
        for(int i=0;i<array.length;i++){
            array[i]=scanner.nextInt();
        }
        long totalJumpScore=0;
        totalJumpScore=totalLeapScore(array);
        System.out.println(totalJumpScore);

    }
    public static int totalLeapScore(int[]arr){
        int n=arr.length;
        if(n<2){
            return 0;
        }
        int []prefixSum=new int [n+1];
        for(int i=0;i<n;i++){
            prefixSum[i+1]=prefixSum[i]+arr[i];
        }
        int totalScore=0;
        int start=0;
        while(start<n){
            int end =start;
            while(end+1<n&&arr[end]!=arr[end+1]){
                end++;
            }
            for(int length=2;length<=end-start+1;length++){
                for(int i=start;i<=end-start+1;i++){
                    int subarraySum=prefixSum[i+length]-prefixSum[i];
                    totalScore=(totalScore+subarraySum)%Mod;
                }
            }
            start=end+1;
        }
        return totalScore;
    }
}