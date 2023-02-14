package org.wcci;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LogicProblemsTest {

    private LogicProblems underTest;

    @BeforeEach
    void setUp() {
        underTest = new LogicProblems();
    }

    @Test
    void squirrelPlay() {
        assertAll(
                () -> assertTrue(underTest.squirrelPlay(70, false)),
                () -> assertTrue(underTest.squirrelPlay(96, true)),
                () -> assertFalse(underTest.squirrelPlay(40, false)),
                () -> assertFalse(underTest.squirrelPlay(35, true))
        );
    }

    @Test
    void nearTen() {
        assertAll(
                ()->assertTrue(underTest.nearTen(12)),
                ()->assertTrue(underTest.nearTen(19)),
                ()->assertTrue(underTest.nearTen(1)),
                ()->assertFalse(underTest.nearTen(15)),
                ()->assertFalse(underTest.nearTen(27)),
                ()->assertFalse(underTest.nearTen(33))
        );
    }
}