package containsduplicate;

import java.util.HashSet;

class Solution {
    public boolean hasDuplicate(int[] nums) {
        var set = new HashSet<Integer>();
        for (var num : nums) {
            if (!set.add(num))
                return true;
        }
        return false;
    }
}