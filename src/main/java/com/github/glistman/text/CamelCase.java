package com.github.glistman.text;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CamelCase {

    private static Pattern snakePattern = Pattern.compile("_(?<letter>[a-z])");

    public static String snakeToUpperCamelCase(String stringInSnakeFormat) {
        String lowerCamel = snakeToLowerCamelCase(stringInSnakeFormat);

        return Character.toUpperCase(lowerCamel.charAt(0)) + lowerCamel.substring(1);
    }

    public static String snakeToLowerCamelCase(String stringInSnakeFormat) {
        Matcher matcher = snakePattern.matcher(stringInSnakeFormat);
        StringBuffer sb = new StringBuffer();

        while (matcher.find()) {
            matcher.appendReplacement(sb, matcher.group("letter").toUpperCase());
        }

        matcher.appendTail(sb);

        return sb.toString();
    }

}