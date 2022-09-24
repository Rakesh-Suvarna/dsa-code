package com.programs.longestsubstring;

import java.util.*;

public class SolutionQn2{

    public int lengthOfLongestSubstringTwoDistinct(String s) {

        int firstIdx=0;
        int result = 0;
        Map<Character, Integer> window = new HashMap<Character, Integer>();

        for(int i=0;i<s.length();i++){

            Character ch = s.charAt(i);
            window.put(ch, window.getOrDefault(ch, 0)+1);
            if(window.size() > 2){
                Character chAtFrstIdx = s.charAt(firstIdx);
                int val = window.get(chAtFrstIdx); //move the window
                if(val == 0){
                    window.remove(chAtFrstIdx);
                }else{
                    window.put(chAtFrstIdx, --val);
                }
            }
            result = Math.max(result, i - firstIdx + 1);
        }
        return result;
    }
}