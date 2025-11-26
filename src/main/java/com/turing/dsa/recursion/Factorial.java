/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.dsa.recursion;

/**
 *
 * @author ThinYuWai
 */
public class Factorial {
    static int fact (int n) { 
        if ( n == 0) { 
            return 1;
        }
        else {
            return n * fact(n-1);
        }
    }
}
