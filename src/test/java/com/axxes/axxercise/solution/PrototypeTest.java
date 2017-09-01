package com.axxes.axxercise.solution;

import com.axxes.hackathon.axxercise.exercise.Prototype;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrototypeTest {

    private Prototype prototype = new PrototypeImpl();

    @Test
    public void add_positive_numbers() {
        assertEquals(10, prototype.calculateSum(4, 6));
    }

}