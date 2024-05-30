package org.example;

import java.util.Scanner;

public class tx2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int m=scanner.nextInt();
        int k=scanner.nextInt();
        int apples=m-n;
        int exl=0;
        int exr=0;
        if(k>1){
            exl=apples/(k-1);
            apples-=exl*(k-1);

        }
        if(apples>0){
            exr=apples/(n-k);
        }
        int app=1+exl+(k<n?exr:0);
        System.out.println(app);
    }
//    private static int calmaxa2(int n, int m, int k){
//        int []
//    }

    private static int calmaxa(int n, int m, int k) {
        int applesDis=n;
        int remainingapp=m-applesDis;
        int applesforxiaom=1;
        if(remainingapp>0){
            int symmtr=remainingapp/2;
            applesforxiaom+=symmtr;
            remainingapp-=symmtr*2;
            if(remainingapp>0&&k<=(n+1)/2){
                applesforxiaom++;
                remainingapp--;
            }
            while (remainingapp>0&&k<=remainingapp){
                applesforxiaom++;
                remainingapp--;
            }
        }
        return applesforxiaom;
    }
}
