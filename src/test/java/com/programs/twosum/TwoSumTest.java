package main.test.com.programs.twosum;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import main.test.com.programs.twosum.hashset.TwoSum1;
import main.test.com.programs.twosum.hashmap.TwoSum2;

public class TwoSumTest {

    TwoSum1 obj1 = new TwoSum1();
    TwoSum2 obj2 = new TwoSum2();
    
    @Test
    public void testTwoSum1(){
    
        int[] result = obj.twoSum(new int[]{3, 2, 7, 1}, 9);
        assertEquals(result, new int[]{7, 2});
    }
    
    @Test
    public void testTwoSum2(){
    
        int[] result = obj.twoSum(new int[]{3, 2, 7, 1});
        
        assertEquals(result, new int[]{1, 2});
    }
}
