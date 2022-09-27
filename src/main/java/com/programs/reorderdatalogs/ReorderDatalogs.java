package com.programs.reorderdatalogs;

import java.util.*;

public class ReorderDatalogs {
     
    public String[] reorderLogFiles(String[] logs) {
        
        Comparator<String> comp = new Comparator<String>(){
            @Override
            public int compare(String s1, String s2){

                int s1FirstIndex = s1.indexOf(" ");
                int s2FirstIndex = s2.indexOf(" ");
                if(s1.charAt(s1FirstIndex+1) <= '9'){//digit
                    if(s2.charAt(s2FirstIndex+1) <= '9'){
                        return 0;//both are digits return 0 - indicates maintain the order for digits
                    }else{
                        return 1;
                    }
                }
                if(s2.charAt(s2FirstIndex+1) <= '9'){
                    return -1;
                }
                //string comparision
                int preCompute = s1.substring(s1FirstIndex+1).compareTo(s2.substring(s2FirstIndex+1));//The letter-logs are sorted lexicographically by their contents.
                if(preCompute ==0) {//If their contents are the same, then sort them lexicographically by their identifiers. 
                    return s1.substring(0, s1FirstIndex).compareTo(s2.substring(0, s2FirstIndex));
                }
                return preCompute;
            }
        };
        Arrays.sort(logs, comp);
        return logs;
    }
}