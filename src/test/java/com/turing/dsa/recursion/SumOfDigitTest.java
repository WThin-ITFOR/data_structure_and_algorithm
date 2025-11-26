/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.dsa.recursion;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
/**
 *
 * @author ThinYuWai
 */
public class SumOfDigitTest {
    
    @Test
    public void testSumOfDigit() 
    {
        assertEquals(0, SumOfDigit.sum(0));
        assertEquals(1, SumOfDigit.sum(1));
        assertEquals(2, SumOfDigit.sum(2));
        assertEquals(4, SumOfDigit.sum(13));
        assertEquals(5, SumOfDigit.sum(122));
        assertEquals(9, SumOfDigit.sum(1224));
    }
}
