package com.github.glistman.text;

import com.github.glistman.text.CamelCase;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CamelCaseTest {

    @Test
    public void snakeToLowerCamelCase() {
        String snakeString = "my_demo_string";
        assertEquals(CamelCase.snakeToLowerCamelCase(snakeString), "myDemoString");
    }

    @Test
    public void snakeToUpperCamelCase() {
        String snakeString = "my_demo_string";
        assertEquals(CamelCase.snakeToUpperCamelCase(snakeString), "MyDemoString");
    }

}