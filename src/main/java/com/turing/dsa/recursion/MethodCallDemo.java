/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.dsa.recursion;

/**
 *
 * @author ThinYuWai
 */
public class MethodCallDemo {
    static void methodA() {
        System.out.println("Method A");
        methodB();
        System.out.println("Return Back To A");
    }
    
    static void methodB() {
        System.out.println("Method B");
        methodC();
        System.out.println("Return Back To B");
    }
    
    static void methodC() {
        System.out.println("Method C");
    }
    public static void main(String[] args) {
        methodA();
    }
}
