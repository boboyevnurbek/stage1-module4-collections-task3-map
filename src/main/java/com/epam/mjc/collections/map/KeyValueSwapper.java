package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class KeyValueSwapper {
    public Map<String, Integer> swap(Map<Integer, String> sourceMap) {
        Map<String, Integer> map = new HashMap<>();

        sourceMap.forEach((key, value) -> {
            map.merge(value, key, Integer::min);
        });

        return map;
    }
}
