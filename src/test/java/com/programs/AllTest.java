package com.programs;

import org.junit.Test;
import org.junit.Assert;

public class AllTest{

    @Test
    public void testMaxArea(){

        Assert.assertEquals(new com.programs.containerwithmostwater.Solution().maxArea(new int[]{1,8,6,2,5,4,8,3,7})
        , 49);
    }

    @Test
    public void test2MaxArea(){

        Assert.assertEquals(new com.programs.containerwithmostwater.Solution().maxArea(new int[]{1,1})
        , 1);
    }

    @Test
    public void testLongestSubstring(){

        Assert.assertEquals(new com.programs.longestsubstring.Solution().lengthOfLongestSubstring("abcabcbb")
        , 3);
    }

    @Test
    public void test2LongestSubstring(){

        Assert.assertEquals(new com.programs.longestsubstring.Solution().lengthOfLongestSubstring("bbbbb")
        , 1);
        Assert.assertEquals(new com.programs.longestsubstring.Solution().lengthOfLongestSubstring("pwwkew")
        , 3);
    }
}