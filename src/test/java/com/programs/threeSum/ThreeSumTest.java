package com.programs.threesum;

import org.junit.Test;
import org.junit.Assert;
import java.util.*;

public class ThreeSumTest{

    @Test
    public void test3Sum(){
        
        int[] nums = new int[]{-1,0,1,2,-1,-4};
        List<List<Integer>> result = new Solution().threeSum(nums);

        int[][] expectedOutput = new int[][]{{-1, -1, 2}, {-1, 0, 1}};
        
        int[][] array = new int[result.size()][];
        int[] blankArray = new int[0];
        for(int i=0; i < results.size(); i++) {
            array[i] = results.get(i).toArray(blankArray);
        }
        Assert.assertArrayEquals(array., expectedOutput);
    }
}