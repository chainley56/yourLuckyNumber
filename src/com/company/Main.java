package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {
	// write your code here
        perfectRandom LuckyNumber = new perfectRandom(3);
        System.out.println(LuckyNumber.square(3));
        Scanner name = new Scanner(System.in);
        System.out.println("What is your name?");
        String fName = name.nextLine();
        System.out.println("Nice to meet you "+ fName + ", your lucky number is "+ LuckyNumber);
    }
}
