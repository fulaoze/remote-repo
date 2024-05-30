package org.example;

import java.util.*;

public class bc {
    static class State{
        int width;
        int height;
        int energy;
        State(int w,int h,int e){
            width=w;
            height=h;
            energy=e;
        }
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int T=scanner.nextInt();
        while (T-->0){
            int N=scanner.nextInt();
            int M=scanner.nextInt();
            int K=scanner.nextInt();
            Queue<State>queue=new LinkedList<>();
            Set<String>visited=new HashSet<>();
            State initial =new State(N,M,0);
            queue.offer(initial);
            visited.add(N+","+M);
            int minEnergy=Integer.MAX_VALUE;
            boolean found =false;
            while (!queue.isEmpty()){
                State current=queue.poll();
                if(current.width*current.height==K){
                    minEnergy=Math.min(minEnergy,current.energy);
                    found=true;
                    continue;
                }
                for (int i = 1; i < current.width; i++) {
                    int newwidth1=i;
                    int newwidth2=current.width-i;
                    int newheight=current.height;
                    if(!visited.contains(newwidth1+","+newheight)&& !visited.contains(newwidth2+","+newheight)){
                        int newenergy=current.energy+(newheight*newheight);
                        queue.offer(new State(newwidth1,newheight,newenergy));
                        queue.offer(new State(newwidth2,newheight,newenergy));
                        visited.add(newwidth1+","+newheight);
                        visited.add(newwidth2+","+newheight);
                    }
                }
                for(int j=1;j<current.height;j++){
                    int newheight1=j;
                    int newheight2=current.height-1;
                    int newwidth=current.width;
                    if(!visited.contains(newwidth+","+newheight1)&&!visited.contains(newwidth+","+newheight2)){
                        int newen=current.energy+(newwidth*newwidth);
                        queue.offer(new State(newwidth,newheight1,newen));
                        queue.offer(new State(newwidth,newheight2,newen));
                        visited.add(newwidth+","+newheight1);
                        visited.add(newwidth+","+newheight2);
                    }
                }
            }
            if(found){
                System.out.println(minEnergy);
            }
            else System.out.println(-1);
        }
    }
}
