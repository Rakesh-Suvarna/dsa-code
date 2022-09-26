package com.programs.mincostconnectropes;

import java.util.*;

public class Solution {
    
    public int minCost(int arr[]){

        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();

        //add all elements to the queue to form a min heap
        for(int i=0; i<arr.length; i++){
            pq.add(arr[i]);
        }
        int cost = 0;
        while(pq.size() > 1){
            //pop top 2 elements and calculate sum
            int x = pq.poll();
            int y = pq.poll();
            int sum = x+y;
            //add the current sum to queue
            pq.add(sum);
            cost += sum;
        }
        return cost;
    }
}