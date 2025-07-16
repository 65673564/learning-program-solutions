package com.example;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class StringUtilTest {

    StringUtil util = new StringUtil();

    @ParameterizedTest
    @ValueSource(strings = {"madam", "racecar", "level"})
    void testIsPalindrome_True(String input) {
        assertTrue(util.isPalindrome(input));
    }

    @ParameterizedTest
    @CsvSource({
        "hello, 3",
        "chatgpt, 4",
        "raji, 2"
    })
    void testLengthGreaterThan(String input, int minLength) {
        assertTrue(util.hasLengthGreaterThan(input, minLength));
    }
}
