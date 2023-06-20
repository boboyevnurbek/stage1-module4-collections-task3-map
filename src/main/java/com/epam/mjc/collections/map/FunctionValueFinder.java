package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FunctionValueFinder {
    public boolean isFunctionValuePresent(List<Integer> sourceList, int requiredValue) {
        return calculateFunctionMap(sourceList).containsValue(requiredValue);
    }

    private Map<Integer, Integer> calculateFunctionMap(List<Integer> sourceList) {
        HashMap<Integer, Integer> map = new HashMap<>();
        sourceList.forEach(x -> map.put(x, 5 * x + 2));
        return map;
    }
}
