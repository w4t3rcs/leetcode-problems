package org.w4t3rcs.leetcode;

public class RomanInteger {
    public static void main(String[] args) {
        System.out.println(romanToInt("MCMXCIV"));
    }

    public static int romanToInt(String string) { //bad speed & lots of memory usage!
        String result = string;
        if (result.contains("CM")) result = result.replaceAll("CM", "DCCCC");
        if (result.contains("CD")) result = result.replaceAll("CD", "CCCC");
        if (result.contains("XC")) result = result.replaceAll("XC", "LXXXX");
        if (result.contains("XL")) result = result.replaceAll("XL", "XXXX");
        if (result.contains("IX")) result = result.replaceAll("IX", "VIIII");
        if (result.contains("IV")) result = result.replaceAll("IV", "IIII");
        if (result.contains("M")) result = result.replaceAll("M", "DD");
        if (result.contains("D")) result = result.replaceAll("D", "CCCCC");
        if (result.contains("C")) result = result.replaceAll("C", "LL");
        if (result.contains("L")) result = result.replaceAll("L", "XXXXX");
        if (result.contains("X")) result = result.replaceAll("X", "VV");
        if (result.contains("V")) result = result.replaceAll("V", "IIIII");
        return result.length();
    }
}
