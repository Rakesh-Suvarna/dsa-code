package com.programs;

import org.junit.Test;
import org.junit.Assert;

public class AllTest{

    @Test
    public void testMaxArea(){

        Assert.assertEquals(new com.programs.containerwithmostwater.Solution.maxArea(new int[9]{1,8,6,2,5,4,8,3,7})
        , 49);
    }

    @Test
    public void test2MaxArea(){

        Assert.assertEquals(new com.programs.containerwithmostwater.Solution.maxArea(new int[2]{1,1})
        , 1);
    }
}