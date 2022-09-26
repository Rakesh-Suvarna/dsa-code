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

    @Test
    public void lengthOfLongestSubstringTwoDistinct(){
        Assert.assertEquals(new com.programs.longestsubstring.SolutionQn2().lengthOfLongestSubstringTwoDistinct("eceba")
        , 3);
        Assert.assertEquals(new com.programs.longestsubstring.SolutionQn2().lengthOfLongestSubstringTwoDistinct("aaa")
        , 3);
    }

    @Test
    public void lengthOfLongestSubstringKDistinct(){

        Assert.assertEquals(new com.programs.longestsubstring.SolutionQn3().lengthOfLongestSubstringKDistinct("eceba", 3)
        , 4);
        Assert.assertEquals(new com.programs.longestsubstring.SolutionQn3().lengthOfLongestSubstringKDistinct("WORLD", 4)
        , 4);
    }

    @Test
    public void maxSlidingWindow(){

        Assert.assertArrayEquals(new com.programs.longestsubstring.SolutionQn4().maxSlidingWindow(new int[]{1,2,7,7,8}, 3)
        , new int[]{7,7,8});
        Assert.assertArrayEquals(new com.programs.longestsubstring.SolutionQn4().maxSlidingWindow(new int[]{1,2,3,1,2,3}, 5)
        , new int[]{3,3});
    }

    @Test
    public void minCost(){

        Assert.assertEquals(new com.programs.mincostconnectropes.Solution().minCost(new int[]{8, 4, 6, 12})
        , 58);
        Assert.assertEquals(new com.programs.mincostconnectropes.Solution().minCost(new int[]{20, 4, 8, 2})
        , 54);
    }

    @Test
    public void KthLargest(){
        com.programs.kthlargestinastream.KthLargest obj = new com.programs.kthlargestinastream.KthLargest(3, new int[]{4, 5, 8, 2});
        Assert.assertEquals(obj.add(3)
        , 4);
        Assert.assertEquals(obj.add(5)
        , 5);
        Assert.assertEquals(obj.add(10)
        , 5);
        Assert.assertEquals(obj.add(9)
        , 8);
    }

    @Test
    public void KthLargest(){
        Assert.assertArrayEquals(new com.programs.kthclosestptstoorigin.KthClosest.kClosest({{1,3},{-2,2}}, 1)
        , new int[][]{{-2, 2}});
        Assert.assertArrayEquals(new com.programs.kthclosestptstoorigin.KthClosest.kClosest({{3,3},{5,-1},{-2,4}}, 2)
        , new int[][]{{3,3},{-2,4}});
    }
}