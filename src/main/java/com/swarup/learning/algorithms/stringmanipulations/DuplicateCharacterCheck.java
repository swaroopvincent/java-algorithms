package com.swarup.learning.algorithms.stringmanipulations;

/**
 * Created by swaroop on 12/12/16.
 */
public class DuplicateCharacterCheck {

    public boolean solution(final String input) {
        if(input != null && input.length() > 0) {
            for(int i=0; i<input.length(); i++) {
                for(int j=i+1; j<input.length(); j++) {
                    if(input.charAt(i) == input.charAt(j)) {
                        return true;
                    }
                }
            }
        } else {
            throw new IllegalArgumentException("Input cannot be null or empty!");
        }
        return false;
    }
}
