package org.example;

import java.util.Scanner;

public class tx3 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String a=in.next();
        long count=countstr(a);
        System.out.println(count);
    }

    private static long countstr(String s) {
        int l=0;
        int count=0;
        boolean seenr=false;
        for (int right = 0; right < s.length(); right++) {
            char c=s.charAt(right);
            if(c=='r'){
                seenr=true;
            }
            else if(c=='e'&&seenr){
                count+=right-l+1;
            } else if (c=='d') {
                l=right+1;
                seenr=false;

            }
        }
        return count;
    }
}
