package com.programs.threesum;

import org.junit.Test;
import org.junit.Assert;

public class ThreeSumTest{

    @Test
    public void test3Sum(){
        
        int[] nums = new int[]{-1,0,1,2,-1,-4};
        List<List<Integer>> result = new Solution().threeSum(nums);

        List<List<Integer>> expectedOutput = new ArrayList<List<Integer>>();
        List<Integer> trp1 = new ArrayList<Integer>();
        trp1.add(new Integer(-1));
        trp1.add(new Integer(-1));
        trp1.add(new Integer(2));
        List<Integer> trp2 = new ArrayList<Integer>();
        trp2.add(new Integer(-1));
        trp2.add(new Integer(0));
        trp2.add(new Integer(1));
        expectedOutput.add(trp1);
        expectedOutput.add(trp2);
        
        Assert.assertArraysEquals(result, expectedOutput);
    }
}