package com.epam.demo;

import org.apache.commons.lang3.math.NumberUtils;

import java.util.List;

public class Utils {
    public static boolean isAllPositiveNumbers(List<String> args) {

        boolean isAllPositive = true;
        for (String str : args
        ) {

            if (!NumberUtils.isCreatable(str)) {
                return false;
            }
            if (NumberUtils.createNumber(str).doubleValue() < 0) {
                return false;
            }
        }
        return isAllPositive;
    }
}