package com.kodilla.parametrized_test.homework;

import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

public class BmiData {

    static Stream<Arguments> dataToBmi() {
        return Stream.of(
                Arguments.of(155.5, "Good"),
                Arguments.of(166.6, "Bad"),
                Arguments.of(177.7, "Very Bad"));

    }
}
