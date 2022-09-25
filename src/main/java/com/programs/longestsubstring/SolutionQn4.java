package com.programs.longestsubstring;

import java.util.*;

public class SolutionQn4{

    /**
     * @param nums: A list of integers.
     * @param k: An integer
     * @return: The maximum number inside the window at each moving.
     */
    public int[] maxSlidingWindow(int[] nums, int k) {
        
        int[] result = new int[nums.length-k+1];
        int c = 0;
        //define a max heap using Priority queue
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>(
            Collections.reverseOrder()
        ); 
        //add k elements to pq
        for(int j=0;j<k;j++){

            pq.add(nums[j]);
        }
        //get maximum for each window and move the window and update heap
        for(int i=k;i<nums.length;i++){
            result[c++] = pq.peek();
            //remove i-k th element
            pq.remove(nums[i-k]);
            //add i th element to pq
            pq.add(nums[i]);
        }
        //add the max for last window
        result[c] = pq.peek();

        return result;
    }
}