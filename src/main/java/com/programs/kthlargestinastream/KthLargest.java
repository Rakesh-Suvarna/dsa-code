package com.programs.kthlargestinastream;

import java.util.*;

public class KthLargest {

    Queue<Integer> pq;
    int k;
    public KthLargest(int k, int[] nums) {
        pq = new PriorityQueue<Integer>();
        for(int i=0;i<nums.length;i++){
            add(nums[i]);
        }
        k = k;
    }
    
    public int add(int val) {
        
        pq.offer(val);
        if(pq.size() > k){
            pq.poll();
        }
        return pq.peek();
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */