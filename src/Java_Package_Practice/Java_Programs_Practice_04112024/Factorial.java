package Java_Package_Practice.Java_Programs_Practice_04112024;

import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int number = sc.nextInt();
        sc.close();
        long factorial = 1;

        for(int i = 1; i <= number; i++)
        {
            factorial = factorial * i;
        }

        System.out.println("Factorial of " + number + " is: " + factorial);
    }
}
