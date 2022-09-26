package com.programs.kthclosestptstoorigin;

import java.util.*;

public class KthClosest {
    public int[][] kClosest(int[][] points, int k) {
        
        PriorityQueue<int[]> pq = new PriorityQueue<>((x, y) -> y[0] * y[0] + y[1] * y[1] - x[0] * x[0] - x[1] * x[1]);//y[0]^2 + y[1]^2 - x[0]^2 - x[1]^2 
        
        int[][] result = new int[k][2];
        for(int[] x: points){

            pq.offer(x);
            if(pq.size() > k){
                pq.poll();
            }
        }
        int i=0;
        while(i < k){

            result[i++] = pq.poll();
        }
        return result;
    }
}