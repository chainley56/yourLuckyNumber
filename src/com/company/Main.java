package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        // write your code here
        perfectRandom LuckyNumber = new perfectRandom(3);
        //System.out.println(LuckyNumber.square(3));
        Scanner name = new Scanner(System.in);
        System.out.println("What is your name?");
        String fName = name.nextLine();
        System.out.println("Nice to meet you " + fName + ", your lucky number is " + LuckyNumber.square(3));

        System.out.println("Enter 0 if you are satisfied, enter 1 if you would like the number said again, enter 2 if you would like to find a lucky number for someone else.");
        int numResponse = name.nextInt();if (numResponse == 0) {
            System.out.println("I hope you like your number!");
        } else if (numResponse == 1) {
            System.out.println(fName + " your lucky number is " + LuckyNumber.square(3));
        } else if (numResponse == 2) {


        }else {
            System.out.println("Please enter 0, 1, or 2.");
            int numResponse2 = name.nextInt();if (numResponse2 == 0) {
                System.out.println("I hope you like your number!");
            } else if (numResponse2 == 1) {
                System.out.println(fName + " your lucky number is " + LuckyNumber.square(3));
            } else if (numResponse2 == 2);
        }

    }}
