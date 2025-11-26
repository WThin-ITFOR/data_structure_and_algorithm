/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.dsa.recursion;

/**
 *
 * @author ThinYuWai
 */
public class SumOfDigit {
    static int sum(int n){
        if ( n < 10 ) {
            return n;
        }
        else {
            return (n%10) + sum(n/10);
        }
    }
}
