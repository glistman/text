package com.github.glistman.text;

import java.util.Objects;

public class Strings {

    /**
     * This method makes a trim of string and when it is null return null.
     *
     * @param string some string.
     * @return trimmed string.
     */
    public static String trim(String string) {
        return (string == null) ? null : string.trim();
    }

    /**
     * This method verifies if a string is null or empty, for the validation the trim method is applied.
     *
     * @param string some string.
     * @return boolean with the result of validation.
     */
    public static boolean isNullOrEmpty(String string) {
        return Objects.isNull(string) || string.trim().isEmpty();
    }

    /**
     * This method verifies if a string is not null and is not empty, for the validation the trim method is applied.
     *
     * @param string some string.
     * @return boolean with the result of validation.
     */
    public static boolean nonEmpty(String string) {
        return Objects.nonNull(string) && !string.trim().isEmpty();
    }

}