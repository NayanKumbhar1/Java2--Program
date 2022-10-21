package com.infogalaxy;
import java.util.*;

public class QuotientRemainder {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dividend;
        int divisor;
        System.out.println("Enter the Dividend No=");
        dividend = sc.nextInt();
        System.out.println("Enter the divisor No=");
        divisor = sc.nextInt();
        int quotient = dividend / divisor;
        int remainder = dividend % divisor;
        System.out.println("Quotient="+quotient);
        System.out.println("Remainder="+remainder);
    }
}
