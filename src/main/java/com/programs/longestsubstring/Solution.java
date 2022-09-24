package com.programs.longestsubstring;

import java.util.*;

public class Solution{

    public int lengthOfLongestSubstring(String s) {
        
        int result = 0;
        int start=0;
        int end=0;
        Set<Character> set = new HashSet<Character>();
        while(end < s.length()){

            Character ch = s.charAt(end);
            if(set.contains(ch)){

                set.add(ch);
                result = Math.max(result, set.size());
                end++;
            }else{
                set.remove(s.charAt(start));
                start++;
            }
        }

        return result;
    }
}