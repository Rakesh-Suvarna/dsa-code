package com.programs.twosum.hashmap;

import java.util.*;

public class TwoSum2 {

    public static int[] twoSum(int[] nums, final int target){
    
        int[] result = new int[2];
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        
        for(int i=0;i<nums.length;i++){
            int rem = target-nums[i];
            if(map.containsKey(rem)){
            
                result[0]=map.get(rem);
                result[1]=i;
            }else{
            
                map.put(nums[i], i);
            }
        }
        return result;
    }
    
    public static void main(String[] args){
        int nums[] = {3, 2, 7, 1};
        int target = 9;
        twoSum(nums, target);
    }
}