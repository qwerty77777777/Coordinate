package com.company;

import java.util.Scanner;

public class coordinate {

    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        double x=in.nextDouble();
        if (3<=x && x<=8)
            System.out.println(true);
        else System.out.println(false);
    }
}
