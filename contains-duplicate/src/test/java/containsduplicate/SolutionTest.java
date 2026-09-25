package containsduplicate;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void returnsTrueWhenValueAppearsTwice() {
        assertTrue(solution.hasDuplicate(new int[] {1, 2, 3, 3}));
    }

    @Test
    void returnsFalseWhenAllValuesAreDistinct() {
        assertFalse(solution.hasDuplicate(new int[] {1, 2, 3, 4}));
    }
}
