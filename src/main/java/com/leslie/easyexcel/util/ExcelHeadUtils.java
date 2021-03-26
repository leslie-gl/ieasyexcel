package com.leslie.easyexcel.util;

import org.apache.commons.codec.binary.StringUtils;

import java.util.Map;
import java.util.Objects;

/**
 * @author leslie
 * @date 2021/3/17
 */
public class ExcelHeadUtils {

    private ExcelHeadUtils() {
    }

    public static boolean same(Map<Integer, String> predefinedHeadMap, Map<Integer, String> currentHeadMap) {
        Objects.requireNonNull(predefinedHeadMap, "predefinedHeadMap is required");
        Objects.requireNonNull(currentHeadMap, "currentHeadMap is required");
        if (predefinedHeadMap.size() != currentHeadMap.size()) {
            return false;
        }
        for (Map.Entry<Integer, String> currentEntry : currentHeadMap.entrySet()) {
            String currentValue = currentEntry.getValue();
            if (!StringUtils.equals(currentValue, predefinedHeadMap.get(currentEntry.getKey()))) {
                return false;
            }
        }
        return true;
    }
}