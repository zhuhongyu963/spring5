package com.jpa;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

//@SpringBootTest
class JpaApplicationTests {

    @Test
    void contextLoads() {
        Map<Integer, String> sortedMap1 = new HashMap<>();
        sortedMap1.put(4, "4");
        sortedMap1.put(1, "1");
        sortedMap1.put(2, "2");
        Map<Integer, String> sortedMap =
                sortedMap1.entrySet()
                        .stream()
                        .sorted(Map.Entry.comparingByValue())
                        .collect(Collectors.toMap(Map.Entry::getKey,
                                Map.Entry::getValue,
                                (a, b) -> a, //or throw an exception
                                LinkedHashMap::new));
        System.out.println(sortedMap);
    }

}
