package pro.sky.java.course2.calculator1.service;

import org.jetbrains.annotations.NotNull;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

@org.springframework.stereotype.Service
public class ServiceImplTest extends ServiceImpl {
    @NotNull
    public static Stream<Arguments> provideParamForMinusTest() {
        return Stream.of(
                Arguments.of(5, 4, 5 + " - " + 4 + " = " + 1),
                Arguments.of(0, 4, 0 + " - " + 4 + " = " + -4),
                Arguments.of(20, 0, 20 + " - " + 0 + " = " + 20),
                Arguments.of(-20, -30, -20 + " - " + -30 + " = " + 10)
        );
    }

    @NotNull
    public static Stream<Arguments> provideParamForPlusTest() {
        return Stream.of(
                Arguments.of(5, 4, 5 + " + " + 4 + " = " + 9),
                Arguments.of(0, 4, 0 + " + " + 4 + " = " + 4),
                Arguments.of(20, 0, 20 + " + " + 0 + " = " + 20),
                Arguments.of(-5, -2, -5 + " + " + -2 + " = " + -7)
        );
    }

    @NotNull
    public static Stream<Arguments> provideParamForMultiplyTest() {
        return Stream.of(
                Arguments.of(5, 4, 5 + " * " + 4 + " = " + 20),
                Arguments.of(0, 4, 0 + " * " + 4 + " = " + 0),
                Arguments.of(-5, 2, -5 + " * " + 2 + " = " + -10),
                Arguments.of(-5, -30, -5 + " * " + -30 + " = " + 150)
        );
    }

    @NotNull
    public static Stream<Arguments> provideParamForDivideTest() {
        return Stream.of(
                Arguments.of(20, 4, 20 + " / " + 4 + " = " + 5),
                Arguments.of(8, -4, 8 + " / " + -4 + " = " + -2),
                Arguments.of(0, 6, 0 + " / " + 6 + " = " + 0)
        );
    }

    @ParameterizedTest
    @MethodSource("provideParamForMinusTest")
    public void getResultMinusTest(int num1, int num2, String result) {
        Assertions.assertEquals(getResultMinus(num1, num2), result);
    }

    @ParameterizedTest
    @MethodSource("provideParamForPlusTest")
    public void getResultPlusTest(int num1, int num2, String result) {
        Assertions.assertEquals(getResultPlus(num1, num2), result);
    }

    @ParameterizedTest
    @MethodSource("provideParamForMultiplyTest")
    public void getResultMultiplyTest(int num1, int num2, String result) {
        Assertions.assertEquals(getResultMultiply(num1, num2), result);
    }

    @ParameterizedTest
    @MethodSource("provideParamForDivideTest")
    public void getResultDivideTest(int num1, int num2, String result) throws IllegalArgumentException {
        Assertions.assertEquals(getResultDivide(num1, num2), result);
    }

    @Test
    public void throwExceptionDivideZeroTest() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> getResultDivide(1, 0));
    }

    int testNum1 = 9;
    int testNum2 = 3;
    String testMinusResult = 9 + " - " + 3 + " = " + 6;
    String testPlusResult = 9 + " + " + 3 + " = " + 12;

    @Test
    public void getResultMinusTest1() {
        Assertions.assertEquals(getResultMinus(testNum1, testNum2), testMinusResult);
    }

    @Test
    public void getResultPlusTest1() {
        Assertions.assertEquals(getResultPlus(testNum1, testNum2), testPlusResult);
    }
}



