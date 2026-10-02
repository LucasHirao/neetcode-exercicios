package validanagram;

import java.util.*;

class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        var size = s.length();

        var array1 = s.chars().sorted().toArray();
        var array2 = t.chars().sorted().toArray();

        for (int i = 0; i < size; i++) {
            if (array1[i] != array2[i]) {
                return false;
            }
        }
        return true;
    }
}
