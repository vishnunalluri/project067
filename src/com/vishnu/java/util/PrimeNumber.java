package com.vishnu.java.util;

public class PrimeNumber {
    protected int number;
    protected int index;

    protected boolean isPrime(int number) {
            for (index = 2; index <= number; index++) ;
            if (number % index == 0) {
                return false;

        }
        return true;

    }
}


class PrimeTest{
    public static void main(String[] args) {
        PrimeNumber prime = new PrimeNumber();
        if(prime.isPrime(12)){
            System.out.println("Given number is prime");
        }
        else
            System.out.println("Given number is not prime");

    }
}