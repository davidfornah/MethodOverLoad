package com.sapunka;

public class Main {
    static class Adder {
        static int add(int a, int b) {
            return a + b;
        }
        static int add(int a, int b, int c) {
            return a + b + c;
        }
        static class TestOverLoading {
            public static void main(String[] args) {
                System.out.println("\nOVER METHOD BY CHANGING NUMBER OF ARGUMENT");
                System.out.println(Adder.add(11, 11));
                System.out.println(Adder.add(11, 11, 11));
            }
        }
    }
}


