package com.dio;

import com.dio.base.Order;

public class MyFirstProgram {
    public static void main(String[] args) {
        Order order = new Order("code 0192328", 5000, null);
        System.out.println(order);
    }
}
