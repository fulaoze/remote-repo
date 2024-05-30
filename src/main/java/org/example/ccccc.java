package org.example;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.TreeSet;

public class ccccc {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int n=in.nextInt();

        TreeMap<Integer, TreeSet<Integer>>minuteprices=new TreeMap<>();
        in.nextLine();
        for (int i = 0; i < n; i++) {
            String[]input=in.nextLine().split(" ");
            int minute=Integer.parseInt(input[0]);
            int price=Integer.parseInt(input[2]);
            minuteprices.computeIfAbsent(minute,k->new TreeSet<>()).add(price);
        }
        check(minuteprices);

    }

    private static void check(TreeMap<Integer, TreeSet<Integer>> minuteprices) {
        int curre=1;
        Integer lastcheck=null;
        while (curre<=minuteprices.lastKey()){
            TreeSet<Integer>prices=minuteprices.get(curre);
            if(prices==null||prices.isEmpty()){
                curre++;
                continue;
            }
            Integer minp;
            if(lastcheck!=null){
                Map<Integer,TreeSet<Integer>>prev3=minuteprices.subMap(Math.max(1,curre-3),lastcheck);
                if(!prev3.isEmpty()){
                    minp= prev3.values().stream().flatMap(TreeSet::stream).min(Integer::compareTo).get();

                } else {
                    minp = null;
                }
            } else {
                minp = null;
            }
            boolean has=false;
            if(minp!=null){
                has=prices.stream().anyMatch(price->price-minp>=5);
            }
            System.out.println(curre+(has?"Y":"N"));
            lastcheck=curre;
            curre++;
        }
    }
}
