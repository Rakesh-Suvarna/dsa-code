package main.test.com.programs.twosum;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import main.java.com.programs.twosum.hashset.*;
import main.java.com.programs.twosum.hashmap.*;

public class TwoSumTest {

    TwoSum1 obj1 = new TwoSum1();
    TwoSum2 obj2 = new TwoSum2();
    
    @Test
    public void testTwoSum1(){
    
        int[] result = obj1.twoSum(new int[]{3, 2, 7, 1}, 9);
        assertEquals(result, new int[]{7, 2});
    }
    
    @Test
    public void testTwoSum2(){
    
        int[] result = obj2.twoSum(new int[]{3, 2, 7, 1}, 9);
        
        assertEquals(result, new int[]{1, 2});
    }
}
