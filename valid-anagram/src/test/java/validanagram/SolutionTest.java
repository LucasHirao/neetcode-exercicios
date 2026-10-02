package validanagram;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    // Anagramas válidos
    @Test
    void shouldReturnTrueWhenTwoWordsAreAnagrams() {
        assertTrue(solution.isAnagram("anagram", "nagaram"));
    }

    @Test
    void shouldReturnTrueForClassicExample1() {
        assertTrue(solution.isAnagram("racecar", "carrace"));
    }

    @Test
    void shouldReturnTrueWhenRepeatedCharactersFormAnagram() {
        assertTrue(solution.isAnagram("aab", "aba"));
    }

    @Test
    void shouldReturnTrueForSingleCharacterEqual() {
        assertTrue(solution.isAnagram("a", "a"));
    }

    @Test
    void shouldReturnTrueForMultipleCharactersAllEqual() {
        assertTrue(solution.isAnagram("aaa", "aaa"));
    }

    // Anagramas inválidos - caracteres diferentes
    @Test
    void shouldReturnFalseWhenCharactersAreDifferent() {
        assertFalse(solution.isAnagram("rat", "car"));
    }

    @Test
    void shouldReturnFalseForClassicExample2() {
        assertFalse(solution.isAnagram("jar", "jam"));
    }

    @Test
    void shouldReturnFalseForSingleCharacterDifferent() {
        assertFalse(solution.isAnagram("a", "b"));
    }

    // Comprimentos diferentes
    @Test
    void shouldReturnFalseWhenStringsHaveDifferentLengths() {
        assertFalse(solution.isAnagram("ab", "abc"));
    }

    @Test
    void shouldReturnFalseWhenSecondStringIsLonger() {
        assertFalse(solution.isAnagram("abc", "abcd"));
    }

    @Test
    void shouldReturnFalseWhenFirstStringIsLonger() {
        assertFalse(solution.isAnagram("abcd", "abc"));
    }

    // Mesmos caracteres, frequências diferentes
    @Test
    void shouldReturnFalseWhenCharacterFrequenciesDiffer() {
        assertFalse(solution.isAnagram("aab", "bbb"));
    }

    @Test
    void shouldReturnFalseWhenOneCharHasMoreOccurrences() {
        assertFalse(solution.isAnagram("aa", "a"));
    }

    @Test
    void shouldReturnFalseWhenCharacterCountsDontMatch() {
        assertFalse(solution.isAnagram("ab", "aab"));
    }

    // Casos especiais
    @Test
    void shouldReturnFalseForEmptyStringAndNonEmpty() {
        assertFalse(solution.isAnagram("", "a"));
    }

    @Test
    void shouldReturnTrueForBothEmptyStrings() {
        assertTrue(solution.isAnagram("", ""));
    }

    @Test
    void shouldReturnTrueForComplexAnagram() {
        assertTrue(solution.isAnagram("listen", "silent"));
    }

    @Test
    void shouldReturnFalseForCaseSensitivity() {
        assertFalse(solution.isAnagram("A", "a"));
    }
}
