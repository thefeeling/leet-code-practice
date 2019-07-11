package me.daniel.leetcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class LetterCombinationsOfAPhoneNumberTest {

    @Test
    public void test25Equals() {
        // Given
        String input = "25";
        // When
        List<String> result = LetterCombinationsOfAPhoneNumber.letterCombinations("25");
        // Then
        Assert.assertEquals(result, Arrays.asList(
                "aj", "ak", "al",
                "bj", "bk", "bl",
                "cj", "ck", "cl"
            )
        );
    }

    @Test
    public void advanced25Equals() {
        // Given
        String input = "25";
        // When
        List<String> result = LetterCombinationsOfAPhoneNumber.advancedLetterCombinations("25");
        // Then
        Assert.assertEquals(result, Arrays.asList(
                "aj", "ak", "al",
                "bj", "bk", "bl",
                "cj", "ck", "cl"
                )
        );
    }
}