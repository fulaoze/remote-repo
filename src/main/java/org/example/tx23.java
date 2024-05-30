package org.example;

import java.util.Scanner;

public class tx23 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int m=scanner.nextInt();
        int k=scanner.nextInt();
        int[]apples=new int[n];
        for (int i = 0; i < n; i++) {
            apples[i]=1;
        }
        int remain=m-n;
        int left=0,right=n-1;
        while (remain>0){
            if(left<k){
                if(right>k&&apples[left]<apples[right]){
                    apples[left]++;
                }
                else {
                    apples[left]+=(remain+1)/2;
                    remain-=(remain+1)/2*2;
                }
                left++;
            }
            if(right>k){
                if(left<k&&apples[right]<apples[left]){
                    apples[right]++;
                }
                else {
                    apples[right]+=(remain)/2;
                    remain-=(remain)/2*2;
                }
                right--;
            }
        }
        System.out.println(apples[k-1]);

    }
}
