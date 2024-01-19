package com.alienworkspace.ems.ch04;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

public class FunctionAndThenTest {

    public static void main(String[] args) {
        Function<String, String> sampleAndThen = (s) -> "My name is " + s;
        Function<String, String> sampleAndThen2 = (s) -> s + ". I'm a man.";

        String output = sampleAndThen.compose(sampleAndThen2).apply("Melody");
        System.out.println(output);


        // computeIfAbsent in Action
        List<String> cities = List.of("Birmingham", "Manchester", "London");
        Map<Character, List<String>> cityMap = new HashMap<>();
        cities.forEach(city -> cityMap.computeIfAbsent(city.charAt(0), v -> new ArrayList<>()).add(city));


    }

}
