package com.Aleksey;
import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.PrintWriter;

public class Main {

    public static void main(String[] args) {
        System.out.println("I NEED YOUR NUMBER, GIMME DAT");
        Scanner sc = new Scanner(System.in);
        int number1 = sc.nextInt();
        int number2 = sc.nextInt();
        int sum = number1 + number2;
        int div = number1 - number2;
        BigInteger b1 = BigInteger.valueOf(number1);
        BigInteger b2 = BigInteger.valueOf(number2);
        BigInteger gcd = b1.gcd(b2);
        int lcm = (number2 == number1 || number2 == 1) ? number1 : (number1 == 1 ? number2 : 0);
        if (lcm == 0) {
            int mm = number1, nn = number2;
            while (mm != nn) {
                while (mm < nn) {
                    mm += number1;
                }
                while (nn < mm) {
                    nn += number2;
                }
            }
            lcm = mm;
            System.out.println("summ " + sum + " div " + div + " NOK " + lcm + " NOD " + gcd);
        }
    }
}
