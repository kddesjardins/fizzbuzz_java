/*
A standard FizzBuzz program that counts from 1 to 100 and outputs Fizz for multiples of 3, Buzz for multiples of 5, and FizzBuzz for multiples of both 3 and 5.

Author: Kevin Desjardins
Date: 6/20/2021
*/

class FizzBuzz {
    public static void main(String[] args) {
      for (int i = 1; i <= 100; i++) {
        if (i % 3 == 0 && i % 5 == 0) {
          System.out.println("FizzBuzz");
        }else if (i % 3 == 0) {
          System.out.println("Fizz");
        }else if (i % 5 == 0) {
          System.out.println("Buzz");
        }else {
          System.out.println(i);
        }
      }
    }
  }