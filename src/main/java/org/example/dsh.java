package org.example;

import java.math.BigDecimal;
import java.util.Scanner;

public class dsh {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a=in.nextInt();
        double x=0;
        x=((1/a)*(1/(a-1)))*2;
        System.out.println(x);
        BigDecimal bg=new BigDecimal(x);
        double res=bg.setScale(10,BigDecimal.ROUND_HALF_UP).doubleValue();
        System.out.print(res);
    }
}
