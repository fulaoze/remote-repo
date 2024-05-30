package org.example;

import java.util.Scanner;

public class hs {
    public static  int isM(String s ,String p){
        int m=s.length();
        int n=p.length();
        boolean[][]dp=new boolean[m+1][n+1];
        dp[0][0]=true;
        for (int j = 2; j <= n; j+=2) {
            if(p.charAt(j-1)=='*'){
                dp[0][j]=dp[0][j-2];
            }
        }
        for (int i = 1; i <=m; i++) {
            for (int j = 1; j <=n ; j++) {
                char sc=s.charAt(i-1);
                char pc=p.charAt(j-1);
                if(sc==pc||pc=='.'){
                    dp[i][j]=dp[i-1][j-1];
                }
                else if(pc=='*'){
                    dp[i][j]=dp[i][j-2];
                    if(sc==p.charAt(j-2)||p.charAt(j-2)=='.'){
                        dp[i][j]=dp[i][j]||dp[i-1][j];
                    }
                }

            }
        }
        return dp[m][n]?1:0;
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String a= in.next();
        String b =in.next();
        int res=isM(a,b);
        System.out.println(res);

    }
}
