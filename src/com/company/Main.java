package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner input = new Scanner(System.in);

	//Variables:
        String userHexDigInput = null;
        char hexLetterVal;
        int decimalConversion = 0;
        int firstDivision = 0;
        int secondDivision = 0;
        int thirdDivision = 0;
        int fourthDivision = 0;
        int firstRemainder = 0;
        int secondRemainder = 0;
        int thirdRemainder = 0;
        int fourthRemainder = 0;

    //Block 1: UI
        System.out.println("Please enter a hex digit (0-9 or A-F): ");
        userHexDigInput = input.nextLine();

    //Block 2: Catching invalid input
        if (userHexDigInput.length() != 1) {
            System.out.println("You must enter exactly one hex digit (0-9 or A-F)");
                    System.exit(1);
        }

    //Block 3: Converting hex digit into decimal
        hexLetterVal = Character.toUpperCase(userHexDigInput.charAt(0));
        if ('A' <= hexLetterVal && hexLetterVal <= 'F') {
            decimalConversion = hexLetterVal - 'A' + 10;
        }
        else if (Character.isDigit(hexLetterVal)) {
            //IDE suggested String.valueOf, so not my idea.
            //Function is to return input val of UI input.
            decimalConversion = Integer.parseInt(String.valueOf(hexLetterVal));
        }

    //Block 4: Decimal to binary conversion
        //Almost got stuck here because I forgot it goes down in order. Had Div and Rem separate.
        firstDivision = decimalConversion / 2;
        firstRemainder = decimalConversion % 2;
        secondDivision = firstDivision / 2;
        secondRemainder = firstDivision % 2;
        thirdDivision = secondDivision / 2;
        thirdRemainder = secondDivision % 2;
        fourthDivision = thirdDivision / 2;
        fourthRemainder = thirdDivision % 2;
        //Got stuck on out.print because LSB and MSB. Had to reverse order to fix.
        System.out.println(fourthRemainder + "" + thirdRemainder + "" + secondRemainder
                            + firstRemainder);

    }
}

/*
A lot of this program was copied from pg. 165. I think I just had a hard time with this program
because I couldn't figure out how to output the number in binary form.
I'm still not 100% confident in converting binary/decimal/hexadecimal, but I'm confident I can
write a program that converts all three (given some time, lol).
But yeah...this assignment was a real struggle.
Also, there's already a function to convert any value to binary LOL:
System.out.println(Integer.toBinaryString());
But yeah, I know I had to understand the math first. I still only kinda do.
*/
