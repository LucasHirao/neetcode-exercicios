package containsduplicate;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

class Solution {
    public boolean hasDuplicate(int[] nums) {
        final var set = Set.of(nums);
        return set.size() != nums.length;
    }
}