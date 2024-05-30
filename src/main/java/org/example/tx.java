package org.example;

import java.util.Scanner;

public class tx {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int t=scanner.nextInt();
        for (int i = 0; i < t; i++) {
            int n=scanner.nextInt();
            int sum=scanner.nextInt();
            int missing=findm(n,sum);
            System.out.println(missing);
        }
    }

    private static int findm(int n, int sum) {
        int all=0;
        for (int i = 0; i < n; i++) {
            all^=i;
        }
        return all^sum;
    }
}
