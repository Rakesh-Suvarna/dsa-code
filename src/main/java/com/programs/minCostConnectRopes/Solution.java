package com.programs.threesum;

import java.util.*;

public class Solution {
    
    public int minCost(int arr[]){

        PriorityQueue<Integer> pq = new PriorityQueue<>(arr);
        int cost = 0;
        while(pq.size() > 1){
            //pop top 2 elements and calculate sum
            int x = pq.poll();
            int y = pq.poll();
            int sum = x+y;
            pq.add(sum);
            cost += sum;
        }
        return cost;
    }
}