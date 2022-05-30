package com.juxie;

public class ProjectMain {

    public static void main(String[] args) {
	// write your code here
        final int x = 100;
        final int y = 200;
        System.out.println("Hello world!!!");
        System.out.println("x+y=" + compute(x, y));
    }

    private static int compute(int x, int y) {
        return x + y;
    }
}
