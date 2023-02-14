package org.wcci;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

class StringProblemsTest {

    private StringProblems underTest;

    @BeforeEach
    void setUp() {
        underTest = new StringProblems();
    }

    @Test
    void smallestStringSorter() {
        assertAll(
                () -> assertThat(underTest.smallestStringSorter("two", "fifteen")).isEqualTo("two"),
                () -> assertThat(underTest.smallestStringSorter("", "tomorrow")).isEqualTo("tomorrow"),
                () -> assertThat(underTest.smallestStringSorter("zizzer", "zazzer")).isEqualTo("zizzerzazzer")
        );
    }

    @Test
    void evenUpperCaseOddLowerCase() {
        assertAll(
                () -> assertThat(underTest.evenUpperCaseOrOddLowerCase("Hello")).isEqualTo("hello"),
                () -> assertThat(underTest.evenUpperCaseOrOddLowerCase("Zizzer Zazzer Zuzz")).isEqualTo("ZIZZER ZAZZER ZUZZ")
        );
    }

    @Test
    void stringCombiner() {
        assertAll(
                () -> assertThat(underTest.stringCombiner("Hello", "There")).isEqualTo("HelloThere"),
                () -> assertThat(underTest.stringCombiner("Zizzer","zazzer")).isEqualTo("zazzerZizzer")
        );
    }

    @Test
    void left2() {
        assertAll(
                () -> assertThat(underTest.left2("Hello")).isEqualTo("lloHe"),
                () -> assertThat(underTest.left2("java")).isEqualTo("vaja"),
                () -> assertThat(underTest.left2("Hi")).isEqualTo("Hi")
        );
    }
}