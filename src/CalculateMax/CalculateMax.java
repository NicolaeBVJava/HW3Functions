package CalculateMax;

import ConsoleRead.ReadN;

public class CalculateMax {
    public static void main(String[] args) {
        System.out.println("The biggest of them all is: " + printMax(3, 1));
        //Mai jos putem calcula maximul pentru mai mult de 3 numere cu ajutorul functiei recursive
        //readIntGreaterThaZero()
        //System.out.print("No. of integers you want to compare: ");
        //System.out.println("The biggest of them all is: " + printMax(ReadN.readIntGreaterThanZero(), 1));
    }

    public static int getMax(int a, int b) {

        return (a > b ? a : b);
    }
    public static int printMax(int howManyIntegers, int startIndex) {
        if (howManyIntegers == 0) {
            return Integer.MIN_VALUE;
        } else {
            System.out.print("Integer no. " + startIndex + " is: ");
            return getMax(ReadN.readInt(), printMax(howManyIntegers - 1, startIndex + 1));
        }
    }
}
