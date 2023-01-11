package org.example;


import java.util.Scanner;

public class BillDisplay extends BillCalculating {
    public static void main(String args[])
    {
        int units;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of units for calculating electricity bill.");
        units = sc.nextInt();

        System.out.println("The electricity bill for "+units+" is:" + getBill(units));
    }
}

