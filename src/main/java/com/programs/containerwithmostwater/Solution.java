package com.programs.containerwithmostwater;

import java.util.*;

class Solution {
    public int maxArea(int[] height) {
        
        int fp=0;
        int lp=height.length-1;
        int area=0;
        
        while(fp < lp){

            int currentArea = Math.min(height[fp], height[lp]) * (lp - fp);
            area = Math.max(area, currentArea);
            if(height[fp] > height[lp]){
                lp--;
            }else{
                fp++;
            }
        }
        return area;
    }
}