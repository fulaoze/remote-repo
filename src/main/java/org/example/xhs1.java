package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class fas implements Comparable<fas>{
    int id;
    int likes;
    int collection;
    int support;
    fas(int id,int likes,int collection){
        this.collection=collection;
        this.id=id;
        this.likes=likes;
        this.support=likes+2*collection;
    }

    @Override
    public int compareTo(fas o) {
        if(this.support!=o.support){
            return Integer.compare(o.support,this.support);
        } else if (this.collection!=o.collection) {
            return Integer.compare(o.collection,this.collection);
        }else {
            return Integer.compare(this.id,o.id);
        }
    }
}
public class xhs1 {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int k=scanner.nextInt();
        List<fas>fas=new ArrayList<>();
        for (int i = 1; i <=n ; i++) {
            int likes=scanner.nextInt();
            int collection=scanner.nextInt();
            fas f=new fas(i,likes,collection);
            fas.add(f);
        }
        Collections.sort(fas);
        int []a=new int[k];
        for (int i = 0; i < k; i++) {
            a[k-i-1]=fas.get(i).id;
            System.out.print(fas.get(i).id+" ");
        }
        for (int i = 0; i < k; i++) {
            System.out.print(a[i]+" ");
        }
    }
}
