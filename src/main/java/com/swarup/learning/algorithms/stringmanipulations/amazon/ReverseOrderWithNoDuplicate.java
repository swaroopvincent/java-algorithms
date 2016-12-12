package com.swarup.learning.algorithms.stringmanipulations.amazon;

import java.util.*;

/**
 * Created by swaroop on 12/12/16.
 */
public class ReverseOrderWithNoDuplicate {
    public String solution(final String input) {
        LinkedHashMap<Character, Integer> entryMap = new LinkedHashMap<Character, Integer>();
        if(input != null && input.length() > 0) {
            for(int i=input.length(); i>0; i--) {
                if(entryMap.containsKey(input.charAt(i-1))) {
                    int count = entryMap.get(input.charAt(i-1));
                    count++;
                    entryMap.put(input.charAt(i-1), count);

                } else {
                    entryMap.put(input.charAt(i-1), 1);
                }
            }
        } else {
            throw new IllegalArgumentException("String cannot be empty or null");
        }
        StringBuilder stringBuilder = new StringBuilder();
        Iterator iterator = entryMap.entrySet().iterator();
        while(iterator.hasNext()) {
            Map.Entry entry = (Map.Entry)iterator.next();
            stringBuilder.append(entry.getKey());
            stringBuilder.append(entry.getValue());
        }
        return stringBuilder.toString();
    }

}
