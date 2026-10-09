package twosum;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    // Example test cases from problem statement
    @Test
    void shouldReturnCorrectIndicesForExample1() {
        int[] result = solution.twoSum(new int[]{3, 4, 5, 6}, 7);
        assertArrayEquals(new int[]{0, 1}, result);
    }

    @Test
    void shouldReturnCorrectIndicesForExample2() {
        int[] result = solution.twoSum(new int[]{4, 5, 6}, 10);
        assertArrayEquals(new int[]{0, 2}, result);
    }

    @Test
    void shouldReturnCorrectIndicesForExample3WithDuplicateValues() {
        int[] result = solution.twoSum(new int[]{5, 5}, 10);
        assertArrayEquals(new int[]{0, 1}, result);
    }

    // Boundary: Minimum array size (2 elements)
    @Test
    void shouldHandleMinimumArraySize() {
        int[] result = solution.twoSum(new int[]{1, 2}, 3);
        assertArrayEquals(new int[]{0, 1}, result);
    }

    @Test
    void shouldHandleMinimumArraySizeWithLargeTarget() {
        int[] result = solution.twoSum(new int[]{-10000000, 10000000}, 0);
        assertArrayEquals(new int[]{0, 1}, result);
    }

    // Boundary: Large arrays (only 998 + 999 sums to 1997)
    @Test
    void shouldHandleLargeArraySize() {
        int[] nums = new int[1000];
        for (int i = 0; i < 1000; i++) {
            nums[i] = i;
        }
        int[] result = solution.twoSum(nums, 1997);
        assertArrayEquals(new int[]{998, 999}, result);
    }

    // Negative numbers
    @Test
    void shouldHandleAllNegativeNumbers() {
        int[] result = solution.twoSum(new int[]{-3, -2, -1}, -5);
        assertArrayEquals(new int[]{0, 1}, result);
    }

    @Test
    void shouldHandleMixedPositiveAndNegativeNumbers() {
        int[] result = solution.twoSum(new int[]{7, 1, -3, 4}, 1);
        assertArrayEquals(new int[]{2, 3}, result);
    }

    // Zero in target
    @Test
    void shouldHandleZeroAsTarget() {
        int[] result = solution.twoSum(new int[]{-5, 0, 5}, 0);
        assertArrayEquals(new int[]{0, 2}, result);
    }

    @Test
    void shouldHandleZeroInArray() {
        int[] result = solution.twoSum(new int[]{0, 5, 10}, 10);
        assertArrayEquals(new int[]{0, 2}, result);
    }

    // Duplicates in array
    @Test
    void shouldHandleMultipleDuplicateValues() {
        int[] result = solution.twoSum(new int[]{2, 2, 5, 7}, 4);
        assertArrayEquals(new int[]{0, 1}, result);
    }

    @Test
    void shouldHandleDuplicatesWithDifferentIndices() {
        int[] result = solution.twoSum(new int[]{1, 3, 1, 6}, 9);
        assertArrayEquals(new int[]{1, 3}, result);
    }

    // Extreme values
    @Test
    void shouldHandleMaximumConstraintValues() {
        int[] result = solution.twoSum(new int[]{-10000000, -9999999, 10000000}, 1);
        assertArrayEquals(new int[]{1, 2}, result);
    }

    @Test
    void shouldHandleMinimumConstraintValues() {
        int[] result = solution.twoSum(new int[]{-10000000, -10000000, 5}, -20000000);
        assertArrayEquals(new int[]{0, 1}, result);
    }

    // Ensure smaller index comes first
    @Test
    void shouldReturnSmallerIndexFirst() {
        int[] result = solution.twoSum(new int[]{1, 2, 3, 4}, 6);
        assertArrayEquals(new int[]{1, 3}, result);
        assert result[0] < result[1];
    }

    @Test
    void shouldReturnSmallerIndexFirstWithNegativeNumbers() {
        int[] result = solution.twoSum(new int[]{-4, -1, 0, 3, 5, 7}, 6);
        assertArrayEquals(new int[]{1, 5}, result);
        assert result[0] < result[1];
    }

    // Solution uniqueness (problem guarantees only one valid answer)
    @Test
    void shouldFindSolutionInLargerArray() {
        int[] result = solution.twoSum(new int[]{1, 2, 3, 5, 7, 11}, 9);
        assertArrayEquals(new int[]{1, 4}, result);
    }

    @Test
    void shouldFindSolutionWithComplexPattern() {
        int[] result = solution.twoSum(new int[]{10, 9, 8, 7, 6, 5, 4, 3, 2, 1}, 3);
        assertArrayEquals(new int[]{8, 9}, result);
    }

    // Edge case: target is double a single value, but the same element can't be used twice
    @Test
    void shouldNotUseSameElementTwice() {
        int[] result = solution.twoSum(new int[]{3, 4, 2}, 6);
        assertArrayEquals(new int[]{1, 2}, result);
    }
}
