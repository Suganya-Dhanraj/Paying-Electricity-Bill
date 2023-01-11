package org.example;

public class BillCalculating {

    static double billToPay;

    static double getBill(long units) {
        if (units < 100) {
            billToPay = units * 1.20;
        } else if (units < 300) {
            billToPay = 100 * 1.20 + (units - 100) * 2;
        }
        else if(units > 300)
        {
            billToPay = 100*1.20+200*2+(units - 300)*3;
        }
        return billToPay;
    }
}

