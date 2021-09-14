/*
* UCF COP 3330 Fall 2021 Assignment 16 Solution
* Copyright 2021 Rahel Haque
 */

import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Scanner driver = new Scanner(System.in);
        System.out.println("What is your age?");
        int age = driver.nextInt();

        String message = (age>=16) ? "You are old enough to legally drive." : "You are not old enough to legally drive.";
        System.out.println(message);
    }
}